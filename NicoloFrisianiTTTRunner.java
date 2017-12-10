import java.util.Scanner;

public class NicoloFrisianiTTTRunner
{

	static int k = 0; //counter that counts how many time did the program ask the user to enter an input
	static int row = 0;
	static int col = 0;
	static int counter = 0; //counter that if = 1 makes the game end, otherwise it resets it
	
	static Scanner input = new Scanner(System.in);
	
	//main method: 
	//-shows the title.
	//-gets the input of row and column from the user
	//-calls the addMove method of the TicTacToe class to start a game
	//-displays the board
	//-continues asking until the method isWon of the TicTacToe class is true
	//-then when there is a winner, it asks the user to input 1 or 0, if 1 --> stop  else --> calls the restartGame method of the other class
	public static void main(String[] args)
	{
		
		NicoloFrisianiTicTacToe game = new NicoloFrisianiTicTacToe();
		
		do
		{
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("THIS IS A TIC TAC TOE GAME! FIND A FRIEND TO PLAY WITH AND ENJOY!!");
			System.out.println();
		
			game.restartGame();
			
			do
			{
			
				if(game.whoseTurn(getCounter()) == 1 )
				{
					System.out.println();
					System.out.println();
					System.out.println("It's 'X' turn ");
				}
			
				else
				{
					System.out.println();
					System.out.println();
					System.out.println("It's 'O' turn ");
				}
			
				System.out.println("Please Enter the row where to put your symbol");
				row  = input.nextInt();
			
				System.out.println("Please Enter the column where to put your symbol");
				col = input.nextInt();
			
				System.out.println();
				System.out.println();
				NicoloFrisianiTicTacToe.addMove(row, col);
			
			
			
				game.displayBoard(game.getEditedBoard());
			
			
				k++;
			
				
			}while(!game.isWon());
		
			
			game.whoWon();
	
			System.out.println();
			System.out.println();
			System.out.println("if want to restart, enter 0, otherwise enter 1");
			counter = input.nextInt();
	
		}while(counter !=1);
	
	}
	
	//method used to export the counter k
	public static int getCounter()
	{
		return k;
	}
	
	//method used to export the integer row input by the user
	public static int getRow()
	{
		return row;
	}
	
	//method used to export the integer column input by the user
	public static int getCol()
	{
		return col;
	}
	
}
