package com.skilldistillery.blackjack;

public class Player {
	
	private String name;
	private Hand hand;
	
	public Player(String name) {
		this.name = name;
	}
	
	public Player(Hand hand) {
		this.getHand();
	}
	
	public void setHand(Hand hand) {
		this.hand = hand;
	}
	
	public Hand getHand() {
		return hand;
	}

	public void addCard(Card card) {
		hand.addCard(card);
	}
	
	public Player() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name; // + hand score
	}
	
}
