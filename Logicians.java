
public class Logicians 
{
	
	static int[] sample = {0,0,6,7,0,9}; 
	
	
	public static void main(String args[])
	{
		trim();
	}
	

		public static void trim()
		{
			int counter = 0;
			
			for(int k = 0; k < sample.length; k++)
			{
				if(sample[k] == 0)
				{
					counter++;
				}
				
				else
				{
					break;
				}
			}
			
			
			
			int[] temp = new int[sample.length-counter];
			
			for(int k = 0; k < temp.length; k++)
			{
				temp[k] = sample[counter+k];
			}
		
			sample = temp;
			
			for(int k = 0; k < sample.length; k++)
			{
				System.out.println(sample[k]);
			}
		}
	
	
}
