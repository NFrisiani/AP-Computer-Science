
public class NFTime {

	private int hours;
	private int mins;
	
	
	
	public NFTime (int h, int m)
	{
		
		if (h <= 23 && m <= 59)
		{
		hours = h;
		mins = m;
		}
		
		else 
		{
			throw new IllegalArgumentException("The numbers you put in are too big");
		}
		
		
		
	}
	
	
	private int toMins() 
	{
		int timeInMinutes = hours*60 +mins;
		return timeInMinutes;
	}
	
	
	public boolean lessThan(NFTime t)
	{
	
		if (hours < t.hours)
		{
			return true;
		}
		else if (hours == t.hours && mins < t.mins)
		{
			return true;
		}
		
			return false;
		
		
	}
	
	
	public int elapsedSince(NFTime t)
	{
		
		int minutesElapsed = this.toMins() - t.toMins();
		
		if (minutesElapsed > 0)
		{
			
			return minutesElapsed;
		}
		
	 
		
			return minutesElapsed + 1440;
		
	
	}
	
	
	public String toString()
	{
		
		String string = hours + ":" + mins;
		return string;
	}
	
	
	
}
