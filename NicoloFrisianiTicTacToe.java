
public class NicoloFrisianiTicTacToe {

	
	static NicoloFrisianiTTTRunner run = new NicoloFrisianiTTTRunner();
	
	static char editedBoard[][] = new char[3][3];
	
	//constructor: "fills" an array of characters (3x3) with blank spaces
	public NicoloFrisianiTicTacToe()
	{

	for (int rows = 0; rows <= editedBoard.length - 1; rows++)
	{
		for (int columns = 0; columns <= editedBoard[rows].length - 1; columns++)
		{		
			editedBoard[rows][columns] = ' ' ;
		}
	}
	
	}
	
	
	//addMove method:
	//gets the input of row and column form the user, and depending on whose turn is it, adds an X or an O in the right spot
	public static char[][] addMove(int row, int col)
	{
	
		if(whoseTurn(run.getCounter()) == 1)
		{
			editedBoard[row][col] = 'X';
		}
		
		
		else 
		{
			editedBoard[row][col] = 'O';
		}
		
		
		
		return editedBoard;
		
	}
	

	//getEditedBoard method: used to export the edited board into the Runner Class
	public static char[][] getEditedBoard()
	{
		return editedBoard;
	}
	

	//displayBoard method: prints the edited board
	public static void displayBoard(char[][]edBoard)
	{
		System.out.println("-------------");
		System.out.println("| " + String.valueOf(edBoard[0][0]) + " | " + String.valueOf(edBoard[0][1]) + " | " + String.valueOf(edBoard[0][2]) + " |");
		System.out.println("-------------");
		System.out.println("| " + String.valueOf(edBoard[1][0]) + " | " + String.valueOf(edBoard[1][1]) + " | " + String.valueOf(edBoard[1][2]) + " |");
		System.out.println("-------------");
		System.out.println("| " + String.valueOf(edBoard[2][0]) + " | " + String.valueOf(edBoard[2][1]) + " | " + String.valueOf(edBoard[2][2]) + " |" );
		System.out.println("-------------");
	}
	
	//whoseTurn method: 
	//takes the counter of how many times did the program ask the user to input the "coordinates" and using the mod operator, decides whose turn it is
	public static int whoseTurn(int k)
	{
		if((k % 2) == 0)
		{
			return 1;
		}
		
		else 
		{
			return 2;
		}
	}
	
	
	//isWon method: checks all the winning possibilities, and return false if those are not true
	//it also checks if at least one of the three in the row is not a space, so that at the beginning it doesn't return true 
	//just because there are three spaces (that are equal to each other)
	public static boolean isWon()
	{
		if ((editedBoard[2][0] == editedBoard[1][1]) && (editedBoard[2][0] == editedBoard[0][2]) && editedBoard[2][0]!= ' ')
		{
			return true;
		}

		if ((editedBoard[2][2] == editedBoard[1][1])&& (editedBoard[2][2] == editedBoard[0][0]) && editedBoard[2][2]!= ' ')
		{
			return true;
		}
	
		if ((editedBoard[0][0] == editedBoard[1][0]) && (editedBoard[0][0] == editedBoard[2][0]) && editedBoard[0][0]!= ' ')
		{
			return true;
		}
	
		if ((editedBoard[0][1] == editedBoard[1][1]) && (editedBoard[0][1] == editedBoard[2][1]) && editedBoard[0][1]!= ' ')
		{
			return true;
		}
		  
		if ((editedBoard[0][2] == editedBoard[1][2]) && (editedBoard[0][2] == editedBoard[2][2]) && editedBoard[0][2]!= ' ')
		{   
			return true;
		}	  
	  
		if ((editedBoard[0][0] == editedBoard[0][1]) && (editedBoard[0][0] == editedBoard[0][2]) && editedBoard[0][0]!= ' ')
		{
			return true;
		}	   
		
		if ((editedBoard[1][0] == editedBoard[1][1]) && (editedBoard[1][0] == editedBoard[1][2]) && editedBoard[1][0]!= ' ')
		{   
			return true;
		}	 
	
		if ((editedBoard[2][0] == editedBoard[2][1]) && (editedBoard[2][0] == editedBoard[2][2]) && editedBoard[2][0]!= ' ')
		{	   
			return true;
		}	 
		
		else
		{
		   return false;
		}
		
		
	}
	
	
	//whoWon method:
	//using the whoseTurn method, establish if the winner was X or O
	public static void whoWon()
	{
		if(whoseTurn(run.getCounter()) == 1)
		{
			System.out.println();
			System.out.println();
			System.out.println("0 won!!");
		}
		
		else
		{
			System.out.println();
			System.out.println();
			System.out.println("X won!!");
		}
		
	}
	
	
	//restartGame method:
	//when called, resets the board.
	public static void restartGame()
	{
		
		for (int rows = 0; rows <= editedBoard.length - 1; rows++)
		{
			for (int columns = 0; columns <= editedBoard[rows].length - 1; columns++)
			{		
				editedBoard[rows][columns] = ' ' ;
			}
		}
		
	}
	
	
}
