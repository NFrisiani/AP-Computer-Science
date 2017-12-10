import java.awt.*;
import javax.swing.*;

public class WindowExample 
{
	public static void main(String[] args)
	{
		JFrame myFrame = new JFrame();
		
		myFrame.setTitle("TITLE IS HERE");
		myFrame.setSize(300,200);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GraphicsPanel panel = new GraphicsPanel(Color.GREEN);
		
		Container pane = myFrame.getContentPane();
		pane.add(panel);
		
		
		myFrame.setVisible(true);
		
		
	}
}