package edu.mum.cs.cs401.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


/**
 * Created by Administrator on 2016/9/15 0015.
 */
public class LoginController {
    @FXML private TextField name;
    @FXML private TextField password;
    @FXML private void login(ActionEvent event)throws Exception
    {
        System.out.println("login"+name.getText()+password.getText());
        Scene scene=name.getScene();
        scene.setRoot(FXMLLoader.load(getClass().getResource("../UI/AdminUI.fxml")));
    }
}
