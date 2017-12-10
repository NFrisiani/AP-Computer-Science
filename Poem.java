
public abstract class Poem 
{
	
	public abstract int numLines();
	public abstract int getSyllables(int k);
	
	public void printRythm()
	{
		for (int l = 1; l <= numLines(); l++)
		{
			System.out.println();
			for (int k = 1; k <= getSyllables(l); k++)
			{
			System.out.print("ta-");
			}			
		}
	}
}


class Haiku extends Poem
{

		
	public int numLines() 
	{
		return 3;
	}

	
	public int getSyllables(int k) 
	{
		if (k == 1 || k == 3){
		
		return 5;
		}
		
		
		else 
		{
		return 7;
		}
	}
	
	
	public void printHaikuRythm()
	{
		
		System.out.println("Haiku Rythm");
		System.out.println();
		
		super.printRythm();
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
}


class Limerick extends Poem
{

	
	public int numLines() {
		
		return 5;
	}

	
	public int getSyllables(int k) {
		
		if (k == 1 || k == 2 || k == 5){
			
			return 9;
			}
			
			
			else 
			{
			return 6;
			}
	}
	
	
	
	public void printLimerickRythm()
	{
		System.out.println("Limerick Rythm");
		System.out.println();
		
		
		super.printRythm();
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
}