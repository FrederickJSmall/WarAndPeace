
import java.util.*;

public class Deck {
	
	Map<Integer, Card> deck = new HashMap<Integer, Card>();
	private final static int CARDS = 13;
	private final static int SUITES = 4;
	
	public Deck()
	{
		Init();
	}
	
	private void Init()
	{
		int cardCount = CARDS * SUITES; 
		for (int card = 1; card< cardCount; card++)
		{
			for (int suite = 1; suite <=SUITES; suite++)
			{
				addCardToDeck(deck, card, suite);
			}
		}
	}
	
	
	public Card Draw()
	{
		Card result = null;
		
		
		
		return result;
	}
	
	private void addCardToDeck(Map<Integer, Card> deck, int card, int suite)
	{
		Card newCard = new Card();
		int index = deck.size()+1;
		newCard.Card = card;
		newCard.Suite = suite;
		
		deck.put(index, newCard);
	}

}
