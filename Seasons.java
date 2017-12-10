import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Seasons extends JPanel implements MouseListener
{
	static Seasons panel;
	int index = 0;
	Color colors[] = new Color[]{Color.WHITE, Color.GREEN, new Color(0, 100, 0), new Color(218, 165, 32)}; 
	
	
	public static void main(String[] args)
	{
		JFrame myFrame = new JFrame();
		myFrame.setTitle("SEASONS");
		myFrame.setSize(900, 900);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new Seasons();
		panel.setBackground(Color.WHITE);
		Container pane = myFrame.getContentPane();
		pane.add(panel);
		myFrame.setVisible(true);
	}


	public Seasons()
	{	
		addMouseListener(this);
	}
	
	public void mouseClicked(MouseEvent e)
	{
		if(e.MOUSE_CLICKED == 500)
		{
			if(index < colors.length - 1)
			{
				index++;
				panel.setBackground(colors[index]);
			}
			else
			{
				index = 0;
				panel.setBackground(colors[index]);
			}
		}
		
		
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
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
