import java.util.Scanner;


public class AddOdds {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter n");
		
		int n = input.nextInt();
		
		System.out.println(addOdds(n));
		
	}
	
	
		public static int addOdds(int n)
		 
		  {    



			 int sum = 0;      
			

			for (int i = 1; i < n; i += 2)       
			
			sum += i;  
		    
			return sum;  

			
			
		 }

	
		
	
}
