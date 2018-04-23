package Homeworks.Homework3;


// Program to pick 4 random playing cards from a deck of 52 cards and compute their sum

import java.util.*;

public class PickFourCards {
	/** Main Method */
	 public static void main(String[] args){

	        //initialize everything
	        int[] deck = new int[52];
	        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
	        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
	        List<String> pickedCards = new ArrayList<String>();

	        //initialize the cards
	        for(int i = 0; i< deck.length; i ++)
	            deck[i] = i;

	        //shuffle the cards
	        for(int i = 0; i < deck.length; i++){

	            //generate an index randomly
	            int index = (int)(Math.random() * deck.length);
	            int temp = deck[i];
	            deck[i] = deck[index];
	            deck[index] = temp;
	        }

	        //display the four cards
	        for(int i = 0; i < 4; i++){
	            String suit = suits[deck[i] / 13];
	            String rank = ranks[deck[i] % 13];
	            System.out.println(rank + " of " + suit);
	            pickedCards.add(rank);
	        }

	        //initialize Ace Jack Queen King
	        int Ace, Jack, Queen, King;

	        //Assign a point vale to each
	        int[] points = {Ace = 14, Jack = 11, Queen = 12, King = 13};

	        //add the cards together and show output
	        int sum = 0;
	        int jack = 11;
	        int queen = 12;
	        int king = 13;
	        int ace = 14;
	        Iterator<String> iterator = pickedCards.iterator();
	        while(iterator.hasNext()) {

	            String rank = iterator.next();
	            
	            if(rank.equalsIgnoreCase("Jack")){
	            sum = sum+jack;
	        }
	        else if(rank.equalsIgnoreCase("Queen")){
	            sum = sum+queen;
	        }
	        else if(rank.equalsIgnoreCase("King")){
	            sum = sum+king;
	        }
	        else if(rank.equalsIgnoreCase("Ace")){
	            sum = sum+ace;
	        } 
	        else {
	            sum = sum+Integer.parseInt(rank);
	        }
	    }
	    System.out.println("Sum of picked cards is : " + sum);
	}
}

