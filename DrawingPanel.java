import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class DrawingPanel extends JPanel implements MouseListener
{
	static DrawingPanel panel;
	int x = 200;
	int y = 200;
	Color color = new Color(230, 100, 55);
	
	
	public static void main(String[] args)
	{
		JFrame myFrame = new JFrame();
		myFrame.setTitle("SEASONS");
		myFrame.setSize(900, 900);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new DrawingPanel();
		panel.setBackground(Color.WHITE);
		Container pane = myFrame.getContentPane();
		pane.add(panel);
		myFrame.setVisible(true);
	}
	
	
	public DrawingPanel()
	{	
		addMouseListener(this);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(color);
		g.fillOval(100, 100, x, y);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) 
	{
			x = 300;
			y = 300;
			color = Color.GREEN;
			repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) 
	{	
			x = 200;
			y = 200;
			color = new Color(230, 100, 55);
			repaint();	
	}

}
