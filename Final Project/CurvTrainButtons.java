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
 * CurvTrainButtons Class:
 * 
 * -Creates an array of buttons as big as the number of athletes in the team.
 * 
 * 
 * -If one of this is pressed it calls the drawCurves class for that athlete
 * 
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



public class CurvTrainButtons extends JPanel implements ActionListener
{
	JButton athlButtons[] = new JButton[ClassMain.numAtl];
	static ImageIcon back = new ImageIcon("back.jpg"); 
	
	public CurvTrainButtons()
	{
		//nested for loops to fill the array of buttons with buttons named as the named of the athletes
		for(int i = 0; i < ClassMain.numAtl; i++)
		{
			for(int x = 0; x < ClassMain.array.length; x++)
			{
				if(ClassMain.array[x][0] != null) //not to run in a NullPointerException
				{
					if(((Integer)ClassMain.array[x][4]) == i)
					{
						athlButtons[i] = new JButton((String)ClassMain.array[x][2]);
					}
				}
			}
			
			this.add(athlButtons[i]);
			athlButtons[i].addActionListener(this);
			
		}
	}

	//paintComponent method: just paints the background with the imported image
	public void paintComponent(Graphics g)
	{
		back.paintIcon(this, g, 0, 0); 
	}
	
	public void actionPerformed(ActionEvent e)
	{
		for(int k = 0; k < athlButtons.length; k++)
		{
			if(e.getSource() == athlButtons[k])
			{
				JFrame menuFrame = new JFrame();
				menuFrame.setTitle("TRAIN CURVE FOR ATHLETE NUMBER " + k);
				menuFrame.setSize(1100, 900);
				menuFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				DrawCurves panel = new DrawCurves(AthletesPoints.getTrainpoints()[k]);
				Container pane = menuFrame.getContentPane();
				pane.add(panel);
				menuFrame.setVisible(true);	
				
			}
		}
		
	}

}
