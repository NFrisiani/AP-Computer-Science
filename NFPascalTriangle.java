import java.lang.*;

public class NFPascalTriangle {

	public static void main(String[] args)
	{
		pascalTriangle(28);
	}
	
	
	
	
	public static void pascalTriangle(int n)
	{
		int line[][] = new int[n][n+1];
		
		int prevRow[] = {1, 1};
		
		char spaces = ' ';
		
		for(int i = 0; i<= n -1; i++)
		{	
			
			int row[] = new int[i+1];
			
			if(i == 0)
			{
				row[0] = 1;
			}
			
			else if(i == 1)
			{
				row[0] = 1;
				row[1] = 1;
			}
			
			else
			{	
				row[0] = 1;
				for(int x = 1; x < i; x++)
				{
					row[x] = prevRow[x-1] + prevRow[x];
				}
				row[i] = 1;
				prevRow = row;
			}
			
			for(int k = 0; k <= row.length - 1; k++)
			{
			line[i][k] = row[k];
			}

		}

		
		
		for(int row = 0; row<= line.length-1; row++)
		{
			String sp = " ";
			String spPerLine = ""; 
			for (int i = 0; i <= n-row; i++)
			{
			spPerLine += sp;	
			}
			
			System.out.print(spPerLine );
			
			for(int col = 0; col<= line[row].length-1; col++)
			{
				if(line[row][col] != 0)
				System.out.print(line[row][col] + " ");
			}
			
			
			System.out.println();
		}
	
	}
	
}
