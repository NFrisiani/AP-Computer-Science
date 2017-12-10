/*
 * Nicolo Frisiani
 * 
 * AP COMPUTER SCIENCE 
 * 
 * 12/17/2013
 * 
 * Final Project 
 * 
 * 
 * AthletesPoints Class:
 * 
 * -builds two arrays of points (one for the races points and one for the trains) assigning the following points:
 * 
 *   1st   100
 *   2nd   80
 *   3rd   65
 *   4th   55
 *   5th   40
 *   6th   32
 *   7th   25
 *   8th   15
 * >=9th   1
 * 
 * 
 * IMPORTANT INFORMATIONS TO UNDERSTAND THE PROGRAM:
 * 
 * 	none
 * 
 */


public class AthletesPoints 
{
	static int racePoints[][];
	static int trainPoints[][];
	static int races = ClassMain.races;
	static int trains = ClassMain.trains;
	static int numAtl = ClassMain.numAtl;
	
	static double rankedRaces[][] = new double[races][numAtl];
	static double rankedTrains[][] = new double[trains][numAtl];
	
	

	public static void fillPoints()
	{
		racePoints = new int[numAtl][races];
		
		//fills the racePoints array with zeros
		for(int i = 0; i < racePoints.length; i++)
		{
			for(int r = 0; r < racePoints[0].length; r++)
			{
				racePoints[i][r] = 0;
			}
		}
		
		//nested for loops to fill the racePoints array
		for(int row = 0; row < races; row++)
		{
			for(int col = 0; col < numAtl; col++)
			{
				for(int i = 0; i < ClassMain.array.length; i++)
				{
					if(ClassMain.array[i][0] != null) //not to run in a NullPointerException
					{
						//main array at column #1 = int race#;  main array at column #3 = boolean isRace;  main array at column # 5 = time  
						if(((Integer)ClassMain.array[i][1] == row+1) && ((Boolean)ClassMain.array[i][3]) && ((Double)ClassMain.array[i][5] == rankedRaces[row][col]))
						{
							if(col == 0)
							{
								racePoints[(Integer)ClassMain.array[i][4]][(Integer)ClassMain.array[i][1]-1] = 100;
							}
							
							else if(col == 1)
							{
								racePoints[(Integer)ClassMain.array[i][4]][(Integer)ClassMain.array[i][1]-1] = 80;
							}
							
							else if(col == 2)
							{
								racePoints[(Integer)ClassMain.array[i][4]][(Integer)ClassMain.array[i][1]-1] = 65;
							}
							
							else if(col == 3)
							{
								racePoints[(Integer)ClassMain.array[i][4]][(Integer)ClassMain.array[i][1]-1] = 55;
							}
							
							else if(col == 4)
							{
								racePoints[(Integer)ClassMain.array[i][4]][(Integer)ClassMain.array[i][1]-1] = 40;
							}
							
							else if(col == 5)
							{
								racePoints[(Integer)ClassMain.array[i][4]][(Integer)ClassMain.array[i][1]-1] = 32;
							}
							
							else if(col == 6)
							{
								racePoints[(Integer)ClassMain.array[i][4]][(Integer)ClassMain.array[i][1]-1] = 25;
							}
							
							else if(col == 7)
							{
								racePoints[(Integer)ClassMain.array[i][4]][(Integer)ClassMain.array[i][1]-1] = 15;
							}
							
							else if(col == 8)
							{
								racePoints[(Integer)ClassMain.array[i][4]][(Integer)ClassMain.array[i][1]-1] = 5;
							}
							
							else if(col >= 9)
							{
								racePoints[(Integer)ClassMain.array[i][4]][(Integer)ClassMain.array[i][1]-1] = 1;
							}
						}
					}
					
				}
			}
		}	
	
	
	
		trainPoints = new int[numAtl][trains];
		
		//fills the trainPoints array with zeros
		for(int i = 0; i < trainPoints.length; i++)
		{
			for(int r = 0; r < trainPoints[0].length; r++)
			{
				trainPoints[i][r] = 0;
			}
		}
		
		//nested for loops to fill the racePoints array
		for(int row = 0; row < trains; row++)
		{
			for(int col = 0; col < numAtl; col++)
			{
				for(int i = 0; i < ClassMain.array.length; i++)
				{
					if(ClassMain.array[i][0] != null) //not to run in a NullPointerException
					{
						//main array at column #1 = int race#;  main array at column #3 = boolean isRace;  main array at column # 5 = time
						if(((Integer)ClassMain.array[i][1] == row+1) && !((Boolean)ClassMain.array[i][3]) && ((Double)ClassMain.array[i][5] == rankedTrains[row][col]))
						{
							if(col == 0)
							{
								trainPoints[(Integer)ClassMain.array[i][4]][(Integer)ClassMain.array[i][1]-1] = 100;
							}
							
							else if(col == 1)
							{
								trainPoints[(Integer)ClassMain.array[i][4]][(Integer)ClassMain.array[i][1]-1] = 80;
							}
							
							else if(col == 2)
							{
								trainPoints[(Integer)ClassMain.array[i][4]][(Integer)ClassMain.array[i][1]-1] = 65;
							}
							
							else if(col == 3)
							{
								trainPoints[(Integer)ClassMain.array[i][4]][(Integer)ClassMain.array[i][1]-1] = 55;
							}
							
							else if(col == 4)
							{
								trainPoints[(Integer)ClassMain.array[i][4]][(Integer)ClassMain.array[i][1]-1] = 40;
							}
							
							else if(col == 5)
							{
								trainPoints[(Integer)ClassMain.array[i][4]][(Integer)ClassMain.array[i][1]-1] = 32;
							}
							
							else if(col == 6)
							{
								trainPoints[(Integer)ClassMain.array[i][4]][(Integer)ClassMain.array[i][1]-1] = 25;
							}
							
							else if(col == 7)
							{
								trainPoints[(Integer)ClassMain.array[i][4]][(Integer)ClassMain.array[i][1]-1] = 15;
							}
							
							else if(col == 8)
							{
								trainPoints[(Integer)ClassMain.array[i][4]][(Integer)ClassMain.array[i][1]-1] = 5;
							}
							
							else if(col >= 9)
							{
								trainPoints[(Integer)ClassMain.array[i][4]][(Integer)ClassMain.array[i][1]-1] = 1;
							}
						}	
					}
				}
			}
		}
	}
	
	public static int[][] getTrainpoints()
	{	
		//builds the rankedTrains array that will be used by the fillPoints method
		for(int k = 0; k < trains; k++)
		{
			for(int l = 0; l < Ranking.getTrainRank(k+1).length; l++)
			{
				rankedTrains[k][l] = Ranking.getTrainRank(k+1)[l];
			}
		}
			
		fillPoints();
		
		return trainPoints;
	}
	
	public static int[][] getRacepoints()
	{
		//builds the rankedRaces array that will be used by the fillPoints method
		for(int k = 0; k < races; k++)
		{
			for(int l = 0; l < Ranking.getRaceRank(k+1).length; l++)
			{
				rankedRaces[k][l] = Ranking.getRaceRank(k+1)[l];
			}
		}
		
		fillPoints();
		
		return racePoints;
	}
}
