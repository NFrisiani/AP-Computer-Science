import javax.swing.*;
import java.awt.*;
 
public class GraphicsPanel extends JPanel {

	public GraphicsPanel(Color back)
	{
		setBackground(back);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		g.fillRect(10, 10, 100, 100);
		
	}
}
