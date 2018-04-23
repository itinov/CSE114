package FinalProject;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class RushHourUI extends Application {
	
	// creating an array of buttons
	Button[][] gameButtons = new Button[6][6];
	
	// creating a series of textfields to input vehicle#, row#, column#, direction, and size of vehicle
	TextField vehicle = new TextField("Vehicle");
	TextField row = new TextField("Row");
	TextField column = new TextField("Column");
	TextField vehicleDir = new TextField("Direction");
	TextField vehicleSize = new TextField("Size");

	/** Main Method */
	public static void main(String[] args) {
		// launch game
		launch(args);

	}

	/** Excecute Stage Method */
	public void start(Stage primaryStage) throws Exception {
		// call RushHour constructor to initialize game
		RushHour play = new RushHour();
		
		// create a grid for the game using javaFX GridPane
		GridPane grid = new GridPane();
		grid.setPrefSize(600, 600);
		// make grid lines visible as borders for each row/column element
		grid.setGridLinesVisible(true);
		// call the startVehicles method from the RushHour class
		play.startVehicles();
		
		// create a grid of buttons
		for(int i = 0; i < 6; i++) { // rows
			for(int j = 0; j < 6; j++) {  // columns
				// create a new matrix of buttons
				gameButtons[i][j] = new Button("" + play.grid[i][j]);
				// button properties
				gameButtons[i][j].setFont(Font.font(24));
				gameButtons[i][j].setTextFill(Color.RED);
				gameButtons[i][j].setPrefSize(100, 100);
				grid.add(gameButtons[i][j], j, i);
			}
		}
		// assign a button to run the game every turn
		Button run = new Button("Run");
		// button properties
		run.setFont(Font.font(18));
		run.setTextFill(Color.RED);	
		// set run button action
		run.setOnAction(x -> {
			play.vehicleMovement(Integer.parseInt(vehicle.getText()),
								Integer.parseInt(row.getText()) - 1,
								Integer.parseInt(column.getText()) - 1,
								Integer.parseInt(vehicleDir.getText()),
								Integer.parseInt(vehicleSize.getText()));
			for(int i = 0; i < 6; i++) {
				for(int j = 0; j < 6; j++) {
					gameButtons[i][j].setText(""+play.grid[i][j]);
					gameButtons[i][j].setFont(Font.font(24));
					gameButtons[i][j].setTextFill(Color.RED);
					gameButtons[i][j].setPrefSize(100, 100);
				}
			}
		});
		// create a new VBox
		VBox vbox = new VBox();
		
		Button t = new Button("Rush Hour Game"
				+ "\nIvan Tinov"
				+ "\nID#110255332" + "\nCSE 114, Paul Fodor");
		t.setFont(Font.font(12));
		t.setTextFill(Color.RED);
		// set button t action
		t.setOnAction(r1 -> {
			 Stage instructions = new Stage(); // Create a new stage
			 instructions.setTitle("How to Play Rush Hour"); // Set the stage title
			 instructions.setScene(new Scene(new Button("Rush Hour Game:" + "\nGoal is to move the rest of the vehicles around the " 
			 + "\nred car so that you can free up a path that enables " 
			 + "\nthe red car to reach the exit." + "\nOnce you reach the exit, you have won the game!" 
			 + "\nThe exit is represented as the black rectangle at row 2 column 5."
			 + "\nRules: " 
			 + "\nInput a car value from 1-6." 
			 + "\nPick a row value to place the car from 1-6." 
			 + "\nPick a column value to place the car from 1-6." 
			 + "\nChoose 1 for horizontal, and 2 for vertical placement." 
			 + "\nThe size of a car = 2." 
			 + "\nThe size of a truck = 3."), 400, 400));
			 instructions.show(); // Display the stage
		});
		
		// if statement for creating a new window with text to tell the user that he/she has won
		if(play.wonGame() == true) {
			 Stage hasWon = new Stage(); // Create a new stage
			 hasWon.setTitle("You Won!!!"); // Set the stage title
			 hasWon.setScene(new Scene(new Button("Congradulations, You Beat The Game (: !"),400, 400));
			 hasWon.show(); // Display the stage
		}
		
		vbox.getChildren().add(t);
		vbox.setAlignment(Pos.TOP_CENTER);
		t.setTextFill(Color.BLACK);
		
		// position of the grid
		grid.setAlignment(Pos.CENTER);
		vbox.getChildren().add(grid);
		
		// create a new HBox
		HBox hbox = new HBox();
		hbox.getChildren().add(vehicle);
		hbox.getChildren().add(row);
		hbox.getChildren().add(column);
		hbox.getChildren().add(vehicleDir);
		hbox.getChildren().add(vehicleSize);
		hbox.getChildren().add(run);
		
		vbox.getChildren().add(hbox);
		
		// create scene, set title, set scene, and show scene
		Scene scene = new Scene(vbox, 1280, 720);
		primaryStage.setTitle("Rush Hour");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
}



