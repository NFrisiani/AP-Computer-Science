

	
	// Chapter 2 Question 13 (a)

	import java.awt.Graphics;
	import java.awt.Color;
	import java.awt.Container;
	import javax.swing.JFrame;
	import javax.swing.JPanel;

	/**
	 *  This program displays a bulls eye on a white
	 *  background.
	 */

	public class NicoloFrisianiBullsEye extends JPanel 
	{
		
		  public void paintComponent(Graphics g)
	  {
	    super.paintComponent(g);  // Call JPanel's paintComponent method
	                              //   to paint the background
	    int xCenter = getWidth() / 2;
	    int yCenter = getHeight() / 2;
	   

	    g.setColor(Color.RED);
	    g.fillOval(xCenter-20, yCenter-20, 50, 50);
	    
	    g.setColor(Color.WHITE);
	    g.fillOval(xCenter-10, yCenter-10, 30, 30);
	    
	    g.setColor(Color.RED);
	    g.fillOval(xCenter, yCenter, 10, 10);
	    
	    
	    
	  

	    
	   
	    
	  }

	  public static void main(String[] args)
	  {
	    JFrame window = new JFrame("Red Cross");
	    window.setBounds(300, 300, 200, 200);
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    NicoloFrisianiBullsEye panel = new NicoloFrisianiBullsEye();
	    panel.setBackground(Color.WHITE);
	    Container c = window.getContentPane();
	    c.add(panel);
	    window.setVisible(true);
	  }
	}




