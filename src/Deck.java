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
		//int cardCount = CARDS * SUITES;  
		for (int card = 1; card<=CARDS; card++) 
		{ 
			for (int suite = 1; suite <=SUITES; suite++) 
			{ 
				addCardToDeck(deck, card, suite); 
			} 
		} 
		//System.out.println("Cards = " + deck.size());
		
	}

	public Card draw()
	{
		//System.out.println("Cards remaining in deck " + deck.size());	
		Card card = null;
		//Random generator = new Random(); 
		//int index = generator.nextInt(deck.size()) + 1;

		//System.out.println("Cards index " + index);
		//System.out.println("Card index " + index);
		//if (index > deck.size() || index < 0)
		//{
		//	System.out.println("Bad index=" + index);
		//}

		if (deck.size() >0)
		{
			int index = findCard();
			//System.out.println("Index=" + index);
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
	
	private void addCardToDeck(Map<Integer, Card> deck, int card, int suite) 
	{ 
		Card newCard = new Card(card, suite); 

		int index = deck.size() + 1; 
		newCard.value = card; 
		newCard.suit = suite; 
 		deck.put(index, newCard); 
 	} 
	
	


}
