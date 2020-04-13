package com.skilldistillery.blackjack;

public enum Suit { // user story #1
  HEARTS("Hearts"), SPADES("Spades"), CLUBS("Clubs"), DIAMONDS("Diamonds");
	
  private String name;

  Suit(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }
}