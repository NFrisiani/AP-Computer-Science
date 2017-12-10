import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class BoxDrawer extends JPanel implements ActionListener
{
	int typeBox = 0;
	Color c;
	int width = 200;
	int height = 100;
	
	JButton increase = new JButton("increase");
	JButton decrease = new JButton("decrease");
	
	
	public BoxDrawer()
	{
	    this.add(increase);
	    increase.addActionListener(this);
	    this.add(decrease);
	    decrease.addActionListener(this);   
	  
	}
	
	
	public void setBoxType(int boxType)
	{
		typeBox = boxType;
	}
	
	public void setBoxColor(Color color)
	{
		c = color;
	}
	
	public void drawBox(Graphics g)
	{
		g.setColor(c);
		
		switch(typeBox)
		{
			case 0 : 	super.paintComponent(g);
						break;
			
			case 1 : 	super.paintComponent(g);
						g.fillRect(10, 10, width, height);
						break;
						
			case 2 :	super.paintComponent(g);
						g.drawRoundRect(10, 10, width, height, 50, 50);
						break;
						
			case 4 :	super.paintComponent(g);
						g.draw3DRect(10, 10, width, height, false);
						break;	
						
			case 3 : 	super.paintComponent(g);
						g.fillRoundRect(10, 10, width, height, 50, 50);
						break;
						
			case 5 : 	super.paintComponent(g);
						g.fill3DRect(10, 10, width, height, false);
						break;
						
			case 6 : 	throw new IllegalArgumentException("Error, both rounded and 3D were selected");
						
			case 7 : 	throw new IllegalArgumentException("Error, both rounded and 3D were selected");
		}
		
	}



	public void paintComponent(Graphics g)
	{	
		if(g.getColor() == Color.WHITE)
		{
			setBackground(Color.BLACK);
		}
	
		
		drawBox(g);
		
	}


	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == increase)
		{
			width += width * 0.10;
			height += height * 0.10;
		}
		
		else if(e.getSource() == decrease)
		{
			width -= width * 0.10;
			height -= height * 0.10;
		}
		
		repaint();
		
	}
	
}
