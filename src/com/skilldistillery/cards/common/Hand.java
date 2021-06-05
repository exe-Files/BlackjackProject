package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	private List<Card> cards = new ArrayList<>(); //this will hold drawn cards

	public List<Card> getCards() { //access cards in hand
		return cards;
	}
	
	public void addCard(Card card) { //add to cards in hand
		getCards().add(card);
	}

	public int getHandValue() {  //add up the rank value of cards in hand
		int value = 0;
		for (Card card : getCards()) {
			value += card.getValue();
		}
		return value;
	}

	public void fold() { 	//clears hand of all cards
		getCards().clear();
	}

	public void displayHand() {  //shows each card suit and rank in hand
		if (getCards().size() == 0) {
			System.out.println("No cards.");
		} else {
			for (Card card : getCards()) {
				System.out.println(card);
			}
		}
	}

}