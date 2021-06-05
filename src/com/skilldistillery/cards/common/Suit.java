package com.skilldistillery.cards.common;

public enum Suit {
	//Enum Values
	HEARTS("Hearts"), SPADES("Spades"), CLUBS("Clubs"), DIAMONDS("Diamonds");
	
	//Fields
	private final String name;
	
	//Enum value constructor
	Suit(String name){
		this.name = name;
	}
	
	
	//Methods
	@Override
	public String toString() {
		return name;
	}
	
}