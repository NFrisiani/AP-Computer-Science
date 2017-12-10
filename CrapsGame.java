// Implements the game of Craps logic

public class CrapsGame
{
	

	
	  private int point; 
  /**
   *  Calculates the result of the next dice roll in the Craps game.
   *  The parameter total is the sum of dots on two dice.
   *  point is set to the saved total, if the game continues,
   *  or 0, if the game has ended.
   *  Returns 1 if player won, -1 if player lost,
   *  0 if player continues rolling.
   */
	 
	
  public enum ProcessRoll {NEW_ROLL, KEEP_ROLLING};
  
  ProcessRoll stateRoll = ProcessRoll.NEW_ROLL;

  public int processRoll (int total) {
	  
  
  
   int result = 0;
  
   
  switch (stateRoll) 
  {
	    
  case NEW_ROLL :
	  
		  
		  if(total == 7 || total == 11)
		  { 
			  result = 1;
			  point = 0;
		  }
	  
	  
		  else if (total == 2 || total == 3 || total == 12) 
		  {
			  result = -1;
			  point = 0;
		  }
	 
		  
		  else 
		  {
			  result = 0;
			  point = total;
			  stateRoll = ProcessRoll.KEEP_ROLLING;
		  }
		  
		 
	  
	  
  break;
	  
	  
  case KEEP_ROLLING :
  
  		if (total == point)
	  {
		  result = 1;
		  point = 0;
		  stateRoll = ProcessRoll.NEW_ROLL;
	  }
	 
	  
	  else if (total == 7)
	  {
		  result = -1;
		  point = 0;
		  stateRoll = ProcessRoll.NEW_ROLL;
	  }
	  
	  
	  else 
	  {
		  result = 0;
	  }
	 
		  
  break;
  
  
  
  default : System.out.println("There was a mistake...try again");
	
  
  }
return result;
  
  
//  return result;
  }

  
  public int getPoint()
  {
    return point;
  }

}
