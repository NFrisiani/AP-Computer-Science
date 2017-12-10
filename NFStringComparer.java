import java.util.Scanner;

public class NFStringComparer {

	
	public static void main(String[] args){
		
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter String one: ");
	
	String string1 = input.nextLine();
	
	
	if(string1.charAt(0) == string1.charAt(1))
	{
		if(string1.charAt(1) == string1.charAt(2))
		{
			if(string1.charAt(2) == string1.charAt(3))
			{
				if(string1.charAt(3) == string1.charAt(4))
				{
					if(string1.charAt(4) == string1.charAt(5))
					{
						if(string1.charAt(5) == string1.charAt(6))
						{
							if(string1.charAt(6) == string1.charAt(string1.length()-1))
								
							{
								System.out.println("The characters are equal");
							}
						}
					}
				}
			}
		}
		
	}
	else {
		
		System.out.println("the characters are different");
	}
	
	
	}
	
}
