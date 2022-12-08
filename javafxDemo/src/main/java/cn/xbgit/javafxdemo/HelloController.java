package cn.xbgit.javafxdemo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * @author zhang_tb
 */
public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}