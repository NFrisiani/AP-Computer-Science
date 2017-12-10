/*
 * Nicolo Frisiani
 * 
 * AP COMPUTER SCIENCE 
 * 
 * 12/17/2013
 * 
 * Final Project 
 * 
 * 
 * RaceRankButtons Class:
 * 
 * -Creates an array of buttons as big as the number of trains the team will do in the season.
 * 
 * 
 * -Creates a graph button that calls the drawRankGraph class
 * 
 * 
 * IMPORTANT INFORMATIONS TO UNDERSTAND THE PROGRAM:
 * 
 * 	nothing, the logic of the class is pretty straightforward 
 * 
 */


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class RaceRankButtons extends JPanel implements ActionListener 
{
	JButton[] raceNumber;
	JButton graph = new JButton("Graph");
	JFrame frame = new JFrame();
	static ImageIcon back = new ImageIcon("back.jpg"); //used as a background
	
	
	public RaceRankButtons()
	{	
		raceNumber = new JButton[ClassMain.races];
		
		for(int x = 1; x <= ClassMain.races; x++)
		{
			raceNumber[x-1] = new JButton("Race # " + (x));
		}
		
		for(int i = 0; i< ClassMain.races; i++)
		{
			this.add(raceNumber[i]);
			raceNumber[i].addActionListener(this);
		}
		
		
		this.add(graph, BorderLayout.SOUTH);
		graph.addActionListener(this);
		
	}
	
	//paintComponent method: it just paints the background with the imported image
	public void paintComponent(Graphics g)
	{
		 back.paintIcon(this, g, 0, 0); 
	}
	
	public void actionPerformed(ActionEvent e) 
	{		
		for(int k = 0; k < ClassMain.races; k++)
		{
			if(e.getSource() == raceNumber[k] )
			{
				Ranking.rank(k+1, true, true); //calls the ranking class to get the ranking and make the table appear
			}
			
		}
		
		if(e.getSource() == graph)
		{	
			JFrame graphFrame = new JFrame();
			graphFrame.setTitle("RANKING GRAPH");
			graphFrame.setSize(1200, 900);
			graphFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			DrawRankGraph panel = new DrawRankGraph(AthletesPoints.getRacepoints());
			Container pane = graphFrame.getContentPane();
			pane.add(panel);
			graphFrame.setVisible(true);
		}
	}
}
