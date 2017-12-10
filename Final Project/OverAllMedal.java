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
 * OverAllMedal Class:
 * 
 * 
 * -Builds an array of points made of the sum of every point of each athlete
 * 
 * 
 * -Sorts the array to then find what position is every athlete overall in the team
 * 
 * 
 * -Depending on the position of the athlete, it draws a medal with the right number inside and of the right color
 * 
 * 
 * 
 * IMPORTANT INFORMATIONS TO UNDERSTAND THE PROGRAM:
 * 
 * 	nothing, the logic of the class is pretty straightforward 
 * 
 */



import java.awt.*;
import javax.swing.*;



public class OverAllMedal extends JPanel
{
	int pos;
	static Color color;
	int Xpos;
	int Ypos;
	String position;
	int athl;
	double[] pointsNonRanked = new double[ClassMain.numAtl];
	double[] pointsRanked = new double[ClassMain.numAtl];
	
	
	
	
	public OverAllMedal(int i)
	{	
		Xpos = 600;
		
		Ypos = 150;
		
		athl = i;
		
		pos = findTheRightMedal();
		
		position = position();
		
		color = color();
	}
	
	//fills an array with everyone's total points
	//sorts the array
	//returns the position of the athlete in the team using the sorted array
	public int findTheRightMedal()
	{ 
		int p = 0;
		
		//nested for loops to fill the array with everyone's total points
		for(int x = 0; x < AthletesPoints.getRacepoints().length; x++) //goes throw all the races
		{
			for(int k = 0; k < AthletesPoints.getRacepoints()[0].length; k++) //goes throw all the athletes
			{
				pointsNonRanked[x] += AthletesPoints.getRacepoints()[x][k];
				
			}
		}
		
		//copies the non sorted array into a temporary one
		for(int i = 0; i < pointsRanked.length; i++)
		{
			pointsRanked[i] = pointsNonRanked[i];
			
		}
		
		MergeSort.sort(pointsRanked);

		//checks in what position of the sorted array is the number at the position of the determined athlete in the unsorted array
		//and returns that position
		for(int t = 0; t < ClassMain.numAtl; t++)
		{
			if(pointsRanked[t] == pointsNonRanked[athl])
			{
				p = ClassMain.numAtl-(t+1);
				break;
			}
		}
		
		return p;
	}
	
	

	public void paintComponent(Graphics g)
	{
		g.setColor(color);
		g.fillOval(Xpos, Ypos, 100, 100);
		
		g.setFont(new Font("TimesRoman", Font.BOLD, 28));
		g.setColor(Color.BLACK);
		g.drawString(position, Xpos+25, Ypos+60);
		
		g.setFont(new Font("TimesRoman", Font.PLAIN, 25));
		g.drawString("MEDALS WON IN RACES", 40, 30);
		g.drawString("OVERALL POSITION IN THE TEAM", 450, 30);
	}
	

	public Color color() 
	{
		if(pos == 0)
		{
			return new Color(255, 215, 0);
		}
		
		if(pos == 1)
		{
			return new Color(192, 192, 192);
		}
		
		if(pos == 2)
		{
			return new Color(205, 127, 50);
		}

		return new Color(238, 0, 0);
	}

	
	
	public String position()
	{
		String p = null;
		
		if(pos == 0)
		{
			p = pos+1 +"st";
		}
		else if(pos == 1)
		{
			p = pos+1 +"nd";
		}
		else if(pos == 2)
		{
			p = pos+1 +"rd";
		}
		else
		{
			p = pos+1 +"th";
		}	
		
		return p;
	}
	
	
}
