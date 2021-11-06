package kr.jhpark.annoying.controller;

import com.jfoenix.controls.JFXButton
import groovy.transform.CompileStatic;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

@CompileStatic
public class MainController {

    @FXML
    private BorderPane layoutHome;

    @FXML
    private JFXButton changeFolderHandle;

    @FXML
    private JFXButton changeFileHandle;

    @FXML
    void handleChangeFile(ActionEvent event) {
        loadPage("file_home")

    }

    @FXML
    void handleChangeFolder(ActionEvent event) {
        loadPage("folder_home")
    }

    private void loadPage(String xmlName){
        try{
//            FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/kr/jhpark/annoying/Item.fxml")));
            def path = getClass().getResource("/kr/jhpark/annoying/${xmlName}.fxml")
            Parent root = FXMLLoader.load(path)
            layoutHome.setCenter(root)
        }catch (Exception e){
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
