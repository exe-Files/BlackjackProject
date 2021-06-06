package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Person;

public class Player implements Person {
	// Fields
	private BlackjackHand playerHand = new BlackjackHand(); // the player's hand
	private Dealer dealer = new Dealer(); // initializes the player's dealer
	private Scanner sc = new Scanner(System.in); // initializes a scanner for user input

	// Constructors
	public Player() {
		for (int i = 0; i < 2; i++) {
			this.getHand(dealer.dealHand()); // starting hand dealt to player
			dealer.addToHand(); // adds card to dealer's hand
		}
	}

	// Methods

	public void playerInput() {
		int userInput = 0;
		while (playerHand.getHandValue() < 21 && userInput != 2) {
			try {
				showMenu();
				userInput = sc.nextInt();
				menuSwitch(userInput);
			} catch (Exception e) {
				System.out.println("Sneaky hobbitses");
			}

		}
		System.out.println("You have " + playerHand.getHandValue());
		dealer.turn();
		System.out.println("Dealer has " + dealer.getHandValue());
		if (playerHand.getCards().size() == 2 && playerHand.getHandValue() == 21) {
			System.out.println("Blackjack!");
		}
		winnerOutcome(playerHand.getHandValue(), dealer.getHandValue());
		dealer.fold();
	}


	public void showMenu() {
		System.out.println("You're currently sitting at " + playerHand.getHandValue());
		System.out.println("What would you like to do? (Select one of the options below)");
		System.out.println("1) Hit");
		System.out.println("2) Stay");
		System.out.println("3) Check Hand");
//		System.out.println("Double down");
//		System.out.println("Count the cards...");
	}

	public void menuSwitch(int userInput) {
		switch (userInput) {
		case 1: // add a card
			playerHand.addCard(dealer.dealHand());
			break;

		case 2:
			System.out.println("You decided you like where you're at");
			break;

		case 3:
			playerHand.getHandValue();
			playerHand.displayHand();
			break;
		default:
			System.out.println("Sorry, please select one of the provided options.");
			break;
		}

	}

	private void winnerOutcome(int playerHand, int dealerHand) {
		if (playerHand <= 21 && dealerHand <= 21 && playerHand > dealerHand) {
			System.out.println("You win!");
		} else if (playerHand <= 21 && dealerHand > 21) {
			System.out.println("You win!");
		} else if (playerHand <= 21 && playerHand == dealerHand) {
			System.out.println("It's a draw this time...");
		} else if (playerHand > 21) {
			System.out.println("Looks like you busted this round...");
		} else {
			System.out.println("Looks like you lost that round...");
		}
	}
	
	@Override
	public int getHand() {
		return 0;
		// TODO Auto-generated method stub

	}

	public void getHand(Card card) { // get a card from
		playerHand.addCard(card);
	}

	@Override
	public void playHand() { // adds another card to the hand

	}

	@Override
	public void holdHand() { // no cards added, display value
		playerHand.displayHand();

	}

	@Override
	public void fold() {
		System.out.println("You decided that's enough gambling for today.");
		System.out.println("+1 Perspective");
	}

}
