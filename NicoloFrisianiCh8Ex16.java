import java.util.Scanner;

public class NicoloFrisianiCh8Ex16 
{
	public static void main(String[] args)	
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of cents: ");
		int cents = input.nextInt();
		
		
		for(int q = 0; q<= cents/25 ; q++)
		{
			for(int d =0; d<=cents/10; d++)
			{
				for(int n =0; n<= cents/5; n++)
				{
					for(int p =0; p<= cents; p++)
					{
						int possible = q*25 + d*10 + n*5 + p;

						if(possible==cents)
						{
							System.out.println(""+q+" quarters, "+ d +" dimes," + n + " nickels," + p + " pennies");
						}			
					}	
				}
			}
		}
	}	
}
