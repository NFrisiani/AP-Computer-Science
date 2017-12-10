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
 * RankingButtons Class:
 * 
 * -Creates four buttons: "RacingRank", "TrainingRank", "DTRanks", "CurvImpro"
 * 
 * 
 * -RacingRank calls the RaceRankButtons class when called
 * 
 * 
 * -TrainingRank calls the TrainRankButtons class when called
 * 
 * 
 * -DTRanks calls the DTRankButtons class when called
 * 
 * 
 * -CurvImpro calls the CurvesButtons class when called
 * 
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


public class RankingButtons extends JPanel implements ActionListener 
{
	JButton RacingRank = new JButton("Races Ranks");
	JButton TrainingRank = new JButton("Train Ranks");
	JButton DTRanks = new JButton("Performance Regularity Ranks ");
	JButton CurvImp = new JButton("Curves of Improvement");
	
	static ImageIcon graph = new ImageIcon("graph1.jpg"); 
	
	boolean isRace = false;
	
	public RankingButtons()
	{
		this.add(RacingRank);
		RacingRank.addActionListener(this);
		
		this.add(TrainingRank);
		TrainingRank.addActionListener(this);
		
		this.add(DTRanks);
		DTRanks.addActionListener(this);
	
		this.add(CurvImp);
		CurvImp.addActionListener(this);
	}

	public void paintComponent(Graphics g)
	{	//draws a white rectangle to show better the graph in the background
		 g.setColor(Color.WHITE);
		 g.fillRect(0,0,2000,2000);
			 		 
		 graph.paintIcon(this, g, -500, -500); 
				
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		JFrame frame = new JFrame();
		
		if(e.getSource() == TrainingRank)
		{
			if(ClassMain.array[0][0] == null)
			{
				//if no trainings have been input yet, shows a message instead of opening an empty ranking
				JOptionPane.showMessageDialog(frame, "No training has been input yet");
				return;
			}
			
			else
			{
				JFrame trainRankFrame = new JFrame();
				trainRankFrame.setTitle("TRAIN RANKS MENU");
				trainRankFrame.setSize(400, 300);
				trainRankFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				TrainRankButtons panel = new TrainRankButtons();
				Container pane = trainRankFrame.getContentPane();
				pane.add(panel);
				trainRankFrame.setVisible(true);	
			}
		}
		
		else if (e.getSource() == RacingRank)
		{
			if(ClassMain.array[0][0] == null)
			{
				//if no races have been input yet, shows a message instead of opening an empty ranking
				JOptionPane.showMessageDialog(frame, "No races has been input yet");
				return;
			}
			
			else
			{
				JFrame racesRankFrame = new JFrame();
				racesRankFrame.setTitle("RACE RANKS MENU");
				racesRankFrame.setSize(400, 300);
				racesRankFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				RaceRankButtons panel = new RaceRankButtons();
				Container pane = racesRankFrame.getContentPane();
				pane.add(panel);
				racesRankFrame.setVisible(true);	
			}
		}
		
		else if (e.getSource() == DTRanks)
		{
			if(ClassMain.array[0][0] == null)
			{
				//if neither trainings nor races have been input yet, shows a message instead of opening an empty ranking
				JOptionPane.showMessageDialog(frame, "No trainings or races have been input yet");
				return;
			}
			
			else
			{
				JFrame regularityRankFrame = new JFrame();
				regularityRankFrame.setTitle("PERFORMANCE REGULARITY MENU");
				regularityRankFrame.setSize(400, 300);
				regularityRankFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				DTRankButtons panel = new DTRankButtons();
				Container pane = regularityRankFrame.getContentPane();
				pane.add(panel);
				regularityRankFrame.setVisible(true);	
			}
		}
		
		
			
		else if(e.getSource() == CurvImp)
		{	
			JFrame regularityRankFrame = new JFrame();
			regularityRankFrame.setTitle("CURVES OF IMPROVEMENT MENU");
			regularityRankFrame.setSize(400, 300);
			regularityRankFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			CurvesButtons panel = new CurvesButtons();
			Container pane = regularityRankFrame.getContentPane();
			pane.add(panel);
			regularityRankFrame.setVisible(true);			
		}
		
		
	}
}
