package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

public class BlackJackApp2 {
	Player2 player2 = new Player2(); //instance of player class created
	Dealer dealer = new Dealer(); //instance of dealer class created

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlackJackApp2 blackJackGame = new BlackJackApp2();
		blackJackGame.run();
		
	}

	private void run() {
		System.out.println("Beginning game of Blackjack...");
		for(int i = 0; i < 2; i++) {
			player2.addToHand(dealer.dealHand());
			dealer.addToHand();
			showMenu();
			winnerOutcome();
		}
		
	}
	
	public void showMenu() {
		System.out.println("You're currently sitting at " +  player.getHandValue());
		System.out.println("What would you like to do? (Select one of the options below)");
		System.out.println("1) Hit");
		System.out.println("2) Stay");
		System.out.println("3) Check Hand");
//		System.out.println("Double down");
//		System.out.println("Count the cards...");
	}

	private void winnerOutcome(int playerHand, int dealerHand) {
		if ( playerHand <= 21 && dealerHand <= 21 && playerHand > dealerHand) {
				System.out.println("You win!");
		}
		else if ( playerHand <= 21 && dealerHand > 21 ) {
			System.out.println("You win!");
		}
		else if ( playerHand <= 21 && playerHand == dealerHand ) {
			System.out.println("It's a draw this time...");
		}
		else if (playerHand >21 ) {
			System.out.println("Looks like you busted this round...");
		}
		else {
			System.out.println("Looks like you lost that round...");
		}
		
	}
	
	public void menuSwitch(int userInput) {
		switch(userInput) {
		case 1: //add a card
			player2.getHand(dealer.dealHand());
			break;
			
		case 2:
			System.out.println("You decided you like where you're at...");
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


}
