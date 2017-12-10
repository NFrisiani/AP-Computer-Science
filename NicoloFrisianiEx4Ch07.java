import java.util.*;


public class NicoloFrisianiEx4Ch07 {

	
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter the hours you worked: ");
		int hours = input.nextInt();
		
		System.out.println("Enter the rate: ");
		double rate = input.nextDouble();
		
		System.out.println(totalWages(hours, rate));
		
	}
	
	
	
	public static double totalWages(int hours, double rate)
	{
	
		double wages;
		
		if (hours <= 40) 
		{
			
			wages = rate * hours;
			
		}else{
			
			wages = ((hours-40)*(1.5*rate))+(rate * 40);
			
		}
		
		return wages;
		
	}
	
	
	}
