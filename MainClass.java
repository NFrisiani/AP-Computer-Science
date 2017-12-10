import java.util.Scanner;

public class MainClass 
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		boolean isVowel = false;
		String v = "aeiou";
		String temp_s = "";
		String temp_l = "";
		String large = "";
		String small = "fghjhgfdssdfghjklkjhgfdsasdfghjklkjhgfdsasdfghjklkjhgfdsa";
		
		for(int i = 0; i < s.length(); i++)
		{
			char nextChar = s.charAt(i);
			
			if(v.indexOf(nextChar) != -1)
			{
				isVowel = true;
			}
			
			if(isVowel)
			{
				temp_l += s.charAt(i);
				
				if(temp_s.length() > 0)
				{
					temp_s = "";
				}
				
				temp_s += s.charAt(i);
			}
			
			else
			{
				temp_s += s.charAt(i);
				if(temp_s.length() < small.length())
				{
					
				}
			}
			
			
			
		}
		
		System.out.println(large);
		System.out.println(small);
	}
}
