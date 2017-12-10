import java.util.Scanner;


public class NicoloFrisianiRPSLS {

	
public static void main(String[] args) {
		
		int winnings = 0;
		int losses = 0;
		int k = 0;
		String rock = "rock";
		String paper = "paper";
		String scissor = "scissor";
		String lizard = "lizard";
		String spock = "spock";
	
	
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.println("THIS IS A ROCK PAPER SCISSOR LIZARD SPOCK GAME.");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Here are the rules:");
		System.out.println();
		System.out.println();
		System.out.println("-spock smashes scissor");
		System.out.println();
		System.out.println("-scissor cuts paper");
		System.out.println();
		System.out.println("-paper covers rock");
		System.out.println();
		System.out.println("-rock crushes lizard");
		System.out.println();
		System.out.println("-lizard poisons spock");
		System.out.println();
		System.out.println("-spock vaporizes rock");
		System.out.println();
		System.out.println("-rock crushes scissor");
		System.out.println();
		System.out.println("-scissor decapitates lizard");
		System.out.println();
		System.out.println("-lizard eats paper");
		System.out.println();
		System.out.println("-paper disproves spock");
		System.out.println();
		System.out.println();
		
		System.out.println("Every turn you have to type your choice between this 5 possibilities.");
		System.out.println();
		System.out.println("The computer will make a random choice between them");
		System.out.println();
		System.out.println("The Best 2 of 3 wins");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
	while (k<3 && winnings < 2 && losses < 2) {
			
		
		double random01 = (Math.random() *5);
		int random02 = (int)random01;
		
		System.out.println();
		System.out.println();
		System.out.println("Enter your choice between: rock, paper, scissor, lizard, spock ");
		System.out.println();
		String choice = input.nextLine();
		
		
		
		// if the input choice = to rock -->
		
		if (choice.equalsIgnoreCase(rock)){
		
		
			switch (random02)  
			{
		

			case 0 : 			System.out.println("The computer chose rock too. It's a tie");
								
								break;
							
								
			case 1 :			System.out.println("The computer chose paper. You Lost :(");
							
								losses++;
								k++;
								break;
				
								
			case 2 : 			System.out.println("The computer chose scissor. You Won!");
		
								winnings++;
								k++;
								break;
								
								
			case 3 :    		System.out.println("The computer chose lizard. You Won!");
		
								winnings++;
								k++;
								break;
								
							
			case 4 : 			System.out.println("The computer chose Spock. You Lost :(");
			
								losses++;
								k++;
								break;
								
								
			default :			System.out.println("Sorry, there had been an error... please try again.");
							
			
			}
		}
		
							
							
		// if the input choice = to paper -->			
							
		else if (choice.equalsIgnoreCase(paper)){
								
								
    		switch (random02)  
    		{
								

    		case 0 : 			System.out.println("The computer chose rock. You Won!");
													
    							winnings++;
    							k++;
    							break;
    							
													
    		case 1 :			System.out.println("The computer chose paper too. It's a tie");
    							
    							break;
													
										
    		case 2 : 			System.out.println("The computer chose scissor. You Lost :(");
						
    							losses++;
    							k++;
    							break;
    							
								
    		case 3 :    		System.out.println("The computer chose lizard. You Lost :(");
								
    							losses++;
    							k++;
    							break;
										
    							
    		case 4 : 			System.out.println("The computer chose Spock. You Won!");
									
								winnings++;
								k++;
								break;
								
								
    		default :			System.out.println("Sorry, there had been an error... please try again.");
    		
							
    		}					
		}
    	
    	
    	
    	// if the input choice = to scissor -->
    	
		else if (choice.equalsIgnoreCase(scissor)){
			
			
    		switch (random02)  
    		{
    								

    		case 0 : 			System.out.println("The computer chose rock. You Lost :(");
    													
    							losses++;
    							k++;
    							break;
    							
    							
    		case 1 :			System.out.println("The computer chose paper. You Won!");
    													
    							winnings++;
    							k++;
    							break;
    							
    							
    		case 2 : 			System.out.println("The computer chose scissor too. It's a tie");
    								
   								break;
   								
   								
    		case 3 :    		System.out.println("The computer chose lizard. You Won!");
    								
   								winnings++;
   								k++;
   								break;
   								
   								
    		case 4 : 			System.out.println("The computer chose Spock. You Lost :(");
    									
   								losses++;
   								k++;
   								break;
   								
   								
    		default :			System.out.println("Sorry, there had been an error... please try again.");
    		
   								
    		}					
    	}
		
    	
    	
    	// if the input choice = to lizard
    	
		else if (choice.equalsIgnoreCase(lizard)){
			
			
    		switch (random02)  
    		{
    								

    		case 0 : 			System.out.println("The computer chose rock. You Lost :(");
    													
    							losses++;
    							k++;
    							break;
    							
    							
    		case 1 :			System.out.println("The computer chose paper. You Won!");
    													
    							winnings++;
    							k++;
    							break;
    							
    										
    		case 2 : 			System.out.println("The computer chose scissor. You Lost :(");
    						
    							losses++;
    							k++;	
    							break;
    							
    							
    		case 3 :    		System.out.println("The computer chose lizard. It's a tie");
    								
    							break;
    						
    													
    		case 4 : 			System.out.println("The computer chose Spock. You Won!");
    									
    							winnings++;
    							k++;
    							break;
    							
    							
    		default :			System.out.println("Sorry, there had been an error... please try again.");
    		
    							
    		}					
    	}
    	
    	
    	
    	// if the input choice = to spock -->			
		
		else if (choice.equalsIgnoreCase(spock)){
								
								
    		switch (random02)  
    		{
								

    		case 0 : 			System.out.println("The computer chose rock. You Won!");
													
    							winnings++;
    							k++;
    							break;
							
													
    		case 1 :			System.out.println("The computer chose paper. You Lost :(");
									
    							losses++;
    							k++;
    							break;
													
										
    		case 2 : 			System.out.println("The computer chose scissor. You Won!");
					
    							winnings++;
    							k++;
    							break;
								
    							
    		case 3 :    		System.out.println("The computer chose lizard. You Lost :(");
								
    							losses++;
    							k++;
    							break;
    							
    							
    		case 4 : 			System.out.println("The computer chose Spock too. It's a tie");
    								
    							break;
								
    							
    		default :			System.out.println("Sorry, there had been an error... please try again.");
							
    		}					
		}
		
		
		else 
		{
			System.out.println("The word you entered is not valid... please try again.");
		}
    	
    	System.out.println();
    	System.out.println();
    	System.out.println();
    	System.out.println("You   Computer");
		System.out.println(" " + winnings + "       " + losses);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
    	
	}
	
	
	
	if (k==3 || winnings == 2 || losses == 2 ) 
	{
		
		if (winnings > losses) {
			
			System.out.println("Congratulations! You won the game!!!!");
			
		}
		
		else{
			
			System.out.println("Unfortunately, you lost the game... ");
			System.out.println("You'll be more lucky the next time! ;)");
		}
		
		
	}
		
		
	
	
	}
		
}
