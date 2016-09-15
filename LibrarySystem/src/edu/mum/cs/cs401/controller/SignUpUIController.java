package edu.mum.cs.cs401.controller;

import edu.mum.cs.cs401.entity.Person;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;


/**
 * Created by Administrator on 2016/9/15 0015.
 */
public class SignUpUIController {
    @FXML private TextField name;
    @FXML private TextField password;
    @FXML private ComboBox<String> role;

    @FXML private void login(ActionEvent event)throws Exception
    {
           System.out.println("role"+ role.getValue());
//        Scene scene=name.getScene();
//        scene.setRoot(FXMLLoader.load(getClass().getResource("../UI/AdminUI.fxml")));
    }

}
