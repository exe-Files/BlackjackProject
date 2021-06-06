package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Person;

public class Player2  {
	//Fields
	private BlackjackHand playerHand = new BlackjackHand(); // the player's hand
	private Dealer dealer = new Dealer(); // initializes the player's dealer
	private Scanner sc = new Scanner(System.in); //initializes a scanner for user input
	
	//Constructors
	public Player2() {
		for(int i = 0; i < 2; i ++) {
			this.addToHand(dealer.dealHand()); //starting hand dealt to player
			dealer.addToHand(); //adds card to dealer's hand
		}
	}
	
	//Methods
	
	public void playerInput() {
		int userInput = 0;
		while (playerHand.getHandValue() < 21 && userInput != 2) {
			try {
				showMenu();
				userInput = sc.nextInt();
				menuSwitch(userInput);
			}
			catch(Exception e) {
				System.out.println("Sneaky hobbitses");
			}
				
		}
		System.out.println("You have " +playerHand.getHandValue());
		dealer.turn();
		System.out.println("Dealer has " + dealer.getHand());
		if (playerHand.getCards().size() == 2 && playerHand.getHandValue() == 21) {
			System.out.println("Blackjack!");
		}
		winnerOutcome(playerHand.getHandValue(),dealer.getHand());
		dealer.fold();
	}


	public void addToHand(Card card) { // get a card from the dealer class
		playerHand.addCard(card);
	}
	

	public void holdHand() { // no cards added, display value
		playerHand.displayHand();

	}

	public void fold() {
		System.out.println("You decided that's enough gambling for today.");
		System.out.println("+1 Perspective");
	}

	public int getHand() {
		// TODO Auto-generated method stub
		return 0;
	}

}
