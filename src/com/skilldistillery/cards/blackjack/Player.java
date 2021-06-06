package com.skilldistillery.cards.blackjack;

import java.util.List;
import java.util.Scanner;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Person;

public class Player {
	// Fields
	private BlackjackHand playerHand = new BlackjackHand(); // the player's hand
	// private Dealer dealer = new Dealer(); // initializes the player's dealer
	private Scanner sc = new Scanner(System.in); // initializes a scanner for user input

	// Constructors
	public Player() {
//		for(int i = 0; i < 2; i ++) {
//			this.addToHand(dealer.dealHand()); //starting hand dealt to player
//			dealer.addToHand(); //adds card to dealer's hand
//		}
	}

	// Methods

	public int playerInput() {
		int userInput = 0;
		try {
			userInput = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Sneaky hobbitses");
		}
		sc.nextLine();
		return userInput;

	}
	public boolean playAgain() {
		//Overloaded method
		try {
			String userInput = sc.nextLine();
			if (userInput.contains("Y") || userInput.contains("y")){
				return true;
			}				
			else if (userInput.contains("N") || userInput.contains("n")){
				return false;
			}
				
		} catch (Exception e) {
			System.out.println("Sneaky hobbitses");
			System.out.println("Try entering 'Y' or 'N' ");
			
		}
		
		return false;
		
	}


	// winnerOutcome(playerHand.getHandValue(),dealer.getHandValue());
	// dealer.fold();

	public void addToHand(Card card) { // get a card from the dealer class
		playerHand.addCard(card);
	}

	public void holdHand() { // no cards added, display value
		playerHand.displayHand();

	}

	public void fold() {

		playerHand.fold();
	}

	public int getHandValue() { // passes value from playerHand
		return playerHand.getHandValue();
	}

	public List<Card> getCards() {
		return playerHand.getCards();
	}

	public void displayHand() {
		playerHand.displayHand();
	}
}
