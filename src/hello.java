
public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Card card = new Card();
		System.out.println("initializing deck 1");
		Deck deck1 = new Deck();
		
		System.out.println("initializing deck 2");		
		Deck deck2 = new Deck();

		
		for (int i = 0; i<52; i++)
		{
			Card card1 =  deck1.Draw();
			Card card2 =  deck2.Draw();

			System.out.println("Drawing card " + i);
			
			if (card1.equals(null) || card2.equals(null))
				System.out.println("Wow bab data");
			else
				card1.Winner(card2);
			
		}
		
	}

}
