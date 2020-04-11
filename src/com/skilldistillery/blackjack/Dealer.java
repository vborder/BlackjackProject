package com.skilldistillery.blackjack;

//import java.util.Collections;
import java.util.List;

public class Dealer extends Player {
	Deck deck = new Deck();
	
	public List<Card> createDeck() {
		return deck.createDeck();
	}
	
	public void shuffle() {
		this.deck.shuffle();
	}
	
	public void dealCards(Player player) {
		player.getHand().addCard(deck.dealCard());
		this.getHand().addCard(deck.dealCard());
		player.getHand().addCard(deck.dealCard());
		this.getHand().addCard(deck.dealCard());
	}
	
	public Card dealCard() {
		return deck.dealCard();
	}
}
