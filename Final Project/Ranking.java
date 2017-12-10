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
 * Ranking Class:
 * 
 * -Builds a 1D array that has all the times of a race of every athlete.
 * 		
 * 		the "main" method expects a race variable that tells what race to rank, a isRace boolean variable that tells if to rank a race or a training
 * 		and a showTable boolean that tells if two show the ranking table on the screen or if to just do the ranking without showing anything
 * 
 * 
 * -Calling the MergeSort class sorts the times inside the array
 * 
 * 
 * -Creates an array of Objects that has the sorted times and the important informations of the corresponding athletes
 * 
 * 
 * -Calls if showTable is true, calls the RankingTable class with the array of Objects
 * 
 * 
 * 
 * IMPORTANT INFORMATIONS TO UNDERSTAND THE PROGRAM:
 * 
 * 	the showTable variable exists because when I get the points that the athletes scored in each race, I need to do a ranking, but not 
 *  to print any table
 */

import java.awt.Container;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JFrame;



public class Ranking 
{
	//data 2D array to call the RankingTable Class
	static Object[][] data;
	
	//creating a DecimalFormat object to print all the timings in the same format
	static DecimalFormat df = new DecimalFormat("##.##");
	
	static double[] raceRank;
	static double[] trainRank;
	
	
	//read the comment on the top of the class to understand better the arguments of the constructor
	public static void rank(int race, boolean isRace, boolean showTable)
	{
		if(isRace)
		{
			
			double[] raceRankWithNull = new double[ClassMain.numAtl];	
			
			
			int counter = 0; //used to place the timings in the "next" position in the array
			
			//fills an array with all the timings of the race "int race" including the zeros (the times not entered yet by the user)
			for(int x = 0; x <= ClassMain.array.length-1; x++)
			{
				if(ClassMain.array[x][3] != null)
				{
					if(((Boolean)(ClassMain.array[x][3])) == true && ((Integer)(ClassMain.array[x][1])) == race)
					{ 
						raceRankWithNull[counter] = ((Double)(ClassMain.array[x][5]));
						counter++;
					}
				}
			}
			
			
			int rankLength = 0;
			
			//finds how many numbers in the array are not zeros
			for(int k = 0; k < raceRankWithNull.length; k++)
			{
				if(raceRankWithNull[k] != 0)
				{
					rankLength++;
				}
			}
	
			raceRank = new double[rankLength];
			
			int lengthCounter = 0;
			
			//takes the zeros out of the array
			for(int k = 0; k < raceRankWithNull.length; k++)
			{
				if(raceRankWithNull[k] != 0)
				{
					raceRank[lengthCounter] = raceRankWithNull[k];
					lengthCounter++;
				}
			}
			
				
			MergeSort.sort(raceRank);
			
			//creates an object array to call the RankingTable
			data = new Object[raceRank.length][5];
			
			
			//nested for loops to fill the data array going
			
			//goes throw all the times of the races
			for(int i = 0; i <= raceRank.length - 1; i++)
			{
				//goes throw all the main array 
				for(int k = 0; k <= ClassMain.array.length -1; k++)
				{
					//checks if the main array in that row at a "random" column is not null not to run in a NullPointerException
					if(ClassMain.array[k][0] != null)
					{
						//checks if the main array at the position 1 (raceNumber) is equal to the "int race" (that is an argument of the constructor)
						//and if the main array at the position 3 (isRace) is true
						if(((Integer)ClassMain.array[k][1]) == race && ((Boolean)ClassMain.array[k][3]))
						{
							if(raceRank[i] != 0)
							{
								//the main array at the position 5 is the time
								if(((Double)ClassMain.array[k][5]) == raceRank[i])
								{
									data[i][0] = i+1;
									data[i][1] = ClassMain.array[k][4];
									data[i][2] = ClassMain.array[k][2];
						
									//the main array at the position 0 is the boolean (isBoy)
									if(((Boolean)ClassMain.array[k][0]))
									{
										data[i][3] = "Boy";
									}
										
									else 
									{
										data[i][3] = "Girl";
									}
							
									data[i][4] = df.format(ClassMain.array[k][5]);
								}
							}
						}
					}
				}
			}		
		}
		
		else//else if isRace is false, it does the same thing but for trainings
		{
			double[] trainRankWithNull = new double[ClassMain.numAtl];	
			
			int counter = 0;
	
			for(int x = 0; x <= ClassMain.array.length-1; x++)
			{
				if(ClassMain.array[x][3] != null)
				{
					if(((Boolean)(ClassMain.array[x][3])) == false && ((Integer)(ClassMain.array[x][1])) == race)
					{ 
						trainRankWithNull[counter] = ((Double)(ClassMain.array[x][5]));
						counter++;
					}
				}
			}
			
		
			int rankLength = 0;
				
			for(int k = 0; k < trainRankWithNull.length; k++)
			{
				if(trainRankWithNull[k] != 0)
				{
					rankLength++;
				}
			}
		
			trainRank = new double[rankLength];
				
			int lengthCounter = 0;
				
			for(int k = 0; k < trainRankWithNull.length; k++)
			{
				if(trainRankWithNull[k] != 0)
				{
					trainRank[lengthCounter] = trainRankWithNull[k];
					lengthCounter++;
				}
			}
			
				
			MergeSort.sort(trainRank);
			
			data = new Object[trainRank.length][5];
			
			
			for(int i = 0; i <= trainRank.length - 1; i++)
			{
				for(int k = 0; k <= ClassMain.array.length -1; k++)
				{
					if(ClassMain.array[k][0] != null)
					{
						if(((Integer)ClassMain.array[k][1]) == race && !((Boolean)ClassMain.array[k][3]))
						{
							if(trainRank[i] != 0)
							{
								if(((Double)ClassMain.array[k][5]) == trainRank[i])
								{
									data[i][0] = i+1;
									data[i][1] = ClassMain.array[k][4];
									data[i][2] = ClassMain.array[k][2];
						
									if(((Boolean)ClassMain.array[k][0]))
									{
										data[i][3] = "Boy";
									}
							
									else 
									{
										data[i][3] = "Girl";
									}
							
									data[i][4] = df.format(trainRank[i]);
								}
							}
						}
					}
				}
			}	
        }
		
		
		if(showTable)//if the showTable boolean is true, it calls the class RankingTable with the data array just builded
		{
			RankingTable table  = new RankingTable(data);
			table.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			table.setSize(600, 600);
			table.setTitle("RANKING TABLE");
			table.setVisible(true);
		}
	}
	
	//used by the AthletePoints class to rank a training without showing the ranking in a table
	public static double[] getTrainRank(int k)
	{
		rank(k, false, false);
		return trainRank;
	}
	
	//used by the AthletePoints class to rank a race without showing the ranking in a table
	public static double[] getRaceRank(int k)
	{
		rank(k, true, false);
		return raceRank;
	}
	
}
