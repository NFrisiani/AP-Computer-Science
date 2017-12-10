import java.util.Scanner;


public class NicoloFrisianiSudoku {

	
	static NicoloFrisianiSudokuPuzzle game = new NicoloFrisianiSudokuPuzzle();
	
	static Scanner input = new Scanner(System.in);
	
	static int row = 0;
	static int col = 0;
	static int value = 0;
	static int counter = 0;
	
	//main method: 
	//shows title and set the starting numbers on the board
	//asks to input 1 or 0, to either restart or continue
	//keeps asking for a row, a column and a value until the board is full
	//adds the number in the right box, and then checks if the number respects the rules. if it doesn't it changes it back to a 0
	
	public static void main(String[] args)
	{
		
			System.out.println("THIS IS A SUDOKU GAME!");
		
			setTheStartingBoard();
		
		
			while (!game.isFull())
			{
		
				System.out.println(game.toString());
			
				System.out.println();
				System.out.println();
				System.out.println("if want to restart, enter 0, otherwise enter 1 to continue");
				counter = input.nextInt();
				if (counter == 0)
				{
					game.reset();
				}
				
				System.out.println();
				System.out.println();
				System.out.println("Enter the row where you want to enter the value (the first row is 0) ");
				row = input.nextInt() - 1;
				System.out.println();
				System.out.println("Enter the column where you want to enter the value (the first column is 0) ");
				col = input.nextInt() - 1;
				System.out.println();
				System.out.println("Enter the value ");
				value = input.nextInt();
		
		
				if(game.start[row][col] && game.checkPuzzle())
				{
					game.addGuess(row, col, value);
				
					if(!game.checkPuzzle())							//Luka suggested me to try to nest the two if statements
					{
						NicoloFrisianiSudokuPuzzle.board[row][col] = 0;
						System.out.println();
						System.out.println("The value that you entered doesn't respect sudoku's rules ");
						System.out.println();
					}
				}
				else
				{
					System.out.println();
					System.out.println("The move you made is not valid");
					System.out.println();
				}
		
			}
		
			System.out.println();
			System.out.println();
			System.out.println("Good Job!! You finished the Sudoku!!");
		
		
		
	}
	
	//method setTheStartingBoad --> sets the initial numbers in the board calling the addInitial method of the other class
	public static void setTheStartingBoard()
	{
		game.addInitial(0,4,2);
		game.addInitial(0,5,8);
		game.addInitial(0,7,7);
		game.addInitial(1,3,3);
		game.addInitial(1,8,8);
		game.addInitial(2,2,8);
		game.addInitial(2,5,1);
		game.addInitial(2,8,4);
		game.addInitial(3,1,4);
		game.addInitial(3,6,7);
		game.addInitial(3,8,6);
		game.addInitial(4,1,8);
		game.addInitial(4,3,7);
		game.addInitial(4,4,5);
		game.addInitial(4,5,6);
		game.addInitial(4,7,4);
		game.addInitial(5,0,5);
		game.addInitial(5,2,7);
		game.addInitial(5,7,1);
		game.addInitial(6,0,9);
		game.addInitial(6,3,8);
		game.addInitial(6,6,6);
		game.addInitial(7,0,8);
		game.addInitial(7,5,9);
		game.addInitial(8,1,2);
		game.addInitial(8,3,5);
		game.addInitial(8,4,4);
		
		
		
	}
}




