import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class PeaceDeck extends Deck {
	
	Map<Integer, Card> deck = new HashMap<Integer, Card>();
	private final static int CARDS = 13; 
	private final static int SUITES = 4; 

	public PeaceDeck()
	{
		Init();
	}

	private void Init()
	{
		for (int card = 1; card<=CARDS; card++) 
		{ 
			for (int suite = 1; suite <=SUITES; suite++) 
			{ 
				addCardToDeck(deck, card, suite); 
			} 
		} 
	}

	public Card draw()
	{
		Card card = null;

		if (deck.size() >0)
		{
			int index = findCard();
			card = deck.get(index);
			deck.remove(index);
		}

		return card;
	}
	
	private int findCard()
	{
		boolean hasCard = false;
		int index = 1;
		Random generator = new Random(); 
		
		
	
		do
		{
	      index = generator.nextInt(CARDS * SUITES) + 1;
	      if (deck.containsKey(index))
	    	  hasCard = true;
		} while (hasCard == false);
		
		return index;
	}
	
	public void addCardToDeck(Map<Integer, Card> deck, int card, int suite) 
	{ 
		Card newCard = new PeaceCard(card, suite); 
		if (card ==1) card = 14;
		int index = deck.size() + 1; 
		newCard.value = card; 
		newCard.suit = suite; 
 		deck.put(index, newCard); 
 	} 
	
	


}
