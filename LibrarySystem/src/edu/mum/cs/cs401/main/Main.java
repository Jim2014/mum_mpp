package edu.mum.cs.cs401.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../UI/SignUpUI.fxml"));
        primaryStage.setTitle("Library System");
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();
    }



}
