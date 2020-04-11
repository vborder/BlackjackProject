package com.skilldistillery.blackjack;

import java.util.ArrayList;
import java.util.List;

abstract class Hand {
	List<Card> h = new ArrayList<>();

	public Hand() {
		
	}
	
	public void addCard(Card card) {
		h.add(card);
	}
	
	public void clear() {
		
	}
	
	public int getHandValue(int value) {
		value = 0;
		return value;
	}

	public List<Card> getHand() {
		return h;
	}

	public void setHand(List<Card> h) {
		this.h = h;
	}

	@Override
	public String toString() {
		return "" + h;
	}
	
}
