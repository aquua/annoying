package kr.jhpark.annoying.controller

import javafx.fxml.FXML
import javafx.scene.control.Label

class MainController {
    @FXML
    private Label welcomeText

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!")
    }
}