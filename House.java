/*
 * Graphics Lab 04 (house)
 * 
 * MIDTERM PROJECT
 * 
 * Nicolo Frisiani
 * 
 * 10/09/2013
 * 
 * this is the house class (that extends the building one) and adds a roof to the building.
 * 
 */





import java.awt.*;


//class that creates the house (house is-a building)

public class House extends Building
{
	
	private int x;
	
	
	public House(Graphics g, Color fc, int x1) // house class' constructor
	{
		
		super(g,fc,x1); //passing the informations to the building constructor
		x = x1;
		drawRoof(g); // calling the drawRoof method
		
	}	
	
	
	public void drawRoof(Graphics g) // method to draw the roof of the house, creating a polygon (a triangle) and filling it Dark Gray
	{
		
		Polygon roof = new Polygon();
		roof.addPoint(x, 280);
		roof.addPoint(x + 200, 280);
		roof.addPoint(x + 100, 200);
	    	g.setColor(Color.DARK_GRAY);
	    	g.fillPolygon(roof);
	    	
	}

}
