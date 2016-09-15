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
    @FXML private Button CheckOutBook;
    @FXML private Label error;
    @FXML private void ShowAdminUI(ActionEvent event)throws Exception
    {
        error.setText("");
        String loginRole=LoginController.GetLoginPerson().getRole();
        if(!loginRole.equals(Person.ADMINLIBRARIAN)&&!loginRole.equals(Person.ADMIN))
        {
            error.setText("You have no permit to AdminUI!");
            return;
        }
        content.getChildren().clear();
        content.getChildren().add(FXMLLoader.load(getClass().getResource("../UI/AdminUI.fxml")));
    }

    @FXML private void ShowAddBookUI(ActionEvent event)throws Exception
    {
        String loginRole=LoginController.GetLoginPerson().getRole();
        if(!loginRole.equals(Person.ADMINLIBRARIAN)&&!loginRole.equals(Person.ADMIN))
        {
            error.setText("You have no permit to AddBookUI!");
            return;
        }
        error.setText("");
        content.getChildren().clear();
        content.getChildren().add(FXMLLoader.load(getClass().getResource("../UI/AddBookUI.fxml")));
    }
    @FXML private void ShowCheckoutBook(ActionEvent event)throws Exception
    {
        String loginRole=LoginController.GetLoginPerson().getRole();
        if(!loginRole.equals(Person.ADMINLIBRARIAN)&&!loginRole.equals(Person.LIBRARIAN))
        {
            error.setText("You have no permit to CheckoutBookUI!");
            return;
        }
        error.setText("");
        content.getChildren().clear();
        content.getChildren().add(FXMLLoader.load(getClass().getResource("../UI/CheckOutBookUI.fxml")));
    }
}
