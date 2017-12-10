// GraphicsLab06st.java
// This is the Student Version of the Lab11GRFX06 assignment.


import java.awt.*;
import java.applet.*;
import java.util.*;


public class GraphicsLab06st extends Applet
{	
	public void paint(Graphics g)
	{
		int circleCount = 99;
		Circles circles = new Circles(g,circleCount);
	}
}


class Circles
{
	private int circleCount;
	private Random rnd;
	private Color randomColor;
	private int colorRow;
	
	private int redCount, greenCount, blueCount;
	private int redCountSecRow, greenCountSecRow, blueCountSecRow;
	public Circles(Graphics g,int c)
	{
		
		rnd = new Random(12345);
		circleCount = c;
		redCount = 1;
		greenCount = 1;
		blueCount = 1;
		redCountSecRow = 1;
		greenCountSecRow = 1;
		blueCountSecRow = 1;
		drawSquares(g);
		for (int k = 1; k <= circleCount; k++)
			drawRandomCircle(g);
	}	
				
	public void drawSquares(Graphics g)
	{
		g.setColor(Color.red);
		g.fillRect(10,100,30,30);
		g.setColor(Color.green);
		g.fillRect(10,250,30,30);
		g.setColor(Color.blue);
		g.fillRect(10,400,30,30);
	}
	
	public void drawRandomCircle(Graphics g) 
	{ 
	
	int x = 0,y = 0; 
	
	getRandomColor(); 
	
	g.setColor(randomColor); 
	
	
	
	if ( colorRow == 0 ) { 
	
		if (redCount <= 17) {
			
			
			y = 100; 
		
	
			x = redCount * 30 + 25; 
	
			redCount++;
			
			
		} 
		
		
		if (redCount > 17) {
			
			
			y = 130;
			
			
			x = redCountSecRow * 30 + 25;
			
			redCountSecRow++;
			
		}
		
	
	} 
	
	
	else if ( colorRow == 1 ) {
	
		
		if (greenCount <= 17)  {
			
		
			y = 250; 
	
			x = greenCount * 30 + 25; 
	
			greenCount++; 
	
			
		}
		
		
		if (greenCount > 17) {
			
			
			y = 280;
			
			
			x = greenCountSecRow * 30 + 25;
			
			greenCountSecRow++;
			
			
		}
	
		
		
	} 
	
	
	else { 
		
		
		if (blueCount <= 17) {
			
			
			y = 400; 
	
			
			x = blueCount * 30 + 25; 
	
			blueCount++; 
			
			
		}
		
		
		if (blueCount > 17) {
			
			
			y = 430;
			
			
			x = blueCountSecRow * 30 + 25;
			
			blueCountSecRow++;
			
		}
	} 
	
	
	g.fillOval(x, y, 30, 30); 
	
	
	} 
	

	
	
	public void getRandomColor() 
	{ 
		
		int red = rnd.nextInt(256); 
	
		int green = rnd.nextInt(256); 
	
		int blue = rnd.nextInt(256); 

	
		randomColor = new Color(red, green, blue); 
	
	
		if (red >= green && red >= blue) { 
	
			colorRow = 0;	

			
		} else if (green >= red && green >= blue) { 
	
			colorRow = 1; 
	
		
		} else {
			
			colorRow = 2; 
			
		}
		
		
	}
}

