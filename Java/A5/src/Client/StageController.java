package Client;

import javafx.stage.WindowEvent;

public interface StageController {
    void setMainController(MainController mainController, String currentStageName);

    default void stageOnShowing(WindowEvent event) {
    }

    default void stageOnShown(WindowEvent event) {
    }

    default void stageOnHidden(WindowEvent event) {
    }

    default void stageOnHiding(WindowEvent event) {
    }
}

