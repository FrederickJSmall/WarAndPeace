public abstract class Card {
	
	int value;
	int suit;
	
	public Card(int inputvalue, int inputsuit)
	{
		value = inputvalue;
		suit = inputsuit;
	}

	enum Suits
	{
		Clubs, Diamonds, Hearts, Spades
	}
	
	@Override
	public String toString()
	{
		String result = "";
		
		switch (value)
		{
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			result = Integer.toString(value) + " of " + GetSuit(suit);
			break;
		case 11:
			result = "Jack of " + GetSuit(suit);
			break;
		case 12:
			result = "Queen of " + GetSuit(suit);
			break;
		case 13:
			result = "King of " + GetSuit(suit);
			break;
		case 14:
			result = "Ace of " + GetSuit(suit);
			break;
		}
		
		return result;
		
	}
	
	private String GetSuit(int inputsuit)
	{
		String result = "";
		
		switch(inputsuit)
		{
		case 1:
			result = "Clubs";
			break;
		case 2:
			result = "Diamond";
			break;
		case 3:
			result = "Hearts";
			break;
		case 4:
			result = "Spades";
			break;
		}
		return result;
	}
	
	public abstract boolean Winner(Card inputcard);
	/*
	{
		boolean result = false;
		
		if (value > inputcard.value)
		{
			result = true;
		}
		else if (value < inputcard.value)
		{
			result = false;
		}
		else if (value == inputcard.value)
		{
			if(suit > inputcard.suit)
			{
				result = true;
			}
			else
			{
				result = false;
			}
		}
		return result;
	}
	*/
}
