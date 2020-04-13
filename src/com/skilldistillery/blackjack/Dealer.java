package com.skilldistillery.blackjack;

import java.util.List;

public class Dealer extends Player {
	Deck deck = new Deck();

	public List<Card> createDeck() {
		return deck.createDeck();
	}

	public Dealer() {
		super();
	}

	public void shuffle() {
		this.deck.shuffle();
	}

	public void dealCards(Player player) {
		player.getHand().addCard(deck.dealCard());
		this.getHand().addCard(deck.dealCard());
		player.getHand().addCard(deck.dealCard());
	}

	public void dGameDeal() {
		this.getHand().addCard(deck.dealCard());
	}

	public Card dealCard() {
		return deck.dealCard();
	}

	public void gameDeal(Player player) {
		player.getHand().addCard(deck.dealCard());
	}

	public int cardsLeftInDeck() {
		return deck.cardsLeftInDeck();
	}

	public void replenish() {
		System.out.println("Cards remaining in deck: " + deck.cardsLeftInDeck());
		if (deck.cardsLeftInDeck() < 32) { // dealer restocks and reshuffles every 5 hands
			System.out.println("Dealer is restocking and reshuffling the deck.\n");
			deck.createDeck();
			deck.shuffle();
		}
	}

	@Override
	public String toString() {
		return "Dealer's hand: " + getHand().toString();
	}

	public String toString2() {
		return "Dealer's hand: " + getHand() + " Hand value: " + getHandValue();
	}
}
