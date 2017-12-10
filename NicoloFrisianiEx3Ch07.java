import java.util.Scanner;


public class NicoloFrisianiEx3Ch07 {

	
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter the first number: ");
		int x = input.nextInt();
		
		System.out.println("Enter the second number: ");
		int y = input.nextInt();
		
		System.out.println(max(x, y));
		
	}
		
		public static int max(int x, int y){
			
		
		if (x > y)
		{
		
			return x;
			
		}else if (x==y)
		{
			
			
			return x;
			

			
		}else if (x < y) 
		
		{
		
			return y;
		}
		
		return y;
	}
	
}
