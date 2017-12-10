/*
 * Graphics Lab 04 (villa)
 * 
 * MIDTERM PROJECT
 * 
 * Nicolo Frisiani
 * 
 * 10/09/2013
 * 
 * this is the villa class (that extends the house one) and adds a garden and a fence to the house.
 * 
 */






import java.awt.*;


//class that creates the villa (villa is-a house)
public class Villa extends House
{
	
	private int x;
	private Color fc;
	
	
	public Villa(Graphics g, Color fc1, int x1) //villa class' constructor
	{
		
		super(g, fc1, x1); // passing the informations to the House constructor
		x = x1;
		fc = fc1;
		drawGrass(g); // calling the method to draw the Grass
		drawFence(g); // calling the method to draw the Fence
		
	}
	
	
	public void drawGrass(Graphics g) // method to draw the Grass creating a thin rectangle at the ground level and filling it green
	{
		
		g.setColor(Color.GREEN);
		
		g.fillRect(x + 200, 490, 200, 10);
		
	}
	
	
	public void drawFence(Graphics g) // method to draw the Fence drawing two light gray line in one way and 5 perpendicular to them.
	{
		
		g.setColor(Color.LIGHT_GRAY);
		
		g.drawLine(x + 200, 460, x + 400, 460);
		g.drawLine(x + 200, 450, x + 400, 450);
		
		g.drawLine(x + 240, 490, x + 240, 445);
		g.drawLine(x + 280, 490, x + 280, 445);
		g.drawLine(x + 320, 490, x + 320, 445);
		g.drawLine(x + 360, 490, x + 360, 445);
		g.drawLine(x + 400, 490, x + 400, 445);
		
	}
	
}