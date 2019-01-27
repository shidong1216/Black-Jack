package blackjack.game;

import java.util.Scanner;

import javax.swing.text.PlainDocument;

import blackjack.game.constant.Constants;
import blackjack.game.model.Deck;

public class GameApp {

	public static void main(String args[])
	{
		/*
		 * Game flow:
		 * 1. shuffle deck
		 * 2. Player Places a Wager
		 * 3. Dealer deals 1 card to player
		 * 4. Dealer deals 1 card to himself
		 * 5. Dealer deal 1 card to player
		 * 6. Dealer deals 1 card to himself and face up
		 * 7. Player decide to hit or stand (double down, split and surrender are not included in this project)
		 * 8. After player stand, dealer deals card to himself if his total hand value is less than 17
		 * 9. When dealer stand, compare hand values
		 * 
		 * 	How do you beat the dealer?

				By drawing a hand value that is higher than the dealer’s hand value
				By the dealer drawing a hand value that goes over 21.
				By drawing a hand value of 21 on your first two cards, when the dealer does not.
			
			How do you lose to the dealer? 
			
				Your hand value exceeds 21.
				The dealers hand has a greater value than yours at the end of the round
				
			10. loser pays wager to winner.
		 */
		
		
		//===================== Game implementation starts from here =====================
		boolean GAME_STATE = Constants.RUNNING;
		Scanner scanner = new Scanner(System.in);
		String playerDecision;
		Deck deck;
		int playerWager;

		while(GAME_STATE == Constants.RUNNING)
		{
			/* TODO 1
			 * 1. if deck is null or number of deck is less than 10
			 * 			Create a new Deck object and assign it to deck
			 * 	  else do nothing to deck
			 * 2. Create a Person named player, set wagers to PLAYER_INITIAL_WAGERS
			 * 3. Create a Person named dealer, set wagers to DEALER_INITIAL_WAGERS
			 */
			
			System.out.println("Please enter your wager");
			playerWager = scanner.nextInt();
			System.out.println("You have placed " + playerWager + " wagers");



			/*
			 * TODO 2
			 * 1. player gets 1 card from deck (hint: get top card from deck, and then input the card to player's hit function)
			 * 2. dealer gets 1 card form deck
			 * 3. player gets another card
			 * 4. dealer gets another card and show the card to player (hint: you can use syso to print card)
			 * 5. display player hand cards (you can use show cards function for player);
			 */
			
			
			/*
			 *  asking player to input hit or stand
			 *  if user input neither hit or stand, keep asking player to provide input until player enters the correct input
			 */
			System.out.println("Do you want to hit or stand?");
			playerDecision = scanner.next();
			while(!"hit".equals(playerDecision) && !"stand".equals(playerDecision))
			{
				System.out.println("Please enter either 'hit' or 'stand'");
				playerDecision = scanner.next();
			
				while(playerDecision.equals("hit") /*TODO 3 && player hand card is smaller than Constants.MAX_CARDS + 1*/) 
				{
					/*
					 * TODO 4
					 * 1. player gets one card from deck
					 * 2. syso "Player hit"
					 * 3. call showCards() function to display hand cards
					 */
					
					System.out.println("Do you want to hit or stand?");
					playerDecision = scanner.next();
					while(!"hit".equals(playerDecision) && !"stand".equals(playerDecision))
					{
						System.out.println("Please enter either 'hit' or 'stand'");
						playerDecision = scanner.next();
					}
					
					if(playerDecision.equals("stand"))
					{
						System.out.println("Player stand");
					}
				}
			}
			
			
			/*
			 * TODO 5
			 * while dealer's total hand value is smaller than 17, dealer will perform hit
			 * dealer stand when total hand value is greater than 17
			 */
			
			/*
			 * TODO 6
			 * 1. Compare dealer's hand value and players hand value
			 * 2. calculate the winner
			 * 3. winer wins the wagers, and loser lost the wagers
			 * 4. display players current wagers
			 */
			
			
			System.out.println("Play more? yes/no");
			playerDecision = scanner.next();
			if(playerDecision.equals("no"))
			{
				GAME_STATE = Constants.STOP;
			}
			
			/*
			 * TODO 7
			 * if player does not have wagers, set GAME_STATE to Constants.STOP;
			 */
			
			/*
			 * TODO 8
			 * if dealer ran out of wagers, display player win, and set GAME_STATE to STOP;
			 */
		}
	}
}
