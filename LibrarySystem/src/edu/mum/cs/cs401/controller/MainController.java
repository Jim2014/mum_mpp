package edu.mum.cs.cs401.controller;

import edu.mum.cs.cs401.entity.Person;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import sun.rmi.runtime.Log;


/**
 * Created by Administrator on 2016/9/15 0015.
 */
public class MainController {
    @FXML private Pane content;
    @FXML private Button CheckOutBookBtn;
    @FXML private Button AddBookBtn;
    @FXML private Button AdminBtn;
    @FXML private Label info;
    @FXML private void ShowAdminUI(ActionEvent event)throws Exception
    {
        content.getChildren().clear();
        content.getChildren().add(FXMLLoader.load(getClass().getResource("../UI/AdminUI.fxml")));
    }

    @FXML private void ShowAddBookUI(ActionEvent event)throws Exception
    {
        content.getChildren().clear();
        content.getChildren().add(FXMLLoader.load(getClass().getResource("../UI/AddBookUI.fxml")));
    }
    @FXML private void ShowCheckoutBook(ActionEvent event)throws Exception
    {
        content.getChildren().clear();
        content.getChildren().add(FXMLLoader.load(getClass().getResource("../UI/CheckOutBookUI.fxml")));
    }

    @FXML private void Logout(ActionEvent event)throws Exception
    {
       content.getScene().setRoot((FXMLLoader.load(getClass().getResource("../UI/LoginUI.fxml"))));
    }
    public void enable(Person loginPerson)
    {
        info.setText("Welcome "+loginPerson.getFirstName()+" "+loginPerson.getLastName());
        String loginRole=loginPerson.getRole();
        if(loginRole.equals(Person.ADMINLIBRARIAN))
        {
            AddBookBtn.setDisable(false);
            AdminBtn.setDisable(false);
            CheckOutBookBtn.setDisable(false);
        }
        else if(loginRole.equals(Person.ADMIN))
        {
            AddBookBtn.setDisable(false);
            AdminBtn.setDisable(false);
            CheckOutBookBtn.setDisable(true);
        }
        else if(loginRole.equals(Person.LIBRARIAN))
        {
            AddBookBtn.setDisable(true);
            AdminBtn.setDisable(true);
            CheckOutBookBtn.setDisable(false);
        }
        else
        {
            AddBookBtn.setDisable(true);
            AdminBtn.setDisable(true);
            CheckOutBookBtn.setDisable(true);
        }

    }
}
