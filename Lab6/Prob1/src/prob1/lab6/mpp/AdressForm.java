package prob1.lab6.mpp;



import com.sun.org.glassfish.gmbal.NameValue;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AdressForm extends Application{

	public static void main(String[] args)
	{
		Application.launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		
		Label name = new Label("Name");
		grid.add(name, 0, 0);
		TextField nameVal = new TextField();
		nameVal.setPromptText("input a name");
		grid.add(nameVal, 0, 1);
		
		Label street = new Label("Street");
		grid.add(street, 1, 0);
		TextField streetVal = new TextField();
		streetVal.setPromptText("input a street");
		grid.add(streetVal, 1, 1);
		
		Label city = new Label("City");
		grid.add(city, 2, 0);
		TextField cityVal = new TextField();
		cityVal.setPromptText("input a city");
		grid.add(cityVal, 2, 1);
		
		Label state = new Label("state");
		grid.add(state, 0, 2);
		TextField stateVal = new TextField();
		stateVal.setPromptText("input a state");
		grid.add(stateVal, 0, 3);
		
		Label zip = new Label("zip");
		grid.add(zip, 1, 2);
		TextField zipVal = new TextField();
		zipVal.setPromptText("input a zip");
		grid.add(zipVal, 1, 3);
		
		Button btn = new Button("Submit");
		HBox hbBtn = new HBox(10);
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn.getChildren().add(btn);
		grid.add(hbBtn, 2, 4);
		btn.setOnAction(c->{
			System.out.println(nameVal.getText());
			System.out.println(streetVal.getText());
			System.out.printf("%s,%s %s",cityVal.getText(),stateVal.getText(),zipVal.getText());
			}
		);

		
		Scene scene = new Scene(grid, 600, 200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Adress Form");
		primaryStage.sizeToScene();
		primaryStage.show();
	}

}
