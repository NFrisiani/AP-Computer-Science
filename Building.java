/*
 * Graphics Lab 04 (building)
 * 
 * MIDTERM PROJECT
 * 
 * Nicolo Frisiani
 * 
 * 10/09/2013
 * 
 * this is the building class it creates a colored facade with two yellow windows and a black door
 * 
 */






import java.awt.*;


// class that creates the building (Facade + windows + door)
public class Building
{
	
	private Color facadeColor; 
	
	
	public Building(Graphics g, Color fc, int x) // building class' constructor
	{
		
		//drawing the facade (with a variable color) and
		//drawing the windows and the door
		//all with a variable "x" coordinate to be able to draw many of them in different places
		
		facadeColor = fc;
		g.setColor(facadeColor);
		g.fillRect(x, 280, 200, 220);
		g.setColor(Color.BLACK);
		g.fillRect(x + 70, 400, 60, 100);
		g.setColor(Color.YELLOW);
		g.fillRect(x + 25, 320, 50, 50);
		g.fillRect(x + 125, 320, 50, 50);
		
	}	
	
}
