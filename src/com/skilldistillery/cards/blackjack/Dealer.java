package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;
import com.skilldistillery.cards.common.Person;

public class Dealer implements Person{
	private BlackjackHand dealerHand = new BlackjackHand(); //the dealer's hand
	private Deck deck = new Deck(); //new instance of deck of shuffled 52 cards 
	
	public Card dealHand() { //Deals starting hand, adds a card to hand, returns one to player
		return deck.dealCard(); //returns a card to playerHand
		
	}

	public void newDeck() {
		deck = new Deck();
	}
	
	@Override
	public int getHandValue() { //checks card value in hand
		return dealerHand.getHandValue();
	}

	@Override
	public void displayHand() { //no cards added, displays value
		dealerHand.displayHand();
	}

	@Override
	public void addToHand() { //adds a card from deck to the hand
		dealerHand.addCard(deck.dealCard());
	}

	@Override
	public void fold() {
		dealerHand.fold();
	}

	public void turn() {
		System.out.println("Dealer's starting hand is: " + dealerHand.getHandValue());
		dealerHand.displayHand();
		while(dealerHand.getHandValue() < 17) {
			addToHand();
			System.out.println("The dealer added a card and now has: ");
			dealerHand.displayHand();
		}
		System.out.println("Dealer's ending deal is : "+dealerHand.getHandValue());
	}
	

}
