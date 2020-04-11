package com.skilldistillery.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cards;

	public Deck() {
		cards = createDeck();
	}

	public List<Card> createDeck() {
		cards = new ArrayList<>(52);

		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				cards.add(new Card(r, s));
			}
		}
		return cards;
	}

	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	
	public int cardsLeftInDeck() {
		return cards.size();
	}
	
	public Card dealCard() {
		return cards.remove(0);
	}
}
