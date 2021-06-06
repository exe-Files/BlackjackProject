package com.skilldistillery.cards.blackjack;

public class BlackJackApp2 {
	Player2 player2 = new Player2(); // instance of player class created
	Dealer dealer = new Dealer(); // instance of dealer class created

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlackJackApp2 blackJackGame = new BlackJackApp2();
		blackJackGame.run();

	}

	private void run() {
		/*
		 * Blackjack game logic
		 * By putting the logic here, we can make the classes
		 * more generic and reuse them to make other card games later on
		 */
		System.out.println("Beginning game of Blackjack...");
		int gameType = 2; //this variable is based off the gametype selected: Blackjack
		boolean playAgain;
		do {
			for (int i = 0; i < gameType; i++) { // adds two cards to player and dealer's hand
				player2.addToHand(dealer.dealHand());
				dealer.addToHand();
			}
			boolean checkMenu = true;
			System.out.println("Your starting hand is: " + player2.getHandValue());
			player2.displayHand();
			while (player2.getHandValue() < 21 && checkMenu == true) {
				showMenu(); // displays menu to screen
				checkMenu = menuSwitch(player2.playerInput()); //Player's turn, 
															   //returns false if they choose to stay
			}
			dealer.turn(); //Dealer's turn
			System.out.println("************************");
			System.out.println("\nYou have " + player2.getHandValue());
			System.out.println("Dealer has " + dealer.getHandValue());
			System.out.println();
			winnerOutcome(player2.getHandValue(), dealer.getHandValue());
			player2.fold();
			dealer.fold(); // clears both hands for the next round
			dealer.newDeck(); //grabs a new deck
			System.out.println("\nPlay again?\n (Y or N)");
			playAgain = player2.playAgain();
		} while(playAgain == true);
		System.out.println("You decided that's enough gambling for today...");
	}

	// System.out.println("You decided that's enough gambling for today.");
	// System.out.println("+1 Perspective");

	private void showMenu() {
		/*
		 * Prints out a menu to the user
		 */
		System.out.println("You're currently sitting at " + player2.getHandValue());
		System.out.println("What would you like to do? (Select one of the options below)");
		System.out.println("************************");
		System.out.println("1) Hit");
		System.out.println("2) Stay");
		System.out.println("3) Check Hand");
		System.out.println("************************");
//		System.out.println("Double down");
//		System.out.println("Count the cards...");
	}
	
	private boolean menuSwitch(int userInput) {
		/*
		 * switch cases to select from based on the menu 
		 */
		switch (userInput) {
		case 1: // add a card
			System.out.println("You decided to add another card to your hand.");
			player2.addToHand(dealer.dealHand()); //adds a card dealt by the dealer from the deck
			System.out.println(player2.getHandValue() + " total");
			break;

		case 2:
			System.out.println("You decided you like what you've been dealt...");
			return false;
		case 3:
			player2.getHandValue();
			player2.displayHand();
			break;
		default:
			System.out.println("Sorry, please select one of the provided options.");
			break;
		}
		
		return true;

	}

	private void winnerOutcome(int playerHand, int dealerHand) {
		/*
		 * Compares the hands of the player and dealer to determine an outcome
		 */
		if (player2.getCards().size() == 2 && player2.getHandValue() == 21) {
			System.out.println("♠♡♢♣♤♥♦♧ Blackjack! You win! ♠♡♢♣♤♥♦♧");
		} else if (playerHand <= 21 && dealerHand <= 21 && playerHand > dealerHand) {
			System.out.println("♠♡♢♣♤♥♦♧ You win! ♠♡♢♣♤♥♦♧");
		} else if (playerHand <= 21 && dealerHand > 21) {
			System.out.println("♠♡♢♣♤♥♦♧ You win! ♠♡♢♣♤♥♦♧");
		} else if (playerHand <= 21 && playerHand == dealerHand) {
			System.out.println("It's a draw this time...");
		} else if (playerHand > 21) {
			System.out.println("Looks like you busted this round...");
		} else {
			System.out.println("Looks like you lost that round...");
		}
		
	}

}
