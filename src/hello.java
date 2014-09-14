import java.text.MessageFormat;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Card card = new Card();
		//System.out.println("initializing decks");
		Deck deck1 = new Deck();
		Deck deck2 = new Deck();
		String playerMessage = " there are no more cards in the deck are you trying to cheat";
		String winner = "";
		boolean cheater  = false;
		int player1Score = 0;
		int player2Score = 0;
		//int drawScore = 0;
		
		for (int i = 0; i<52; i++)
		{
			Card card1 =  deck1.draw();
			Card card2 =  deck2.draw();
			cheater = false;
			
			//System.out.println("Play Game # " + (i+1));
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
			
			if (!cheater)
			{
				System.out.println("Player 1 has a " + card1.toString() + ",Player 2 has a " + card2.toString());
				
				String.format("%s",card1.toString());
				//MessageFormat fmt = new MessageFormat("Player 1 has a {0}    Player 1 has a {1}");
				//java.text.MessageFormat.format(arg0, arg1)
				if (card1.Winner(card2))
				{ 
					//System.out.println(card1.toString());
					//System.out.println("Player 1 wins");
					player1Score +=1;
				}
				else
				{
					//System.out.println(card2.toString());
					//System.out.println("Player 2 wins");
					player2Score +=1;
				}
				//System.out.println("");
			}
			
		}
		System.out.println("Total Wins for player 1 = " + player1Score + " Total Wins for player 2 = " + player2Score);
		if (player1Score > player2Score)
			winner = "Player 1 is the winner";
		else if (player1Score < player2Score)
			winner = "Player 2 is the winner";
		else
			winner = "Its a draw";
		
		System.out.println(winner);
		System.out.println("Game Over");	
	}

}
