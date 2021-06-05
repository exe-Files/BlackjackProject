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
		player.playerInput();
		
		
		}

}
