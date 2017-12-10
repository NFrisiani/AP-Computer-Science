import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class Translator extends JPanel implements ActionListener {
	
	static String italy = "                                  ";
	static String england = "                                  ";
	
	static JFrame myFrame = new JFrame();
	
	static JPanel panela = new JPanel();
	static JPanel panel = new JPanel();
	static JPanel pane = new JPanel();
	static JPanel pan = new JPanel();
 
	static JLabel italian = new JLabel("italian:",null,JLabel.RIGHT);
	static JLabel english = new JLabel("english:",null,JLabel.RIGHT);
	
	static JTextField t1 = new JTextField(italy);
	static JTextField t2 = new JTextField(england);

	JButton translate = new JButton("translate");
	
	
	public Translator()
	{
		setBackground(Color.white);
		this.add(translate);
		translate.addActionListener(this);
		panela.setLayout(new GridLayout(2,1));
		panel.setLayout(new GridLayout(2,1));
	
	
		panela.add(italian, 0, 0);
		panela.add(english,1,0);
		this.add(panela);
	
		panel.add(t1, 0, 0);
		panel.add(t2,1,0);
		this.add(panel);	
	}
	
	
	public static void main(String[] args) 
	{	
		myFrame.setSize(300,300);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		italian.setLayout(new GridLayout(2,1));
		english.setLayout(new GridLayout(2,1));
		
		Container pane = myFrame.getContentPane();
		Translator trans = new Translator();
		pane.add(trans);
		
		myFrame.setVisible(true);
		
	}
	
	
	public void actionPerformed(ActionEvent e) 
	{
		
		
	}
}


