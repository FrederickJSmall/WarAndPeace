import java.util.Map;

public class PeaceDeck extends Deck {

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
