
public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Card card = new Card();
		//System.out.println("initializing decks");
		Deck deck1 = new Deck();
		Deck deck2 = new Deck();
		String playerMessage = " there are no more cards in the deck are you trying to cheat";
		boolean cheater  = false;

		for (int i = 0; i<52; i++)
		{
			Card card1 =  deck1.draw();
			Card card2 =  deck2.draw();
			cheater = false;
			
			System.out.println("Play Game # " + (i+1));
			if (card1 == null)
			{
				System.out.println("Player1" + playerMessage);
				cheater = true;
			}
			
			if (card2 == null)
			{
				System.out.println("Player2" + playerMessage);
				cheater = true;
			}
			
			//if (card1.equals(null) || card2.equals(null))
			//{
			//	System.out.println("Wow bad data");
			//}
			if (!cheater)
			{
				card1.Winner(card2);
			}
			
		}
		System.out.println("Player 1 Wins = " + 1 + "Player 2 Wins = " + "Draws = " + 1);
		System.out.println("Game Over");	
	}

}
