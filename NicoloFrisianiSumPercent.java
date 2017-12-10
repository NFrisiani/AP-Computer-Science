import java.text.DecimalFormat;
import java.util.Scanner;


public class NicoloFrisianiSumPercent 
{

	//main method: asks the user how many integers will he enter, and creates an array as big as that number
	//asks the user to input the integers
	//calculates and screens the sum of them calling the method getSum
	//calculates and screens how much does each number influence to the final sum
	public static void main(String args[])
	{
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many Integers will you enter? ");
		int k = input.nextInt();
		
		int numbers[] = new int[k];
		
		DecimalFormat df = new DecimalFormat("##.##"); //creating an object that sets the digits format to 00.00 
		
		for(int i = 0;  i <= (numbers.length - 1);  i++)
		{
			System.out.print("Number " + (i+1) + "  ");
			numbers[i] = input.nextInt();
		}
		
		System.out.println();
		System.out.println("The Sum is equal to " + getSum(numbers));
		System.out.println();
		
		for(int c = 0;  c <= (numbers.length - 1);  c++)
		{
			System.out.print(numbers[c]);
			System.out.println(", which is " + df.format(((double)(numbers[c]*100)/(double)getSum(numbers))) + "% of the sum");
			
		}
		
	}
	
	//getSum method: get an array of integers as a parameter and calculates their sum
	public static int getSum(int[] numbers)
	{
		int sum = 0;
		

		for(int i = 0;  i <= (numbers.length - 1);  i++)
		{
		sum += numbers[i]; 
		}
		
		return sum;
		
	}
	
}
