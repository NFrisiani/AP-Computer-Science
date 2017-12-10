import java.util.Scanner;

public class NicoloFrisianiPalindromeArray 
{

	//main method: gets the user string input,
	//creates a big array of characters and fills it with every character of the String that precede the "."
	//calls the method isPalindrome to check if the sentence inserted by the user is a Palindrome
	public static void main(String[] args) 								
	{
		System.out.println("THIS PROGRAM CHECKS IF THE SENTECES YOU ENTER ARE PALINDROMES");
		
		while(2 > 1) //infinite while loop so that the program goes on asking for palindromes until the users closes it.
		{ 
			
		Scanner input = new Scanner(System.in);
		
		System.out.println();
		System.out.println();
		System.out.println("Enter the sentece followed by a period");
		String palindrome = input.nextLine();

		
		char letters[] =  new char[80];
		int k = 0;
		
		//for loop that fills the array with the characters of the String that precede the "."
		for(int i=0; i<= 80; i++)
		{
			if (palindrome.charAt(k) != '.')
			{
			letters[i] = palindrome.toLowerCase().charAt(k); //use the LowerCase method to convert the input 
			k++;											 // in lower case
			}
		}

		
		if(isPalindrome(letters, k))
		{
			System.out.println("The Sentence is a Palindrome");
		}
		
		else
		{
			System.out.println("The Sentence is not a Palindrome");
		}
		
		}
	
	}
	
	
	
	//isPalindrome method: gets two parameters, the array of characters "input" from the user and
	//the integer that represent how much the array has been "filled" with the characters of the String input
	//Creates a new array that is equal to the first one but with no spaces
	//Creates a new array that is equal to the "NoSpaces" one but reverse
	//Then checks if the reversed array is equal to the normal one with no spaces
	public static boolean isPalindrome(char[]a, int used)
	{
		
		char reversePalindrome[] = new char[used];
		int i = 0;
		int spaces = 0;
		
		
		
		
		for(int j = 0; j <= used -1; j++) 
		{
			if(a[j] == ' ') //counts the number of spaces in the arrays
			{
				spaces++;
			}
		}
		
		
		
		char aNoSpaces[] = new char[used - spaces];
	
		
		int x = 0; //integer that will be used to indicate the position in the array with no spaces
		
		for(int j = 0; j <= used -1; j++) 
		{
			if(a[j] != ' ') //"deletes" the spaces
			{
			aNoSpaces[x] = a[j]; 
			x++;
			}
		}
		
		
		
		for(int k = aNoSpaces.length - 1; k>=0; k--) 
		{
			reversePalindrome[i] = aNoSpaces[k]; //reverses the array of characters
			i++;
		}
		
		
		
		for(int j = 0; j <= aNoSpaces.length -1; j++) 
		{
			if(reversePalindrome[j] != aNoSpaces[j]) //checks if the two array are equal
			{
				return false;
			}
		
		}
		
		
		return true;
	}
	
}
