package Homeworks.Homework3;
/*  CSE 114 Summer 2017, Paul Fodor
 *  Ivan Tinov
 *  ID# 110255332
 *  Homework 3
 */

/* Implementation of classical coupon collector problem where in this case
 * the problem is to see how many times it takes to pick a specific set of cards
 * from a shuffled deck of 52 playing cards in which there is one of each suit.
 * 
*/
public class CouponCollector {
	/** Main Method */
	public static void main(String[] args) {
		// variables
		boolean spades = false;
		boolean hearts = false;
		boolean diamond = false;
		boolean clubs = false;
		// create a string of 4 cards
		String[] cardSequence = new String[4];
		int index = 0; // count starts at 0
		int pickCount = 0;
		while (!spades || !hearts || !diamond || !clubs) { // there can only be 1 of each suit

			String card = revealCard(getCard());
			pickCount++;

			if (card.contains("Spades") && !spades) { // 1 spade, no doubles
				cardSequence[index++] = card;
				spades = true;
			} else if (card.contains("Hearts") && !hearts) {
				cardSequence[index++] = card;
				hearts = true;
			} else if (card.contains("Diamond") && !diamond) {
				cardSequence[index++] = card;
				diamond = true;
			} else if (card.contains("Clubs") && !clubs) {
				cardSequence[index++] = card;
				clubs = true;
			}

		}

		for (int i = 0; i < cardSequence.length; i++) {
			System.out.println(cardSequence[i]);
		}
		System.out.println("Pick count = " + pickCount);

	}
	/** getCard Method to obtain random deck of 52 cards from 0-51 */
	public static int getCard() {
		return (int) (Math.random() * 52);
	}
	/** revealCard method to assign each card */
	public static String revealCard(int cardNum) {
		// create suit and ranks
		String[] suit = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

		int suitNum = cardNum / 13;
		int rankNum = cardNum % 13;

		return ranks[rankNum] + " of " + suit[suitNum];

	}
}