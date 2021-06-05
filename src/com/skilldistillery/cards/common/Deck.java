package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	//Fields
	private List<Card> deck = new ArrayList<Card>(); //private field of cards

	//Constructor (initializes a deck of 52 cards when instantiated based off all combinations)
	public Deck() {
		for (Suit suit : Suit.values()) {
			for(Rank rank : Rank.values()) {
				Card card = new Card(suit, rank);
				deck.add(card);
		
			}
		}
		shuffle(); //shuffles the deck after being created
	}

	//Methods
	public int checkDeckSize() {
		if(deck == null) {
			return -1;
		}
		return deck.size();
	}

	public Card dealCard() { //removes one card off the top of the deck
		return deck.remove(0);
	}
 
	public void shuffle() { //shuffles the order of cards in the deck
		Collections.shuffle(deck);
	}
}