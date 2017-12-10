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
 * TrainRankButtons Class:
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


public class TrainRankButtons extends JPanel implements ActionListener 
{
	JButton[] trainNumber;
	JFrame frame = new JFrame();
	JButton graph = new JButton("Graph");
	static ImageIcon back = new ImageIcon("back.jpg"); //used as a background

	
	public TrainRankButtons()
	{
		trainNumber = new JButton[ClassMain.trains];
		
		for(int x = 1; x <= ClassMain.trains; x++)
		{
			trainNumber[x-1] = new JButton("Train # " + (x));

			this.add(trainNumber[x-1]);
			trainNumber[x-1].addActionListener(this);
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
		for(int k = 0; k < ClassMain.trains; k++)
		{
			if(e.getSource() == trainNumber[k] )
			{
				Ranking.rank(k+1, false, true); //calls the ranking class to get the ranking and make the table appear
			}
		}
		
		
		if(e.getSource() == graph)
		{	
			JFrame graphFrame = new JFrame();
			graphFrame.setTitle("RANKING GRAPH");
			graphFrame.setSize(1200, 900);
			graphFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			DrawRankGraph panel = new DrawRankGraph(AthletesPoints.getTrainpoints());
			Container pane = graphFrame.getContentPane();
			pane.add(panel);
			graphFrame.setVisible(true);
		}
	}

}
