# Welcome to Homework managemer.
This is its manual helping you to use the system easily and conveniently.

## Description:

In this system, every user, including administrator, teachers and students, should be given an exclusive number, which is called id, to identfiy and login.
The only administrator account own the only id 0. Teachers' and students' accounts share the same id pool. So in order to avert a teacher and a student have the same id, arrange teachers and students a certain prefix number is a good solution.
This system is control by command. All kind of users have different authority to executive every command. All commands and their avaliable users will be introduced and listed after.

The first time to lunch the system, user will be required to enter the information (id, name and password) of the Administrator account. Then in the same folder, an directory named "hwmgr" will be created.
Each account includes id, name, usertype, and password; each course includes id and name; each assignment includes id.

## Authorize

Administrator account has the authority to add, delete, modify a certain teacher account with id. Also can list all or part of teacher accounts. Besides, Administrator account has the authority to add or delete a course. And for each existing course, Administrator account has the authority to bind certain teachers with id so that those teacher binded get the authority to manage this course. It's notable that though it is Administrator account it does NOT own the authority to manage student accounts and further authority towards course.

Teachers accounts have the authority to add, delete and list student accounts. Also they can release and edit course info, which is a text file in the course folder. In the course the teacher is binded with, he can bind some existing students with the course, which cannot be done by the Administrator account. Besides, they can arrange or delte homework and experiment, which are called assignment in the system, to the students who have to finish them. Each assignments have its requirement and it can be edited by teacher account.

Student accounts only have the authority to check all his assignments' status and finish a certain assignment, whose requirement can be checked by students.

## Commands

This section will list all the commands avaliable in the system. Arguments with [] can be omited and it will be asked to enter after executing the command.
`(script name) [id]`
(script name) means the system script's name. When lunch with argument id, you can skip the step to enter the account id you are going to login. It's the same to execute login [id]. More information please refer to login.

1. `login [id]`
   Available for all accounts. Login in a certain account with id. If you enter the wrong password the first time, you will be ask to enter the id again.

2. `addtch`, `addstu`
   addtch is available for Administrator account and addstu is available for teacher accounts. Add new teacher/student accounts. After entering id, you have to enter the name and password of the new account. You can add more than one user at one time until you enter the user id with 0.

3. `deltch [id]`, `delstu [id]`

   deltch is available for Administrator account and delstu is available for teacher accounts. Delete an existing teacher/student account with id. Out of security, you can only delete one account at one time.

4. `chadmin`
   Available for the Administrator account. Change the information (name and password) of the Administrator account. All information that is asked to input will not change if you input nothing.

5. `chtch [id]`, `chstu [id]`
   chtch is available for Administrator account and chstu is available for teacher accounts. Change the information (name and password) of a teacher/student account with id. Out of security, you can only change one account at one time. More information please refer to chadmin.

6. `lstch [id...]`, `lsstu [id...]`

   lstch is available for Administrator account and lsstu is available for teacher accounts. List the teacher/student accounts with the id privided or all of them if no id privided.

7. `addcrse [id]`
   Available for the Administrator account. Add a course with id and create its folder. This id cannot be deplicate, but it does not share the id pool of account id. Out of security, you can add one course at one time.

8. `delcrse [id]`
   Available for the Administrator account. Delete a course with id and its folder. Out of security, you can only delete one course at one time.

9. `chcrse [id]`
   Available for the Administrator account. Change the name of the course with the privided id. Out of security, you can only change one course at one time. 

10. `lscrse [id...]`

   Available for all accounts. List, but without course information, the courses with the id privided or all courses if no id privided.

11. `bindtch [id]`, `bindstu [id]`
    bindtch is available for Administrator account and bindstu is available for teacher accounts. Bind more than one teacher/student with the course with the privided id. You can keep binding until you enter the user id 0. Only teachers binded with the course can edit the course's information (exclude its name) and arrange assignments in the course. Only students binded with the course can finish the assignments in it.

12. `unbindtch [id]`, `unbindstu [id]`
    unbindtch is available for Administrator account and unbindstu is available for teacher accounts. Unind more than one teacher/student with the course with the privided id. You can keep unbinding until you enter the user id 0. More information please refer to bindtch.

13. `lsbind [id]`
    Available for the Administrator and teacher accounts. For the Administrator account, it lists all the teachers binded in the course with the privided id. For teacher accounts, it lists all the student accounts binded instead. 

14. `editinfo [id]`

    Available for teacher accounts. Create/edit the information (exclude the name) of the course with the privided id.

15. `mycrse`
    Available for all accounts. List all the course you are binded with without course information.

16. `crseinfo [id...]`
    Available for all accounts. List the information (exclude the name) of all the course you are binded with or all the course with the privided id.

17. `arrasg [id] [id2]`
    Available for teacher accounts. Arrange a new or edit an existing assignment with id2 of the course with id. Assignment id should be exclusive but its pool can only be shared in one course. So two assignments can own the same id when they are in different courses. You have to edit the detail of the assignment.

18. `delasg [id] [id2]`
    Available for teacher accounts. Delete an existing assignment with id2 of the course with id.

19. `lsasg [id]`
    Available for teacher accounts. List all the assignments without detail of the course with the privided id.

20. `asginfo [id] [id2]`
    Available for all accounts. List the assignment information with id of the course with id. If id is not privided, list all the assignments' information of all the courses you are in. If id2 is not privided, list all assignments' information of the course with the privided id.

21. `printasg [id] [id2] [id3]`
    Available for teacher accounts. Print the students' assignments with id2 of the course of id. If id3 is privided, only print the assignment of student with id3. Otherwise, it will not ask you to enter the student's id and print all the students' assignment in the course. If a student did not handed in his assignment, print a warning message instead.

22. `editasg [id][id2]`
    Available for student accounts. Edit an existing assignment or create a new assignment with id2 of the course id. Once the assignment file saved, the assignment status will be changed to Done instead of Not done.

23. `checkasg`
    Available for student accounts. Check all the assignment you have to finish. It only print the status of the assignment. If you have to read its deltail, please use asginfo.

24. `passwd`
    Available for all accounts. Change the password of your account. Enter empty password to cancel the operation. After changing the password, you have to login with the new password again.

25. `help`
    Available for all accounts. Show the readme document.

26. `clear`
    Available for all accounts. Clear the screen.

27. `exit`
    Available for all accounts. Exit the system.

## Available commands for each kind of account:

### Administrator:

> login, chadmin, chcrse, addtch, deltch, chtch, lstch, addcrse, lscrse, delcrse, bindtch, unbindtch, lsbind, passwd, clear, help, exit

Note: Though mycrse, crseinfo, asginfo are available for all accounts, it is meanless for Administrator account becasue Administrator account cannot bind with any course.

### Teachers:

> login, addstu, delstu, lstsu, chstu,  bindstu, unbindstu, lsbind, editinfo, mycrse, crseinfo, arrage, delasg, lsasg, asginfo, printasg, passwd, help, clear, exit

### Student:

> login, mycrse, crseinfo, asginfo, editasg, checkasg, passwd, help, clear, exit

Thank you for your reading.
