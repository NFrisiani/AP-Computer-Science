
public class Die {

	public void roll( ){
		
		numDots = (int)(6 * Math.random()) + 1;
		
		
	}
	public int getNumDots ()
	{
		
		return numDots;
		
	}
	private int numDots;
	}