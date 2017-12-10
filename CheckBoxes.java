import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
    
    
    
public class CheckBoxes extends JPanel
{   
	private static JCheckBox ExtraCheese = new JCheckBox("Extra Cheese");
	private static JCheckBox Mushrooms = new JCheckBox("Mushrooms"); 
	private static JCheckBox Pepperoni = new JCheckBox("Pepperoni");
	
	private static JRadioButton Small = new JRadioButton("Small");
	private static JRadioButton Medium =  new JRadioButton("Medium"); 
	private static JRadioButton Large =  new JRadioButton("Large");
	
	private static JToggleButton ToGo = new JToggleButton("To Go");
	
	static JPanel panel = new JPanel();
	static JPanel panel1 = new JPanel();
	
	static JFrame myFrame = new JFrame();
    
	
	public static void main(String[] args)
	{
		
		CompoundBorder border = new CompoundBorder(new LineBorder(Color.BLACK, 1), new EmptyBorder(6, 6, 6, 6));
		
		panel.setBorder(border);
		panel1.setBorder(border);
		
		panel.setBackground(Color.WHITE);
		panel.setLayout(new GridLayout(3, 1));
		panel.add(Large, 1, 0);
		panel.add(Medium, 2, 0);
		panel.add(Small, 3, 0);
		
		panel1.setBackground(Color.WHITE);
		panel1.setLayout(new GridLayout(4, 1));
		panel1.add(ToGo, 0, 0);
		panel1.add(Pepperoni, 0, 0);
		panel1.add(Mushrooms, 2, 0);
		panel1.add(ExtraCheese, 1, 0);
		
		myFrame.setSize(300,150);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		Container pane = myFrame.getContentPane();
		pane.setLayout(new GridLayout(1, 2));
		pane.add(panel);
		pane.add(panel1);
    
		
		myFrame.setVisible(true);
	}
	
    
}
