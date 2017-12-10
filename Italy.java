import java.awt.*;
import javax.swing.*;

public class Italy 
{
	public static void main(String[] args)
	{
		JFrame myFrame = new JFrame();
		
		myFrame.setTitle("ITALY");
		myFrame.setSize(300,200);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.GREEN);
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.WHITE);
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.RED);
		
		
		Container pane = myFrame.getContentPane();
		pane.setLayout(new GridLayout(1,1));
		pane.add(panel1);
		pane.add(panel2);
		pane.add(panel3);
		
		
		
		
		
		myFrame.setVisible(true);
		
		
	}
}