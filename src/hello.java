import java.text.MessageFormat;

public class hello {

	public static void main(String[] args) {
		Deck deck1 = new Deck();
		Deck deck2 = new Deck();
		String playerMessage = " there are no more cards in the deck are you trying to cheat";
		String winner = "";
		boolean cheater  = false;
		int player1Score = 0;
		int player2Score = 0;
		
		for (int i = 0; i<52; i++)
		{
			Card card1 =  deck1.draw();
			Card card2 =  deck2.draw();
			cheater = false;
			
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
				System.out.print("Player 1's hand=" + card1.toString() + ",Player 2's hand=" + card2.toString());
				if (card1.Winner(card2))
				{ 
					System.out.println(" ***** Player 1 wins *****");
					player1Score +=1;
				}
				else
				{
					System.out.println(" ***** Player 2 wins *****");
					player2Score +=1;
				}
			}
			
		}
		System.out.println("");
		System.out.println("Total Wins for player 1 = " + player1Score);
		System.out.println("Total Wins for player 2 = " + player2Score);		
		if (player1Score > player2Score)
			winner = "Player 1 is the winner";
		else if (player1Score < player2Score)
			winner = "Player 2 is the winner";
		else
			winner = "Its a draw";
		
		System.out.println("");
		System.out.println(winner);
		System.out.println("********** Game Over **********");	
	}

}
