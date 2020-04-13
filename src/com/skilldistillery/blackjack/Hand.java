package com.skilldistillery.blackjack;

import java.util.ArrayList;
import java.util.List;

abstract class Hand { // user story #1
	List<Card> h = new ArrayList<>();

	public Hand() {

	}

	public void addCard(Card card) {
		h.add(card);
	}

	public void clear() {
		h.removeAll(h);
	}

	public void replenish() {
		h.addAll(h);
	}

	public abstract int getHandValue();

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
