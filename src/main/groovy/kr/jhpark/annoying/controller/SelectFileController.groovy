package kr.jhpark.annoying.controller

import groovy.transform.CompileStatic
import javafx.collections.FXCollections
import javafx.collections.ObservableList
import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.TableColumn
import javafx.scene.control.TableView
import javafx.scene.control.cell.PropertyValueFactory
import javafx.scene.layout.BorderPane
import javafx.stage.DirectoryChooser
import javafx.stage.Stage
import kr.jhpark.annoying.model.FileTableData

@CompileStatic
class SelectFileController implements Initializable{

    private ObservableList<FileTableData> data;
    @FXML
    private BorderPane fileMainPanes;
    @FXML
    private TableView<FileTableData> tableView;
    @FXML
    private TableColumn<FileTableData, String> beforechange;

    @FXML
    private TableColumn<FileTableData, String> afterchange;

    @FXML
    void selectFoldHandler(ActionEvent event) {

        Stage stage = (Stage) fileMainPanes.getScene().getWindow();

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
        data.clear()
        Map<File, List<File>> dataViewFileList = [:]
        dirList.each {
            File dir = it
            def list = dataViewFileList.get(dir, [])
            dir.eachFileRecurse {
//                list.add(it)
                data.add(new FileTableData(it.name, it.name))
            }
        }

    }

    @Override
    void initialize(URL location, ResourceBundle resources) {
        beforechange.setCellValueFactory(new PropertyValueFactory<>("before"))
        afterchange.setCellValueFactory(new PropertyValueFactory<>("after"))
        data = FXCollections.observableArrayList()
        tableView.setItems(data)
    }
}
