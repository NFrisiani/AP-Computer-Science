/*
 * Graphics Lab 04 (Village)
 * 
 * MIDTERM PROJECT
 * 
 * Nicolo Frisiani
 * 
 * 10/09/2013
 * 
 * This is the super class of all the classes, 
 * and creates a village with two houses, one church and one villa
 * 
 */





import java.awt.*;
import java.applet.*;


//this class that creates the village


public class NFVillage extends Applet
{
	
	public void paint(Graphics g)   // paint method called by the applet that paint the village creating four objects of three different kind of buildings
	{
		
		g.drawString("VILLAGE", 525, 25);  // writes village on the top center of the applet
		
		House casa1 = new House(g, Color.RED, 50);			//creates an object of the House class
		Church chiesa = new Church(g, Color.CYAN, 300);	    //creates an object of the Church class  
		House casa2 = new House(g, Color.ORANGE, 550 );		//creates an object of the House class
		Villa villa = new Villa(g, Color.MAGENTA, 800);		//creates an object of the Villa class

	}
	
}
