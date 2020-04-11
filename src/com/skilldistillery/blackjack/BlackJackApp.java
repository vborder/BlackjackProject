package com.skilldistillery.blackjack;

import java.util.Scanner;

public class BlackJackApp {
	
	Scanner kb =  new Scanner(System.in);
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
		
		while(menu != false) {
			System.out.println("What would you like to do, " + name + " ? \n");
			System.out.println("1. Play BlackJack");
			System.out.println("2. Quit Game");
			int gameChoice = kb.nextInt();
			
			switch(gameChoice) {
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
		dealer.shuffle();
		dealer.dealCard(); // good up to this point
		dealer.dealCards(player);
//		System.out.println(player);
//		System.out.println(player.getHand());
	}

}
