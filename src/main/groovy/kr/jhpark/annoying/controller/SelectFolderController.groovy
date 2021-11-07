package kr.jhpark.annoying.controller

import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.scene.layout.BorderPane
import javafx.stage.DirectoryChooser
import javafx.stage.FileChooser
import javafx.stage.Stage

class SelectFolderController {
    @FXML
    private BorderPane folderMainPanes;

    @FXML
    void selectFoldHandler(ActionEvent event) {

        Stage stage = (Stage) folderMainPanes.getScene().getWindow();

        DirectoryChooser fil_chooser = new DirectoryChooser();
        fil_chooser.setTitle("Select File");
        File file = fil_chooser.showDialog(stage);

        println(file.toString())
    }

    private void sel(){

//        // set title
//
//
//        // set initial File
//        fil_chooser.setInitialDirectory(new File("e:\\"));
//
//        EventHandler<ActionEvent> event =
//                new EventHandler<ActionEvent>() {
//
//                    public void handle(ActionEvent e)
//                    {
//
//                        // get the file selected
//                        File file = fil_chooser.showOpenDialog(stage);
//
//                        if (file != null) {
//                            label.setText(file.getAbsolutePath()
//                                    + "  selected");
//                        }
//                    }
//                };
//
//        button.setOnAction(event);
    }

}
