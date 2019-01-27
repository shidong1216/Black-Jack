package blackjack.game.model;

import java.util.Stack;

public class Deck {
	private Stack<Card> cards = new Stack<Card>();
	
	public Deck()
	{
		createCards();
		shuffle();
	}
	
	private void createCards()
	{
		/* TODO
		 * add 52 cards to the cards stack (you can use values in Constants class)
		 */
	}
	
	public void shuffle()
	{
		/* TODO
		 * shuffle cards stack
		 */
	}
	
	public int getCurrentCardNumber() {
		/*
		 * TODO
		 * modify this function to return number of cards in the stack
		 */
		return -1;
	}
	
	public Card getTopCard()
	{
		/*
		 * TODO
		 * modify this function to pop top card from cards stack and return the popped card
		 */
		return null;
	}
}
