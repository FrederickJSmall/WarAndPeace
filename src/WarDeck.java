import java.util.Map;

public class WarDeck extends Deck {
	
	protected void addCardToDeck(Map<Integer, Card> deck, int card, int suite) 
	{ 
		Card newCard = new WarCard(card, suite); 
		if (card ==1) card = 14;
		int index = deck.size() + 1; 
		newCard.value = card; 
		newCard.suit = suite; 
 		deck.put(index, newCard); 
 	} 
}
