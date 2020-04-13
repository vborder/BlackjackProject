package com.skilldistillery.blackjack;

public class Player {

	private String name;
	private Hand hand = new BlackjackHand();

	public Player(String name) {
		this.name = name;
	}

	public Player() {

	}

	public void clear() {
		hand.clear();
	}

	public void setHand(Hand hand) {

	}

	public Hand getHand() {
		return hand;
	}

	public void addCard(Card card) {
		hand.addCard(card);
	}

	public int getHandValue() {
		return hand.getHandValue();
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
		return name + "'s hand: " + getHand() + " " + "Hand value: " + getHandValue();
	}
}
