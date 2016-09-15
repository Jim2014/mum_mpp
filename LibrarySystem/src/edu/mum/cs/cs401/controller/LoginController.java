package edu.mum.cs.cs401.controller;

import edu.mum.cs.cs401.dataaccess.DataBase;
import edu.mum.cs.cs401.entity.Person;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


/**
 * Created by Administrator on 2016/9/15 0015.
 */
public class LoginController {

    @FXML private TextField name;
    @FXML private PasswordField password;
    @FXML private Label error;
    @FXML private void login(ActionEvent event)throws Exception
    {
        System.out.println("login"+name.getText()+password.getText());
        Person person= DataBase.userTable.get(name.getText());
        if(person==null||!person.getPassword().equals(password.getText()))
        {
            error.setText("Name or password is error!");
            return;
        }

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../UI/MainUI.fxml"));
        Scene scene=name.getScene();
        scene.setRoot(fxmlLoader.load());

        MainController controller = fxmlLoader.getController();
        controller.enable(person);

    }
}
