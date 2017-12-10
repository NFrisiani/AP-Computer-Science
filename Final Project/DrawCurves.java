/*
 * Nicolo Frisiani
 * 
 * AP COMPUTER SCIENCE 
 * 
 * 12/17/2013
 * 
 * Final Project 
 * 
 * DrawCurves Class:
 * 
 * -Builds an array of points for the athlete with which it's called
 * 
 * 
 * -Plots the points starting with an y=0 as coordinate 200
 * 
 * 
 * -Draws some sort of cartesian graph to show the points of the athlete at the respective race or train
 * 
 *  
 * IMPORTANT INFORMATIONS TO UNDERSTAND THE PROGRAM:
 * 
 * nothing.
 * Except the coordinates and numbers' operations used to find coordinates that can be confusing, the logic is very straightforward 
 * 
 */



import java.awt.*;
import javax.swing.JPanel;


public class DrawCurves extends JPanel
{
	static int points[];
	static int startX = 0;
	static int endingY;
	
	
	public DrawCurves(int[] data)
	{
		int counter = 0;
		
		//for loop to count how many numbers in the data array are zeros and to not copy them into the points array
		for(int i = 0; i < data.length; i++)
		{
			if(data[i] != 0)
			{
				counter++;
			}
		}
		
		points = new int[counter];
		
		for(int i = 0; i < counter-1; i++)
		{
			points[i] = data[i];
		}
		
	}
	
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 1300, 800);
		
		g.setColor(Color.BLACK);
		endingY = points[0];
		
		g.drawString("100", 30, 200);
		
		g.drawString("P", 10, 350);
		g.drawString("o", 10, 365);
		g.drawString("i", 10, 380);
		g.drawString("n", 10, 395);
		g.drawString("t", 10, 410);
		g.drawString("s", 10, 425);
		
		g.drawString("Performance #", 300, 650);
		
		for(int p = 1; p < 10; p ++)
		{
			g.drawString(""+(100 - 20*p), 30, 200 + (40*p));
		}
		
		//for loop to draw the lines to plot the points
		for(int x = 0; x < points.length-1; x++)
		{
			
				g.drawLine(startX, 2*endingY, startX+100, 2*(200-points[x+1]));
			
			
			startX = ((x+1)*100);
			endingY = 200-points[x+1];
			
			g.drawString((x+1)+"", 100*(x+1), 600);
		}
		
		
		
		g.setColor(Color.WHITE);
		g.fillRect(((points.length-1)*100), 0, 1000, 500);
	}
	
}
