package edu.mum.cs.cs401.main;

import edu.mum.cs.cs401.dataaccess.DataBase;
import edu.mum.cs.cs401.entity.Address;
import edu.mum.cs.cs401.entity.Person;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Main extends Application {
    public static void main(String[] args) {
        List<Address> addresses= new ArrayList<Address>();
        Address address=new Address("1000 N","Fairfield","IA","52557");

        Person person1=new Person("user1","user1","admin",addresses,"641-123-123",Person.ADMIN);
        person1.setPassword("user1");
        DataBase.userTable.add("user1",person1);

        Person person2=new Person("user2","user2","LIBRARIAN",addresses,"641-123-123",Person.LIBRARIAN);
        person2.setPassword("user2");
        DataBase.userTable.add("user2",person2);

        Person person3=new Person("user3","user3","ADMINLIBRARIAN",addresses,"641-123-123",Person.ADMINLIBRARIAN);
        person3.setPassword("user3");
        DataBase.userTable.add("user3",person3);

        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../UI/LoginUI.fxml"));
        primaryStage.setTitle("Library System");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }



}
