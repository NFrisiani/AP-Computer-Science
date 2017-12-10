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
 * DTRankButtons Class:
 * 
 * -Creates two 2D arrays with all the training and the races of all the athletes
 * 
 * 
 * -Finds the biggest and the smallest time of every athlete and puts them into their respective array (maxRace/maxTrain array or minRace/minTrain array)
 * 
 *  
 * -Finds the difference between the numbers in the maxRace array and their respective number in the minRace and stores the differences
 *  in a ÆTime array
 *  
 *  
 * -Sorts the ÆTime array and creates a 2D Object array with the sorted Ætimes and the information of the athlete that made them
 * 
 * 
 * -Calls the PerfRegTable class with that 2D Object array
 * 
 * 	
 * 
 * IMPORTANT INFORMATION TO UNDERSTAND THE PROGRAM:
 * 
 * -DT in  DTTrain and DTRace stands for Delta Time
 * 
 */

import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.*;


public class DTRankButtons extends JPanel implements ActionListener 
{
	JButton Training = new JButton("Trains' Performance Regularity");
	JButton Races = new JButton("Races' Performance Regularity");
	DecimalFormat df = new DecimalFormat("##.##"); //used to make appear all the numbers in the ranking with the same number of sig figs
	static ImageIcon back = new ImageIcon("back.jpg"); 

	double[][] AthlTrains = new double[ClassMain.numAtl][ClassMain.trains];
	double[][] AthlRaces = new double[ClassMain.numAtl][ClassMain.races];
	
	double maxTrain[];
	double maxRace[];
	double minTrain[];
	double minRace[];
	
	double DTTrain[];
	double DTRace[];
	
	double DTTrainUnSort[];
	double DTRaceUnSort[];
	
	JFrame frame = new JFrame();
	
	Object raceData[][];
	Object trainData[][];
	
	
	public DTRankButtons()
	{
		this.add(Training);
		Training.addActionListener(this);
		
		this.add(Races);
		Races.addActionListener(this);
		
		
		int counterTrain = 0;
		int counterRace = 0;
		
		//for loop to fill the AthlTrains array with all the trains' times of all the athletes
		for(int i = 0; i < ClassMain.numAtl; i++)
		{
			for(int x = 0; x <= ClassMain.array.length-1; x++)
			{
				if(ClassMain.array[x][3] != null)//not to run in a NullPointerException
				{
					if(((Boolean)(ClassMain.array[x][3])) == false && ((Integer)(ClassMain.array[x][4])) == i)//main array column #3 = Boolean iRace
																											  //main array column #4 = bibNumber
					{ 
							AthlTrains[i][counterTrain] = ((Double)(ClassMain.array[x][5]));
							counterTrain++;
					}
				}
			}
			
			counterTrain = 0;
		}
		
		//for loop to fill the AthlRaces array with all the races' times of all the athletes
		for(int i = 0; i < ClassMain.numAtl; i++)
		{
			for(int x = 0; x <= ClassMain.array.length-1; x++)
			{
				if(ClassMain.array[x][3] != null)//not to run in NullPointerException
				{
					if(((Boolean)(ClassMain.array[x][3])) == true && ((Integer)(ClassMain.array[x][4])) == i)//main array column #3 = Boolean iRace
																											 //main array column #4 = bibNumber
					{ 
							AthlRaces[i][counterRace] = ((Double)(ClassMain.array[x][5]));
							counterRace++;
					}
				}
			}
			
			counterRace = 0;
		}
		
		
		
		maxTrain = new double[AthlTrains.length]; 
		minTrain = new double[AthlTrains.length];
		
		for(int x = 0; x < AthlTrains.length; x++)
		{
			maxTrain[x] = findLargest(AthlTrains[x]);
		}
		
		for(int i = 0; i < AthlTrains.length; i++)
		{
			minTrain[i] = findSmaller(AthlTrains[i]);
		}
		
		DTTrain = new double[maxTrain.length];
		
		for(int k = 0; k < maxTrain.length; k++)
		{
			DTTrain[k] = maxTrain[k] - minTrain[k];
		}
		
		
		
		maxRace = new double[AthlRaces.length];
		minRace = new double[AthlRaces.length];
		
		for(int x = 0; x < AthlRaces.length; x++)
		{
			maxRace[x] = findLargest(AthlRaces[x]);
		}
		
		
		for(int i = 0; i < AthlRaces.length; i++)
		{
			minRace[i] = findSmaller(AthlRaces[i]);
		}
		
		DTRace = new double[maxRace.length];
		
		for(int k = 0; k < maxRace.length; k++)
		{
			DTRace[k] = (maxRace[k] - minRace[k]);
		}
		
		
		MergeSort.sort(DTTrain);
		MergeSort.sort(DTRace);

		raceData = new Object[DTRace.length][5];
		
		//for loop to fill the raceData Object array with which I am going to call the Table class
		for(int i = 0; i <= DTRace.length - 1; i++)
		{
			raceData[i][0] = i+1;
			
			for(int k = 0; k < DTRace.length; k++)
			{
				if((maxRace[k] - minRace[k]) == DTRace[i])
				{	
					raceData[i][1] = k;
					
					if(ClassMain.array[k][0] != null)//not to run in a NullPointerException
					{
						raceData[i][2] = ClassMain.array[k][2];
						
						if(((Boolean)ClassMain.array[k][0]))//main array at column #0 = boolean isBoy 
						{
							raceData[i][3] = "Boy";
						}
						else
						{
							raceData[i][3] = "Girl";
						}
					}
				}
			}
			
			raceData[i][4] = df.format(DTRace[i]);
			
		}	
	
		
		trainData = new Object[DTTrain.length][5];
		
		//for loop to fill the raceData Object array with which I am going to call the Table class
		for(int i = 0; i <= DTTrain.length - 1; i++)
		{
			trainData[i][0] = i+1;
			
			for(int k = 0; k < DTTrain.length; k++)
			{
				if((maxTrain[k] - minTrain[k]) == DTTrain[i])
				{	
					trainData[i][1] = k;
					
					if(ClassMain.array[k][0] != null)//not to run in a NullPointerException
					{
						trainData[i][2] = ClassMain.array[k][2];
						
						if(((Boolean)ClassMain.array[k][0]))//main array at column #0 = boolean isBoy
						{
							trainData[i][3] = "Boy";
						}
						else
						{
							trainData[i][3] = "Girl";
						}
					}
				}
			}
			
			trainData[i][4] = df.format(DTTrain[i]);
			
		}	
	}
	
	
	public void paintComponent(Graphics g)
	{
		 back.paintIcon(this, g, 0, 0); 
	}
	
	public void actionPerformed(ActionEvent e) 
	{	
		if(e.getSource() == Training)
		{
			if(((String)trainData[1][2]).equals((String)trainData[2][2]))//checks if there is no trains times input yet, and in that case it
																		 //doesn't show the ranking table but a message
			{
				JFrame frame = new JFrame();
				String message = "To see the performance regularity ranking, you have to input more than one train";
				
				JOptionPane.showMessageDialog(frame, message);
			}
		
			else
			{
				PerfRegTable table  = new PerfRegTable(trainData);
				table.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				table.setSize(600, 600);
				table.setTitle("RANKING TABLE");
				table.setVisible(true);
			}
			
		}
		
		else if (e.getSource() == Races)
		{
			
			if(((String)raceData[1][2]).equals((String)raceData[2][2]))//checks if there is no races times input yet, and in that case it
				 												       //doesn't show the ranking table but a message
			{
				JFrame frame = new JFrame();
				String message = "To see the performance regularity ranking, you have to input more than one race";
				
				JOptionPane.showMessageDialog(frame, message);
			}
			
			else 
			{
				PerfRegTable table  = new PerfRegTable(raceData);
				table.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				table.setSize(600, 600);
				table.setTitle("RANKING TABLE");
				table.setVisible(true);
			}
			
		}	
	}
	
	

	
	public static double findLargest(double[] numOfPerf)
	{  
	    double largest = numOfPerf[0];  
	    
	    for(int i = 1; i < numOfPerf.length; i++)
	    {  
	        if(numOfPerf[i] > largest)
	        {  
	            largest = numOfPerf[i];  
	        }  
	    } 
	    
	    return largest;
	}
	
	
	public static double findSmaller(double[] numOfPerf)
	{  
	    double smaller = numOfPerf[0];  
	    
	    for(int i = 1; i < numOfPerf.length; i++)
	    {  
	        if(numOfPerf[i] < smaller && numOfPerf[i] != 0)
	        {  
	            smaller = numOfPerf[i];  
	        }  
	    } 
	    
	    return smaller;
	}

}
		