package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	List<Card> deck = new ArrayList<Card>();

	public Deck() {
		for (Suit suit : Suit.values()) {
			for(Rank rank : Rank.values()) {
				Card cardToBeAdded = new Card(suit, rank);
				deck.add(cardToBeAdded);
		
			}
		}
	}

	public int checkDeckSize() {
		if(deck == null) {
			return -1;
		}
		return deck.size();
	}

	public Card dealCard() {
		return deck.remove(0);
	}

	public void shuffle() {
		Collections.shuffle(deck);
	}
}