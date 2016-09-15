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

        Person person1=new Person("admin","Jin","Zhou",addresses,"641-123-123",Person.ADMIN);
        person1.setPassword("admin");
        DataBase.userTable.add("admin",person1);

        Person person2=new Person("admin1","Jin","Zhou",addresses,"641-123-123",Person.ADMINLIBRARIAN);
        person2.setPassword("admin1");
        DataBase.userTable.add("admin1",person2);

        Person person3=new Person("librarian","Jin","Zhou",addresses,"641-123-123",Person.LIBRARIAN);
        person3.setPassword("librarian");
        DataBase.userTable.add("librarian",person3);

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
