package FinalProject;
import java.util.Scanner;

public class RushHour {
	// create a 6x6 grid
	int[][] grid = new int[6][6];
	
	// variables for vehicleNum and rounds for the game
	private int vehicleNum = 1;
	private int gameRound = 0;
	
	// static constants for horizontal and vertical positions
	private final int horizontal = 1;
	private final int vertical = 2;
	
	// flag for while-loop
	private static boolean flag = true;
	
	// declare a static scanner for the whole class
	private static Scanner in = new Scanner(System.in);
	
	public RushHour() { } // default no-arg constructor for the RushHour game class
	
	/** Main Method */
	public static void main(String[] args) {
		System.out.println("Goal is to move the red car (1 1) to the exit labeled as an \'E', past all the cars on the grid.");
		RushHour play = new RushHour();
		play.startVehicles(); 
		System.out.println("Running Game...");
		while(!play.finished()) {  // while game is not finished
			play.controlMovement(); // continue moving the cars
		}
		System.out.println("\nFinished game!");
		System.out.println("\nResults: ");
		if(play.wonGame()) { // only win the game as long as you finish under 10 turns
			System.out.println("You won the game! The red car (1 1) has reached the exit in less than 10 turns.");
		} else {
			System.out.println("Sorry, you have lost the game :(");
		}
	}
	/* Method for creating a winning instance of the RushHour game*/
	public boolean wonGame() { 
		if(grid[2][5] == 1) { // if(grid[grid.length / 2 - 1][grid.length - 1] == 1) {
			return true;
		}
		return false;
	}

	/* Method to state when the game is finished */
	public boolean finished() {
		if(gameRound < 10 && !wonGame()) {
			return false;
		} 
		return true;
	}
	/* Method for generating random vehicle vehicleSizes, with restrictions of vehicleSize 2 for cars and vehicleSize 3 for trucks, on the 6x6 grid */
	public void generateRandomVehicles() {
		int counter = 0;
		while(counter < 5) {
			int vehicleSize = (int)(2 * Math.random()) + 2;
			int vehicleDir = (int)(2 * Math.random()) + 1;
			int row;
			int column;
			if(vehicleDir == horizontal) {
				row = (int)(grid.length * Math.random()); // random rows
				if(row == 2)
					row = 3;
				column = (int)((grid.length - vehicleSize) * Math.random()); // random columns
			} else {
				row = (int)((grid.length - vehicleSize) * Math.random());
				column = (int)(grid.length * Math.random());
			}
			// call to placeVehicle() method, to place the vehicle at the new position as long as the placement is correct, verified by the correctPlacement() method
			if(correctPlacement(vehicleNum, row, column, vehicleDir, vehicleSize)) {
				placeVehicle(vehicleNum, row, column, vehicleDir, vehicleSize);
				vehicleNum++;
				counter++;
			}
		}
	}
	
	/* Method below checks the placement of each vehicle to see if a new car can be placed at that position */
	public boolean correctPlacement(int vehicle, int row, int column, int vehicleDir, int vehicleSize) {
		// check to see if space you are trying to place vehicle isn't occupied already
		// row represents horizontal coordinates, while column represents vertical coordinates
		boolean good = true; // flag control
		// check horizontal positioning
		if (vehicleDir == horizontal) {
			for (int i = column; i < column + vehicleSize; i++) {
				if (i >= grid.length || !(grid[row][i] == 0 || grid[row][i] == vehicle)) {
					good = false;
				}
			}
			// check vertical positioning
		} else if (vehicleDir == vertical) {
			for (int j = row; j < row + vehicleSize; j++) {
				if (j >= grid.length || !(grid[j][column] == 0 || grid[j][column] == vehicle)) {
					good = false;
				}
			}
		}
		return good;
	}
	
	/* Method for placing vehicles on the grid */
	public void placeVehicle(int vehicle, int row, int column, int vehicleDir, int vehicleSize) {
		// if horizontal placement
		if (vehicleDir == horizontal) {
			for (int i = column; i < column + vehicleSize; i++) { // starting at initial y coordinate, as long as i is less than the position of y plus the vehicleSize
				grid[row][i] = vehicle; // assign horizontal position
			}
			// if vertical placement
		} else if(vehicleDir == vertical) {
			for(int j = row; j < row + vehicleSize; j++) { 
				grid[j][column] = vehicle;
			}
		}
	}
	
	/*
	 * Method for setting up the vehicles, choosing random vs custom grid
	 * generation, etc...
	 */
	public void startVehicles() {
		// default position of first car == (1 1)
		placeVehicle(1, 2, 0, 1, 2); // car 1, row 3, column 0, horizontal, length = 2  // (grid.length / 2) - 1
		vehicleNum++; // increment vehicleNum, only 5 vehicles can be added now
		// now place the other cars on the grid
		System.out.println("Do you wish to generate a random grid, or set your own grid?");
		System.out.println("1 = randomize a grid");
		System.out.println("2 = set up own grid");
		char c = in.nextLine().charAt(0);
		if (c == '1') {
			generateRandomVehicles();
		} else if (c == '2') {
			System.out.println("\nFollow the instructions given to place the rest of the vehicles on the grid, the way you want to");
			while (flag) {
				System.out.println(RushHourToString());
				int choice = 2; // default choice
				// menu creation
				do {
					System.out.print("Pick 2 for setting a car, and 3 for setting a truck (picking 1 will exit menu): ");
					choice = in.nextInt();
					if (choice != 1 && choice != 2 && choice != 3) {
						System.out.println("Invalid option, please try again!");
					}
				} while (choice != 1 && choice != 2 && choice != 3);
				if (choice == 1) {
					break; // exit menu
				} else {
					System.out.println("Pick 1 to set vehicle horizontally, and pick 2 to set vehicle vertically: ");
					int vehicleDir = in.nextInt();
					System.out.print("Enter a row for the vehicle from 1-6 (start of vehicle length is beginning): ");
					int row = in.nextInt() - 1;
					System.out.print("Enter a column for the vehicle from 1-6 (start of vehicle length is beginning):");
					int column = in.nextInt() - 1;

					if (!(correctPlacement(vehicleNum, row, column, vehicleDir, choice))) {
						System.out.println("Invalid vehicleSize for the car. Try again.");
					} else {
						placeVehicle(vehicleNum, row, column, vehicleDir, choice);
						vehicleNum++; // increment the number of cars
					}
				}
			}
		}
	}
	/* A controlMovement method for all the input parameters that are part of the vehicleMovement method */
	public void controlMovement() { 
		System.out.println(RushHourToString());
		System.out.print("Choose a vehicle(car or truck): ");
		int vehicle = in.nextInt();
		
		System.out.print("Choose a new row: ");
		int row = in.nextInt() - 1; // transfer row# (1-6) to rowIndex# (0-5)
		
		System.out.print("Choose a new column: ");
		int column = in.nextInt() - 1; // transfer column# (1-6) to columnIndex# (0-5)
		
		System.out.print("Choose the vehicle's direction(1 = horizontal, 2 = vertical): ");
		int vehicleDir = in.nextInt();
		
		System.out.print("\nWhat is vehicle's size (2 for cars, 3 for trucks): ");
		int vehicleSize = in.nextInt();
		
		vehicleMovement(vehicle, row, column, vehicleDir, vehicleSize);
	}
	/* a custom toString method that returns a string representation of the game grid*/
	public String RushHourToString() {
		String str = "Game: \n";
		// create matrix
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j++) {
				// exit conditional - 1) if not at the exit, or another vehicle is occupying the exit 
				if(!(i == 3 && j == grid[2].length - 1) || grid[3][5] != 0) { // //if(!(i == grid.length / 2 && j == grid[2].length - 1) || grid[grid.length / 2][grid.length - 1] != 0) {
					str += grid[i][j] + " ";
				} else {
					str += "E ";
				}
			}
			str += "\n";
		}
		return str;
	} 
	
	
	/* Method to control the movement of the various vehicles on the grid*/
	public void vehicleMovement(int vehicle, int row, int column, int vehicleDir, int vehicleSize) {
		if(!correctPlacement(vehicle, row, column, vehicleDir, vehicleSize)) { // if statement to prevent incorrect placement of vehicle
			System.out.println("Invalid Position: This position conflicts with another vehicle on the grid.");
		} else {
			int oldRow = -1;
			int oldColumn = -1;
			final int boundary = 6;
			for(int i = 0; i < boundary; i++) 
				for(int j = 0; j < boundary; j++) 
					if(oldRow == -1 && grid[i][j] == vehicle) {
						oldRow = i;
						oldColumn = j;
					}
			placeVehicle(0, oldRow, oldColumn, vehicleDir, vehicleSize); // place 0's at the old position of the vehicle
			placeVehicle(vehicle, row, column, vehicleDir, vehicleSize); // place the vehicle at the new position
			gameRound++; // increment the round of the game by 1 each time a vehicle is moved
		}
	}
	
}
