package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

public class BlackJackApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlackJackApp blackJackGame = new BlackJackApp();
		blackJackGame.run();
		
	}

	private void run() {
		System.out.println("Beginning game of Blackjack...");
		Player player = new Player(); //instance of player class created
//		showMenu();
			player.playerInput();
		
		}
//	
//	private void showMenu() {
//		System.out.println("You're currently sitting at " + playerHand.getHandValue());
//		System.out.println("What would you like to do? (Select one of the options below)");
//		System.out.println("1) Hit");
//		System.out.println("2) Stay");
//		System.out.println("3) Check Hand");
////		System.out.println("Double down");
////		System.out.println("Count the cards...");
//	}

}
