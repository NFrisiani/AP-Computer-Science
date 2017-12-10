import javax.swing.*;
import java.awt.*;


public class ShowBox 
{
	public static void main(String[] args)
	{
		JFrame myFrame = new JFrame();
		myFrame.setTitle("This panel displays a box");
		myFrame.setSize(900, 900);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BoxChange panel = new BoxChange(Color.BLUE);
		Container pane = myFrame.getContentPane();
		pane.add(panel);
		myFrame.setVisible(true);
		
	}
}
