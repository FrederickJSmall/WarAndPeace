import java.util.*;

public abstract class Deck {
	
	Map<Integer, Card> deck = new HashMap<Integer, Card>();
	private final static int CARDS = 13; 
	private final static int SUITES = 4; 

	public Deck()
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
	
	public abstract void addCardToDeck(Map<Integer, Card> deck, int card, int suite) ;
}
