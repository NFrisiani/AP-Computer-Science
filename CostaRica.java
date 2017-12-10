import java.awt.*;
import javax.swing.*;

public class CostaRica 
{
	public static void main(String[] args)
	{
		JFrame myFrame = new JFrame();
		
		myFrame.setTitle("COSTA RICA");
		myFrame.setSize(300,200);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.BLUE);
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.WHITE);
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.RED);
		JPanel panel4 = new JPanel();
		panel4.setBackground(Color.RED);
		JPanel panel5 = new JPanel();
		panel5.setBackground(Color.WHITE);
		JPanel panel6 = new JPanel();
		panel6.setBackground(Color.BLUE);
		
		
		
		Container pane = myFrame.getContentPane();
		pane.setLayout(new GridLayout(6,1));
		pane.add(panel1);
		pane.add(panel2);
		pane.add(panel3);
		pane.add(panel4);
		pane.add(panel5);
		pane.add(panel6);
		
		
		
		
		
		myFrame.setVisible(true);
		
		
	}
}