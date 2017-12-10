/*
 * Graphics Lab 04 (church)
 * 
 * MIDTERM PROJECT
 * 
 * Nicolo Frisiani
 * 
 * 10/09/2013
 * 
 * this is the church class (that extends the house one) and adds a steeple and a cross to the house
 * 
 */






import java.awt.*;


// class to create a church (church is-a house)
public class Church extends House
{
	
	private int x;
	private Color fc; 
	
	
	public Church(Graphics g, Color fc1, int x1) // church class' constructor
	{
		
		super(g, fc1, x1); // passing the information to the house constructor
		x = x1;
		fc = fc1;
		drawSteeple(g); // calling the method to draw the steeple
		drawCross(g);	// calling the method to draw the cross
		
	}
	
	
	public void drawSteeple(Graphics g) // method to draw the steeple (of the same color of the facade),
	{									// creating a polygon of the shape of a steeple and filling it with the facade color
		
		Polygon steeple = new Polygon();
		steeple.addPoint(x + 200, 280);
		steeple.addPoint(x + 200, 140);
		steeple.addPoint(x + 175, 100);
		steeple.addPoint(x + 150, 140);
		steeple.addPoint(x + 150, 240);    
		
		g.setColor(fc);
		g.fillPolygon(steeple);
		
	}
	
	
	public void drawCross(Graphics g) // method to draw the cross on the top of the steeple, drawing to black lines.
	{
		
		g.setColor(Color.BLACK);
		g.drawLine(x + 175, 100, x + 175, 60);
		g.drawLine(x + 160, 72, x + 190, 72);
		
	}
	
}