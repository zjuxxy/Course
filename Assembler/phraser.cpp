#include "phraser.h"
#include <assembler.h>
#include <QTextDocument>
#include <QRegularExpression>
#include <QtDebug>
Phraser::Phraser(QObject *parent)
    :QObject(parent),Document(nullptr)
{

}

void Phraser::setDocument(const QTextDocument *document)
{
    if(document)
        Document = document;
}

void Phraser::Build(QByteArray &data)
{
    if(!Document)
        return;
    data.fill('\0');
    QString source = Document->toPlainText();
    source.replace(QRegularExpression("(//|#).*(\\n|$)"),"\\2");
    QRegularExpression reg
            ("\\s*((?<mark>\\b\\w+\\b):)?\\s*"
             "(?<inst>\\b\\w+\\b)[^\\S\\r\\n]*"
             "((?<arg1>\\$?\\b\\w+\\b)\\s*"
             "(,\\s*(?<arg2>\\$?\\b\\w+\\b)\\s*"
             "((,\\s*(?<arg3>\\$?\\b\\w+\\b))|"
             "\\((?<arg4>\\$?\\b\\w+\\b)\\)\\s*)?"
             ")?)?"
             "(;)?",QRegularExpression::MultilineOption);
    auto start = reg.globalMatch(source);
    unsigned markCount = 0;
    for(auto i = start; i.hasNext(); markCount++)
    {
        auto match = i.next();
        if(!match.captured("mark").isEmpty())
            MarkList.insert(match.captured("mark"),markCount);
    }
    for(Count = 0; start.hasNext(); ++Count)
    {
        auto match = start.next();
        QString inst = match.captured("inst");
        QString arg1 = match.captured("arg1");
        QString arg2 = match.captured("arg2");
        QString arg3 = match.captured("arg3");
        if(arg3.isEmpty())
            arg3 = match.captured("arg4");
        data.replace(Count * 4,4,assembler.build(inst,arg1,arg2,arg3,Count,MarkList));
    }
    emit BuildDone();
}
