import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Mauritius 
{
	public static void main(String[] args)
	{
		JFrame myFrame = new JFrame();
		
		myFrame.setTitle("MAURITIUS");
		myFrame.setSize(300,200);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.RED);
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.BLUE);
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.YELLOW);
		JPanel panel4 = new JPanel();
		panel4.setBackground(Color.GREEN);
		
		
		
		
		Container pane = myFrame.getContentPane();
		pane.setLayout(new GridLayout(4,1));
		pane.add(panel1);
		pane.add(panel2);
		pane.add(panel3);
		pane.add(panel4);
		
		
		
		
		
		
		myFrame.setVisible(true);
		
		
	}
}