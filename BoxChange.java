import java.awt.event.*;
import javax.swing.*;
import java.awt.*;


public class BoxChange extends JPanel implements ActionListener
{
	JButton quit = new JButton("Quit");
	JButton grow = new JButton("Grow");
	JButton shrink = new JButton("Shrink");
	
	int xSize = 50;
	int ySize = 50;
	
	public BoxChange(Color back)
	{
		setBackground(back);
		this.add(quit);
		quit.addActionListener(this);
		this.add(grow);
		grow.addActionListener(this);
		this.add(shrink);
		shrink.addActionListener(this);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		drawBox(g);
	}
	
	public void drawBox(Graphics g)
	{
		g.setColor(Color.YELLOW);
		g.fillRect(100, 100, xSize, ySize);
		g.drawString("This is a Box", xSize+125, ySize+125);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == quit)
		{
			System.exit(0);
		}
		
		else if(e.getSource() == grow)
		{
			xSize += 20;
			ySize += 20;
		}
		
		else if(e.getSource() == shrink)
		{
			xSize -= 20;
			ySize -= 20;
		}
		
		repaint();
	}
	
}
