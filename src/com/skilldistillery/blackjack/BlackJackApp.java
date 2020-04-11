package com.skilldistillery.blackjack;

import java.util.Scanner;

public class BlackJackApp {

	Scanner kb = new Scanner(System.in);
	Dealer dealer = new Dealer();
	Player player = new Player();
	Deck deck = new Deck();

	public static void main(String[] args) {
		BlackJackApp bja = new BlackJackApp();
		bja.run();

	}

	public void run() {
		boolean menu = true;
		System.out.println("Welcome to BlackJack!");
		System.out.println("What is your name?");
		String name = kb.nextLine();
		Player player = new Player(name);

		while (menu != false) {
			System.out.println("What would you like to do, " + name + " ? \n");
			System.out.println("1. Play BlackJack");
			System.out.println("2. Quit Game");
			int gameChoice = kb.nextInt();

			switch (gameChoice) {
			case 1:
				playBlackJack(player);
				break;
			case 2:
				System.out.println("Thanks for playing BlackJack!");
				System.exit(0);
			}
		}
	}

	public BlackJackApp(Dealer d, Player p, Deck deck) {
		this();
		this.dealer = d;
		this.player = p;
		this.deck = deck;
	}

	public BlackJackApp() {
		super();
	}

	public void playBlackJack(Player player) {
		int gameChoice = 0;
		
		dealer.shuffle();
		dealer.dealCard();
		dealer.dealCards(player);
//		System.out.println("Your hand: " + player.getHand() + " " + player.getHandValue());
		System.out.println(player.toString());
		System.out.println("Dealer's hand: " + dealer.dealCard() + " " + dealer.getHandValue() + "\n");
		
		if (player.getHandValue() == 21) {
			System.out.println("Your hand totals 21!");
			dealer.dealCard();
		}
		
	while(true) {
		System.out.println("What would you like to do?");
		System.out.println("1. Hit me!");
		System.out.println("2. Stay.");
		gameChoice = kb.nextInt();
		
		if(gameChoice == 1) {
			dealer.gameDeal(player);
			System.out.println(player.toString());
			System.out.println(player.getHandValue());
		}
		
		if(gameChoice == 2) {
			System.out.println(player.getHandValue());
			dealer.dealCard();
			System.out.println(dealer.toString());
			if(dealer.getHandValue() == 17) {
				
			}
		}
		
	}
	}
}
