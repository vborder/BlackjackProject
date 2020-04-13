package com.skilldistillery.blackjack;

public class BlackjackHand extends Hand {

	public BlackjackHand() {
		super();
	}

	public int getHandValue() {
		int handValue = 0;

		for (int i = 0; i < h.size(); i++) {
			handValue += h.get(i).getValue();
		}

		return handValue;
	}

	public int getDealerHandValue() {
		int handValue = 0;

		for (int i = 1; i < h.size(); i++) {
			handValue = h.get(i).getValue();
		}

		return handValue;
	}

	public boolean isBlackjack() {
		if (getHandValue() == 21) {
			System.out.println("Blackjack!\n");
			return true;
		}

		return false;
	}

	public boolean isBust() {
		if (getHandValue() > 21) {
			System.out.println("You busted! Game over.\n");
			return true;
		}

		return false;
	}
}
