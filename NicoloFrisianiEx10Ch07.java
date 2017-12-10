import java.util.Scanner;


public class NicoloFrisianiEx10Ch07 {

	
	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	
	
	System.out.println("Enter the first number: ");
	double a = input.nextDouble();
	
	System.out.println("Enter the second number: ");
	double b = input.nextDouble();
	
	System.out.println("Enter the third number: ");
	double c = input.nextDouble();
	
	
	System.out.println(geometric(a, b, c));
	
	}
	
	
	
	
	public static boolean geometric(double a, double  b, double c) 
	{
		
		if ((a!=0 && b!=0 && c!=0) && a/b == b/c) {
			
			return true;
			
			
		}else{
			
			
			return false;
		}
		
		
		
		
	}
}
