import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CityScape extends JPanel implements ActionListener{

	JButton quit = new JButton("quit");
	JButton minus = new JButton("-hour");
	JButton plus = new JButton("+hour");
	
	int rSky = 250;
	int gSky = 214;
	int bSky = 165;
	int bNight = 205;
	int gSun = 140;
	
	
	Color MoonC = new Color(252, 252, 252);
	int x = 25;
	int y = 275;
	int xMoon = 25;
	int yMoon = 275;
	
	public CityScape()
	{
		this.add(minus);
		minus.addActionListener(this);
		this.add(plus);
		plus.addActionListener(this);
		this.add(quit);
		quit.addActionListener(this);
	}
	
	public void paintComponent(Graphics g)
	{
		g.drawString("VILLAGE", 525, 25);  
		
		if(x <= 1280)
		{
			setBackground(new Color(rSky, gSky, bSky));
			drawSun(g);
		}
		
		else
		{
			setBackground(new Color(0, 0, bNight));
			drawMoonAndStar(g);
			
		}
		
		
		House casa1 = new House(g, Color.RED, 50);			
		House casa2 = new House(g, Color.GRAY, 300);	    
		House casa3 = new House(g, new Color(238, 118, 0), 550 );		
		House casa4 = new House(g, Color.MAGENTA, 800);		
		House casa5 = new House(g, Color.GREEN, 1050);
		
	}

	public void drawSun(Graphics g)
	{
		super.paintComponent(g);
		Color sunC = new Color(238, gSun, 0);
		g.setColor(sunC);
		g.fillOval(x, y, 75, 75);
	}
	
	public void drawMoonAndStar(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(MoonC);
		g.fillOval(xMoon, yMoon, 75, 75);
	
		int xrnd = 0;
		int yrnd = 0;
		
		for(int x = 0; x <= 50; x++)
		{
			xrnd = (int)(Math.random()*1280);
			yrnd = (int)(Math.random()*500);
			g.fillOval(xrnd, yrnd, 5, 5);
		}	
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == quit)
		{
			System.exit(0);
		}
	
		if(x <= 1280)
		{
			if(x <= 640)
			{
				if(e.getSource() == plus)
				{
					x += 20;
					y -= 10;
					rSky -= 7;
					gSky -= 5;
					if(bSky < 255)
					{
						bSky += 6;
					}
					gSun += 3;
			
				}
		
				else if(e.getSource() == minus)
				{
					x -= 20;
					y += 10;
					rSky += 7;
					gSky += 5;
					bSky -= 6;
					gSun -= 3;
				}
		
				repaint();
			}
		
			else
			{
				if(e.getSource() == plus)
				{
					x += 20;
					y += 10;
					rSky += 7;
					gSky += 5;
					bSky -= 3;
					gSun -= 3;
				}
		
				else if(e.getSource() == minus)
				{
					x -= 20;
					y -= 10;
					rSky += 7;
					gSky += 5;
					if(bSky < 255)
					{
						bSky += 3;
					}
					gSun += 3;
				}
		
				repaint();
			}
		}
		
		else
		{
				if(xMoon <= 640)
				{
					if(e.getSource() == plus)
					{
						xMoon += 20;
						yMoon -= 10;
						bNight -= 2;
					}
			
					else if(e.getSource() == minus)
					{
						xMoon -= 20;
						yMoon += 10;
						bNight += 2;
					}
			
					repaint();
				}
			
				else
				{
					if(e.getSource() == plus)
					{
						xMoon += 20;
						yMoon += 10;
						bNight -= 2;
					}
			
					else if(e.getSource() == minus)
					{
						xMoon -= 20;
						yMoon -= 10;
						bNight += 2;
					}
			
					repaint();
				}
		}
	}	
}




