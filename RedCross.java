// Chapter 2 Question 13 (a)

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *  This program displays a red cross on a white
 *  background.
 */

public class RedCross extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);  // Call JPanel's paintComponent method
                              //   to paint the background
    int xCenter = getWidth() / 2;
    int yCenter = getHeight() / 2;
   
    //I discussed with valentin to solve this problem
    g.setColor(Color.RED);
    g.fillRect(xCenter, yCenter-40, 10, 50);
    g.fillRect(xCenter-40, yCenter, 50, 10);
    g.fillRect(xCenter, yCenter, 10, 50);
    g.fillRect(xCenter, yCenter, 50, 10);
    
  

    
   
    
  }

  public static void main(String[] args)
  {
    JFrame window = new JFrame("Red Cross");
    window.setBounds(300, 300, 200, 200);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    RedCross panel = new RedCross();
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    c.add(panel);
    window.setVisible(true);
  }
}


