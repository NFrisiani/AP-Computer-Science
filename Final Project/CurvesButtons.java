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
 * CurvesButtons Class:
 * 
 * -This class just builds two buttons (trainCurves and raceCurves) that are going to call the respective CurvesButton Class 
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


public class CurvesButtons extends JPanel implements ActionListener 
{
	JButton trainCurve = new JButton("Trains' Curves of improvement");
	JButton raceCurve = new JButton("Races' Curves of improvement");
	static ImageIcon back = new ImageIcon("back.jpg"); 
	
	public CurvesButtons()
	{
		this.add(trainCurve);
		trainCurve.addActionListener(this);
		
		this.add(raceCurve);
		raceCurve.addActionListener(this);
	}
	
	
	public void paintComponent(Graphics g)
	{
		back.paintIcon(this, g, 0, 0); 
	}
	
	
	public void actionPerformed(ActionEvent e) 
	{
	
		if(e.getSource() == trainCurve)
		{
			int trainCounter = 0;
			
			for(int x = 0; x < ClassMain.array.length; x++)
			{
				if(ClassMain.array[x][0] != null)//not to run in a NullPointerException
				{
					if(!(Boolean)ClassMain.array[x][3])//main array at column # 3 = Boolean isRace
					{
						trainCounter++;
					}
				}
			}
			
				if(trainCounter <= 3*ClassMain.numAtl)//every athletes must have done at least 3 trains to see the curves
				{
					JFrame frame = new JFrame();
					String message = "Please enter at least three training's times per athlete to see the curves ";
					JOptionPane.showMessageDialog(frame, message);
				}
				
				else
				{
					JFrame menuFrame = new JFrame();
					menuFrame.setTitle("TRAINS' CURVES MENU");
					menuFrame.setSize(400, 300);
					menuFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
					CurvTrainButtons panel = new CurvTrainButtons();
					Container pane = menuFrame.getContentPane();
					pane.add(panel);
					menuFrame.setVisible(true);	
				}
		}
		
		else if(e.getSource() == raceCurve)
		{
			int raceCounter = 0;
			
			for(int x = 0; x < ClassMain.array.length; x++)
			{
				if(ClassMain.array[x][0] != null)//not to run in a NullPointerException
				{
					if((Boolean)ClassMain.array[x][3])//main array at column # 3 = Boolean isRace
					{
						raceCounter++;
					}
				}
			}
			
				if(raceCounter <= 3*ClassMain.numAtl)//every athletes must have done at least 3 races to see the curves
				{
					JFrame frame = new JFrame();
					String message = "Please enter at least three race's times per athlete to see the curves ";
					JOptionPane.showMessageDialog(frame, message);
				}
				
				else
				{
					JFrame menuFrame = new JFrame();
					menuFrame.setTitle("RACES' CURVES MENU");
					menuFrame.setSize(400, 300);
					menuFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
					CurvRaceButtons panel = new CurvRaceButtons();
					Container pane = menuFrame.getContentPane();
					pane.add(panel);
					menuFrame.setVisible(true);
				}
			
			
		}
		
	}

}
