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
 * DrawRankGraph Class:
 * 
 * -draws as many "points columns" as many are the athletes with points and all of them in a different random color
 * 
 * 
 * -for every column, it draws a String with the name of the "owner" of the column of the same color of the column
 * 
 * 
 * 
 * IMPORTANT INFORMATIONS TO UNDERSTAND THE PROGRAM:
 * 
 * -I did all the things involving the MouseListener so that the user can click on the names and the respective column is going 
 * 	to become black to make the user understand what column corresponds to what name
 * 
 * -The mouseListener works with a rectangle of coordinates starting from where the string of the name begins to where it ends, and checks if 
 *  the user clicks inside that rectangle.
 *  
 * -I found the methods e.getX() and e.getY() on the API
 * 
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DrawRankGraph extends JPanel implements MouseListener
{	
	static int points[][];
	static int startX = 50;
	static int counter = 0;
	static int[] totalP = new int[ClassMain.numAtl];
	static String names[] = new String[ClassMain.numAtl];
	
	static int[][] namePos = new int[2][ClassMain.numAtl];
	
	static Color color[] = new Color[ClassMain.numAtl];
	static Color tempCol[] = new Color[ClassMain.numAtl]; //used to set the color back after a string has been clicked
	
	static int mouseX;
	static int mouseY;
	
	
	
	
	public DrawRankGraph(int data[][])
	{
		addMouseListener(this);
		
		//creates an array of random colors
		for(int h = 0; h < ClassMain.numAtl; h++)
		{
			color[h] = randomColor();
		}
		
		//copies the array into a temporary array
		for(int l = 0; l < color.length; l++)
		{
			tempCol[l] = color[l];
		}
		
		points = data;
	
		for(int x = 0; x < totalP.length; x++)
		{
			totalP[x] = 0;
		}
		
		for(int i = 0; i < points[0].length; i++)
		{
			if(points[0][i] != 0)
			{
				counter++;
			}
		}
		
		//fills the totalP array with the sum of all the points for each athlete
		for(int x = 0; x < points.length; x++)
		{
			for(int u = 0; u < points[0].length; u++)
			{
				totalP[x] += points[x][u];
			}
		}
		
		//fills an array of names with all the names of the athletes
		for(int t = 0; t < names.length; t++)
		{	
			for(int i = 0; i < ClassMain.array.length; i++)
			{
				if(ClassMain.array[i][0] != null) //not to run in a NullPointerException
				{
					if(((Integer)ClassMain.array[i][4]) == t)
					{
						names[t] = (String)(ClassMain.array[i][2]);
						break;
					}
				}
			}	
		}	
	}

	
	
	//returns a random color
	public Color randomColor()
	{
		int r = (int)(Math.random()*255);
		int g = (int)(Math.random()*255);
		int b = (int)(Math.random()*255);
		
		Color color = new Color(r, g, b);
		
		return color;
	}
	
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 2000, 800);
		
		for(int t = 0; t < totalP.length; t++)
		{	
			if(names[t] != null) //not to run in a NullPointerException
			{
				for(int i = 0; i < ClassMain.array.length; i++)
				{
					g.setColor(color[t]);
					
					if(t<8)
					{
						g.drawString(names[t], t*150, 50);
						namePos[0][t] = t*150;//stores the x position of the string
						namePos[1][t] = 50;//stores the y position of the string
						break;
					}
					
					else
					{
						g.drawString(names[t], ((t-8))*150, 100);
						namePos[0][t] = (t-8)*150;//stores the x position of the string
						namePos[1][t] = 100;//stores the y position of the string
						break;
					}
				}
			
			
			g.drawString(""+totalP[t], startX, (700-totalP[t])-15);//draws the total amount of points in top of each column
			g.fillRect(startX, (700-totalP[t]), 20, totalP[t]);
			
			startX = (t+1)*75;
			
			}
		}
	}


	@Override
	public void mouseClicked(MouseEvent e) 
	{
		
	}


	@Override
	public void mouseEntered(MouseEvent e) 
	{
		
		
	}


	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent e) 
	{
		mouseY = e.getY();
		mouseX = e.getX();
		
		
		//for loop to find if the user clicked inside the "box" of the String 
		//if he did, it changes the color of the string and of the respective column to black
		for(int q = 0; q < ClassMain.numAtl; q++)
		{	
			if(mouseX >= namePos[0][q] && mouseX <= namePos[0][q]+75 && mouseY >= namePos[1][q]-10  &&  mouseY <= namePos[1][q])
			{
				tempCol[q] = color[q];
				color[q] = Color.black;
			}
		}
			
		repaint();
		
	}


	
	public void mouseReleased(MouseEvent e) 
	{
		//for loop to set the color back to the beginning ones when the mouse is released
		for(int y = 0; y < color.length; y++)
		{
			color[y] = tempCol[y];
		}
			
		repaint();
	}
}
