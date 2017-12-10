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
 * GetAwards Class extends OverAllMedal:
 * 
 * -Passes the number of the athlete with which it's called to its super class
 * 
 * 
 * 
 * -Draws as many gold, silver and bronze medals as many the athlete with which it's called won
 * 
 * 
 * -Calls the paintComponent method of its super class
 * 
 * 
 * 
 * IMPORTANT INFORMATIONS TO UNDERSTAND THE PROGRAM:
 * 
 * 	nothing, the logic of the class is pretty straightforward 
 * 
 */


import java.awt.*;
import javax.swing.JPanel;


public class GetAwards extends OverAllMedal
{
	static int athl;
	

	public GetAwards(int k)
	{
		super(k);
		athl = k;
	}
	
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 2000, 800);
		
		int goldCounter = 0;
		int silverCounter = 0;
		int bronzeCounter = 0;
		
		for(int i = 0; i < ClassMain.races; i++)
		{	
			if(AthletesPoints.getRacepoints()[athl][i] == 100)
			{
				if(goldCounter == 0)
				{
					g.setColor(Color.BLACK);
					g.drawString("Gold Medals:", 5, 84);
				}
				
				g.setColor(new Color(255, 215, 0));
				g.fillOval(90+(goldCounter*75), 50, 65, 65);
				goldCounter++;	
			}
			
			else if(AthletesPoints.getRacepoints()[athl][i] == 80)
			{
				if(silverCounter == 0)
				{
					g.setColor(Color.BLACK);
					g.drawString("Silver Medals:", 5, 234);
				}
				
				g.setColor(new Color(192, 192, 192));
				g.fillOval(95+(silverCounter*75), 200, 65, 65);
				silverCounter++;
			}
			
			else if(AthletesPoints.getRacepoints()[athl][i] == 65)
			{
				if(bronzeCounter == 0)
				{
					g.setColor(Color.BLACK);
					g.drawString("Bronze Medals:", 5, 384);
				}
				
				g.setColor(new Color(205, 127, 50));
				g.fillOval(103+(bronzeCounter*75), 350, 65, 65);
				bronzeCounter++;
			}
		}
		
		
		super.paintComponent(g);
		
		
	}
		
	
}