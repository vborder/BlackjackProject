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
				dealer.shuffle();
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
		dealer.dealCards(player);
		System.out.println(player.toString());
		System.out.println(dealer.toString() + "\n");
		dealer.dGameDeal();
//		System.out.println("Dealer's hand: " + dealer.toString2() + "\n");
		
		if (player.getHandValue() == 21) {
			((BlackjackHand) player.getHand()).isBlackjack();
			System.exit(0);
//			break;
			dealer.dealCard();
			if (dealer.getHandValue() == 21) {
				System.out.println("You tied with the dealer!");
				System.out.println("Would you like to play another hand? Enter \"1\" for yes or"
						+ "\2\" for no.");
				gameChoice = kb.nextInt();
				if( gameChoice == 1) {
					playBlackJack(player);
				} else { 
					System.out.println("Thanks for playing!");
					System.exit(0);
				}
			}
		}
		
	while(true) {
		System.out.println("What would you like to do?");
		System.out.println("1. Hit me!");
		System.out.println("2. Stay.");
		gameChoice = kb.nextInt();
		
		if(gameChoice == 1) {
			dealer.gameDeal(player);
			System.out.println(player.toString());
			if (player.getHandValue() > 21) {
				((BlackjackHand) player.getHand()).isBust();
				System.exit(0);;
//				break;
			}
		}
		
		if(gameChoice == 2) {
			System.out.println(dealer.toString2());
			
			while(dealer.getHandValue() < 17) {
				dealer.dGameDeal();
				System.out.println("\nDealer deals herself a card.\n");
				System.out.println(dealer.toString2());
				break;
			}
			
			if(dealer.getHandValue() >= 17) {
				if (dealer.getHandValue() > 21) {
					System.out.println("Dealer busted! Game over, you win!\n");
					System.exit(0);
//					break;
				} else {
					System.out.println("Dealer stays.");
				}
			} 
			
			if(player.getHandValue() > dealer.getHandValue()) {
				System.out.println(player.getName() + " wins!");
				System.exit(0);
//				break;
				} else if (player.getHandValue() < dealer.getHandValue()) {
					System.out.println("Dealer wins!\n");
					System.exit(0);
//					break;
				} else {
					System.out.println("You tied!\n");
					System.exit(0);
//					break;
				}
			}
		}
		
	}
}
