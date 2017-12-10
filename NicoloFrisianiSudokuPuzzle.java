
public class NicoloFrisianiSudokuPuzzle {

	static int board[][] = new int[9][9]; 
	static boolean start[][] = new boolean[9][9]; //boolean array used to verify if there is an initial number in that position or not
	
	//constructor: sets the value of each "square" of the board to 0 and sets every square as not having an initial number
	public NicoloFrisianiSudokuPuzzle()
	{
		for (int rows = 0; rows <= board.length - 1; rows++)
		{
			for (int columns = 0; columns <= board[rows].length - 1; columns++)
			{		
				board[rows][columns] = 0;
				start[rows][columns] = true;
			}
		}	
	}
	

	//method toString: -creates a string formed by each of the numbers of the board in 9 lines and 9 columns
	//				   -and creates a vertical "line" every 3 columns and an horizontal one every 3 rows
	// 					returns the string
	public String toString()
	{
		String sudokuBoard = "";
		
		for(int row = 0; row <= 8; row++)
		{
			if(row % 3 == 0)
			{
				sudokuBoard += "\n" + "---------------------------" + "\n";
				
			}
			
			else 
			{
				sudokuBoard += "\n";
			}
			
			for (int col = 0; col <= 8; col++ )
			{
				
				if(col % 3 == 0)
				{
					sudokuBoard += " | " + board[row][col];
				}
				else if(col != 8)
				{
					sudokuBoard += " " + board[row][col];
				}
				else
				{
					sudokuBoard += " " + board[row][col] + " | ";
				}
				
				
			}
			
		}
		
		sudokuBoard += "\n" + "---------------------------" + "\n";
		
		
		return sudokuBoard;	
	}
	
	
	//method addInitial: used by the Runner Class to add the initial numbers in the right places
	public static void addInitial(int row, int col, int value)
	{
		
			board[row][col] = value;
			start[row][col] = false;
	}
	
	
	//method addGuess: used to add the user's guess in the right place
	public static void addGuess(int row, int col, int value)
	{
			board[row][col] = value;	
	}
	
	//method checkPuzzle: checks every "box" and sees if the number in it respects the rules of sudoku, ignoring the 0s
	public static boolean checkPuzzle()
	{
		boolean checkThePuzzle[] = new boolean[9];
		
		for(int row = 0; row <= 8; row++)
		{
			for(int col = 0; col <= 8; col++)
			{
				checkThePuzzle = getAllowedValues(row, col);
				
				if(board[row][col] > 0)
				{
					if(!checkThePuzzle[board[row][col] - 1])
					{
						return false;
					}
				}
			}
		}
		
		return true;
	}

	
	//method getValueIn: returns the value int the given "box"
	public static int getValueIn(int row, int col)
	{
		return board[row][col];
	}
	
	//method getAllowedValues: checks if there is no number-repetition in any row, column and 3x3 square
	public static boolean[] getAllowedValues(int row, int col)
	{
		boolean[] allowedNumbers = new boolean[9];
		
		for(int k = 0; k <= 8; k++)
		{
			allowedNumbers[k] = true;
		}
		
		int value = 0;
		
		
		for(int column = 0; column <= 8; column++)
		{			
			if(column != col)
			{
				value = board[row][column];
				
				if(value > 0)
				{
					allowedNumbers[value-1] = false;
				}
			}
		}
		
		
		
		for(int rows = 0; rows <= 8; rows++)
		{			
			if(rows != row)
			{
				value = board[rows][col];
				
				if(value > 0)
				{
					allowedNumbers[value-1] = false;
				}
			}
		}
		
		
		
		for(int x = row - (row % 3); x <= (row + 2) - (row % 3); x++)
		{			
			for(int y = col - (col % 3); y <= (col + 2) - (col % 3); y++)
			{
				if(x != row && y != col)
				{
					value = board[x][y];
					
					if(value > 0)
					{
						allowedNumbers[value-1] = false;
					}
				}
			}
		}
		
		
		return allowedNumbers;
	
	}
	
	//method isFull: creates a 0s'counter that counts if there are any 0s left in the board.
	// 				 if so, it returns false, otherwise it returns true.
	public static boolean isFull()
	{
		int sumOfZeros = 0;
		
		for(int row = 0; row <= 8; row++)
		{
			for(int col = 0; col <= 8; col++)
			{
				if(board[row][col] == 0)
				{
					sumOfZeros++;
				}
			}
		}
		
		if(sumOfZeros > 0)
		{
			return false;
		}
		
		else
		{
			return false;
		}
		
	}
	
	//method reset: resets the numbers in the board to 0s and then re-adds the initial numbers.
	//  			then uses main(new String[0]). (it calls the main method, that is in the other class,
	// 												and, saying new String[0], it basically makes it restart from the beginning)
	public static void reset()
	{       
		System.out.println();
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println("-----------------------------------------------------");
		System.out.println("-----------------------------------------------------");
		System.out.println();
		System.out.println();
		
		for (int rows = 0; rows <= board.length - 1; rows++)
		{
			for (int columns = 0; columns <= board[rows].length - 1; columns++)
			{		
				board[rows][columns] = 0;
			}
		}
		
		NicoloFrisianiSudoku.setTheStartingBoard();
		
		NicoloFrisianiSudoku.main(new String[0]);
		
	}
	
}
