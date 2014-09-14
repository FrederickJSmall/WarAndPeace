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
		System.out.println("Cards = " + deck.size());
		
	}

	public Card Draw()
	{
		//System.out.println("Cards remaining in deck " + deck.size());	
		Card card = null;
		Random generator = new Random(); 
		int index = generator.nextInt(deck.size()) + 1;
		
		//System.out.println("Card index " + index);	
		card = deck.get(index); 
		deck.remove(index);
		
		return card;
	}
	
	private void addCardToDeck(Map<Integer, Card> deck, int card, int suite) 
	{ 
		Card newCard = new Card(card, suite); 

		int index = deck.size()+1; 
		newCard.value = card; 
		newCard.suit = suite; 
 		deck.put(index, newCard); 
 	} 
	
	


}
