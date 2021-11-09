package kr.jhpark.annoying.controller

import groovy.transform.CompileStatic
import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.scene.layout.BorderPane
import javafx.stage.DirectoryChooser
import javafx.stage.FileChooser
import javafx.stage.Stage

@CompileStatic
class SelectFolderController {

    @FXML
    private BorderPane folderMainPanes;

    @FXML
    void selectFoldHandler(ActionEvent event) {

        Stage stage = (Stage) folderMainPanes.getScene().getWindow();

        DirectoryChooser fil_chooser = new DirectoryChooser();
        fil_chooser.setTitle("Select File");
        def file = fil_chooser.showDialog(stage) as File
        def dirList = []
        file.eachFileRecurse {
            if (it.isDirectory()) {
                dirList.add(it)
            }
        }
        makeFileMap(dirList)
    }


    private void makeFileMap(List<File> dirList) {
        Map<File, List<File>> dataViewFileList = [:]
        dirList.each {
            File dir = it
            def list = dataViewFileList.get(dir, [])
            dir.eachFileRecurse {
                list.add(it)
            }
        }
        println dataViewFileList
    }

}
