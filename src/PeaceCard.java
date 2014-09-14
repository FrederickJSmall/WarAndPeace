
public class PeaceCard extends Card{

	
	public PeaceCard(int inputvalue, int inputsuit)
	{
		super(inputvalue, inputsuit);
	}
	
	public boolean Winner(Card inputcard)
	{
		boolean result = false;
		
		if (value < inputcard.value)
		{
			result = true;
		}
		else if (value > inputcard.value)
		{
			result = false;
		}
		else if (value == inputcard.value)
		{
			if(suit < inputcard.suit)
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
}
