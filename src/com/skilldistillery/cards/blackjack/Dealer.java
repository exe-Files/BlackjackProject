package com.skilldistillery.cards.blackjack;

import java.util.List;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;
import com.skilldistillery.cards.common.Person;

public class Dealer {
	private BlackjackHand dealerHand = new BlackjackHand(); //the dealer's hand
	private Deck deck = new Deck(); //new instance of deck of shuffled 52 cards 
	
	public Card dealHand() { //Deals starting hand, adds a card to hand, returns one to player
		return deck.dealCard(); //returns a card to playerHand
		
	}
	
	public int getHandValue() { //checks card value in hand
		return dealerHand.getHandValue();
	}

	public void addToHand() { //adds a card from deck to the hand
		dealerHand.addCard(deck.dealCard());
		
	}

	public void holdHand() { //no cards added, displays value
		dealerHand.displayHand();
		
	}

	public void fold() {
		dealerHand.fold();
	}

	public void playHand() {
		// TODO Auto-generated method stub
		
	}
	
	public void turn() {
		System.out.println("Dealer's starting hand is: " + dealerHand.getHandValue());
		dealerHand.displayHand();
		while(dealerHand.getHandValue() < 17) {
			addToHand();
			System.out.println("The dealer now has ");
			dealerHand.displayHand();
		}
		System.out.println("Dealer's ending deal is : "+dealerHand.getHandValue());
	}

}
