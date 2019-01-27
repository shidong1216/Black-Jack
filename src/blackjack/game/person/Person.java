package blackjack.game.person;

import java.util.Stack;

import blackjack.game.model.Card;

public class Person {
	protected String name;
	protected Stack<Card> handCards = new Stack<Card>();
	protected int wagers;
	
	public void setWagers(int wagers)
	{
		this.wagers = wagers;
	}
	
	public int getWagers()
	{
		return this.wagers;
	}
	
	public Person(String name)
	{
		this.name = name;
	}
	
	public void hit(Card card)
	{
		/* TODO
		 * add card to handCards
		 */
	}
	
	public void showCards() {
		System.out.println("===========" + name + " Hand ===========");
		for(Card card : handCards)
		{
			System.out.println(card.toString());
		}
		System.out.println("Total hand value:" + getTotalHandValue());
	}
	
	public int getTotalHandValue() {
		int sum = 0;
		/* TODO
		 * Your code here to implement total hand value
		 */
		return sum;
	}
	
	public int getNumberOfHandCards()
	{
		/*
		 * TODO
		 * modify this function to return total number of hand cards
		 */
		return -1;
	}
}
