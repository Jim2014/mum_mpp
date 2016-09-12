package prob2.lab6.mpp;



import java.util.List;

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

public class StringUtility extends Application{

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
		
		Label input = new Label("Input");
		grid.add(input, 1, 0);
		TextField inputVal = new TextField();
		inputVal.setPromptText("input a string");
		grid.add(inputVal, 1, 1);
		
		Label output = new Label("Output");
		grid.add(output, 1, 2);
		TextField outputVal = new TextField();
		grid.add(outputVal, 1, 3);
		
	
		
		Button btnCount = new Button("Count Letters");
		HBox hbBtnCount = new HBox(10);
		hbBtnCount.setAlignment(Pos.BOTTOM_CENTER);
		hbBtnCount.getChildren().add(btnCount);
		grid.add(hbBtnCount, 0, 0);
		btnCount.setOnAction(c->{
			String inVal=inputVal.getText();
			outputVal.setText(String.format("%d", inVal.length()));
			}
		);
		
		
		Button btnReverse = new Button("Reverse Letters");
		HBox hbBtnReverse = new HBox(10);
		hbBtnReverse.setAlignment(Pos.BOTTOM_CENTER);
		hbBtnReverse.getChildren().add(btnReverse);
		grid.add(hbBtnReverse, 0, 1);
		btnReverse.setOnAction(c->{
			String inVal=inputVal.getText();
			char[] outChars = new char[inVal.length()];
			for(int i=0;i<inVal.length();i++)
				outChars[i]=inVal.charAt(inVal.length()-i-1);
			System.out.println(outChars);
			outputVal.setText(new String(outChars));
			}
		);
		
		Button btnRemoveDup = new Button("Remove Duplicates");
		HBox hbBtnRemoveDup = new HBox(10);
		hbBtnRemoveDup.setAlignment(Pos.BOTTOM_CENTER);
		hbBtnRemoveDup.getChildren().add(btnRemoveDup);
		grid.add(hbBtnRemoveDup, 0, 2);
		btnRemoveDup.setOnAction(a->{
			String inVal=inputVal.getText();
			StringBuffer outStr = new StringBuffer();
			for(int i=0;i<inVal.length();i++)
			{
				boolean find=false;
				char c=inVal.charAt(i);
				for(int j=0;j<outStr.length();j++)
				{
					if(c==outStr.charAt(j)){
						find=true;
						break;
					}
				}
				if(!find)
					outStr.append(c);
			}
			outputVal.setText(outStr.toString());
			}
		);

		
		Scene scene = new Scene(grid, 600, 200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Adress Form");
		primaryStage.sizeToScene();
		primaryStage.show();
	}

}
