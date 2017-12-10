// GraphicsLab01st.java
// Student starting version of the GraphicsLab01 assignment.
// Resave this program as GraphicsLab01v80 for the 80 point version.
// Repeat this process as you progress to the 90 and 100 point versions.


import java.awt.*;
import java.applet.*;


public class GraphicsLab01st extends Applet
{

	public void paint(Graphics g)
	{
		// DRAW CUBE
	
		g.drawRect(100, 100, 300, 300);
		g.drawLine(100, 100, 200, 50);
		g.drawLine(400, 100, 500, 50);
		g.drawRect(200, 50, 300, 300);
		g.drawLine(100, 400, 200, 350);
		g.drawLine(400, 400, 500, 350);
		
		
		
		// DRAW SPHERE
		
		g.drawOval(150, 75, 300, 300);
		g.drawOval(187, 75, 225, 300);
		g.drawOval(225, 75, 150, 300);
		g.drawOval(262, 75, 75, 300);
		g.drawOval(150, 112, 300, 225);
		g.drawOval(150, 155, 300, 150);
		g.drawOval(150, 187, 300, 75);
		
		
		// DRAW TRIANGLE	
		
		g.drawLine(350, 650, 950, 650);
		g.drawLine(650, 650, 650, 350);
		g.drawLine(350, 650, 650, 350);
		g.drawLine(950, 650, 650, 350);
		g.drawLine(800, 500, 350, 650);
		g.drawLine(500, 500, 950, 650);
		
	}

}


