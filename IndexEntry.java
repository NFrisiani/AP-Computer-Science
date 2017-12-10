import java.util.*;

public class IndexEntry {

	static String word;
	private static ArrayList<Integer> numList;
	static Scanner input = new Scanner(System.in);
	
	public IndexEntry()
	{
		String lowCaseWord = input.nextLine();
		String upCaseWord = lowCaseWord.toUpperCase();
		
		word = upCaseWord;
	}
	
	
	public static void add(int num)
	{
		int check = 0;
		
		for(int i = 0; i <= numList.size() - 1; i++)
		{
			if(num != numList.get(i))
			{
				check += 1;
			}
		}
		
		if(check == numList.size())
		{
			numList.add(num);
		}
	}
	
	public String getWord()
	{
		return word;
	}
	
	public String toString()
	{
		String output = "";
		
		output = word + " " + numList.get(0) + ", ";
		
		for(int i = 1; i <= numList.size(); i++)
		{
			output += numList.get(i) + ", ";
		}
		
		
		return output;
	}
}
