package com.skilldistillery.blackjack;

public class Player {
	
	private String name;
	private Hand hand = new BlackjackHand();
	
	public Player(String name) {
		this.name = name;
	}
	
	public Player() {
		
	}
	
//	public Player(Hand hand) {
//		this.hand = hand;
//		this.getHand();
//	}
	
	public void setHand(Hand hand) {
		
	}
	
	public Hand getHand() {
		return hand;
	}

	public void addCard(Card card) {
		hand.addCard(card);
	}
	
	public int getHandValue() {
		int value = 0;
		return value;
	}
	
	public void setHandValue() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name + "'s hand: " + getHand() + " " + "Hand's value: " + getHandValue();
	}
	
}
