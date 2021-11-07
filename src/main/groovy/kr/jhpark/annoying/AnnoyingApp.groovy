package kr.jhpark.annoying

import groovy.transform.CompileStatic
import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.text.Font
import javafx.stage.Stage
@CompileStatic
class AnnoyingApp extends Application {

    @Override
    void start(Stage stage) {
        System.setProperty("prism.lcdtext", "false");
        Font font = Font.loadFont(getClass().getResourceAsStream("font/Roboto-Regular.ttf"), 10);

        println font.family
        def fxmlLoader = new FXMLLoader(AnnoyingApp.class.getResource("home.fxml"))
        def scene = new Scene(fxmlLoader.load() as Parent)
        stage.setTitle("Hello!")
        stage.setScene(scene)
        stage.show()
    }

    static void main(String[] args) {
        launch(AnnoyingApp)
    }
}
