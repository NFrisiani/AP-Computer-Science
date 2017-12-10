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
 * Main Class:
 * -Ask to see last year rankings or to start a new season
 * 	
 * 		if you select start a new season it asks you the main information for the coming season (# of athletes, # of races and trainings in the season, etc...)
 * 
 * 
 * -Build the main array with all the information about every race or training
 * 
 * 		if you selected "last year rankings", the array is full with the last year races
 * 
 * 		if you selected "start a new season" the array is empty
 * 
 * 
 * -Builds the main menu window, with either two or three buttons depending on your first choice:
 * 
 * 		if you chose to see last year rankings, there are two buttons : a SeeRankings button and an Awards button
 * 		if you chose to start a new season, there are three buttons : a SeeRankings button, an Awards button and an AddTime button to add the 
 * 																      times of the new races and trainings.
 * 
 * 
 * 
 * IMPORTANT INFORMATION TO UNDERSTAND THE PROGRAM:
 * 
 * -This is how the 2D array is organized:
 * 
 * 			 0		 1 		 2			3			4		 5
 * 	        sex    race#    Name    Race/Train    bibNum    time
 * 
 * event 1
 * 
 * event 2
 * 
 * event 3
 * ...
 * ...
 * 
 * 
 * -I learned how to use try{...}catch(NumberFormatException i){...} and continue; on stackoverflow
 * 
 * 
 */


import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

import javax.swing.*;
import javax.swing.Timer;


public class ClassMain extends JPanel implements ActionListener
{
	static JButton addTime = new JButton("Add new Time");
	static JButton seeRankings;
	static JButton awards = new JButton("AWARDS");
	
	static JFrame frame = new JFrame();
	
	static String message = "Every athlete will be assigned a bib number for the rest of the season";
	
	static Object[][] array; //this is the main array that contains all the informations
	static Object[][] NameAndSex; //used to find the name and the sex of an athlete knowing his bibNumber
	
	static int trains;
	static int races;
	static int numAtl;
	
	
	static ImageIcon penguin = new ImageIcon("ski.jpg"); 

	static ImageIcon pineTree = new ImageIcon("PineTrees.jpg"); 
	 
	
	//Constructor:
	//	  -Either builds the main array with the data from the last season or sets the right dimensions for the array 
	//    -Builds the timer that will be uses for the snow in the main window (I learned how to use the timer on stackoverflow)
	public ClassMain()
	{
		Timer time = new Timer(200, this); // Called every 200 milliseconds
		time.start();
		
		/*sets the button as an imported image --> I learned it solving the problem of a "yahoo answer"'s question
		*											(I manage to solve the question because of what I learned about the buttons in 
		*										   	 stackoverflow (the problem in the question was missing setBorderPainted(false)))  
		*/										
		 addTime = new JButton();  
		 addTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("SnowManTime.gif")));  
		 addTime.setBorderPainted(false);  
		 
		 awards = new JButton();  
		 awards.setIcon(new javax.swing.ImageIcon(getClass().getResource("cup.gif")));  
		 awards.setBorderPainted(false);  
		
		 seeRankings = new JButton();  
         seeRankings.setIcon(new javax.swing.ImageIcon(getClass().getResource("SnowManRank.gif")));  
         seeRankings.setBorderPainted(false); 
		
		 if(array[array.length-1][3] == null) //checks if the array is not completely full
		 {
			 this.setLayout(new GridLayout(2,3));
			   
			 this.add(addTime);
			 addTime.addActionListener(this);
			
			 this.add(seeRankings);
			 seeRankings.addActionListener(this);
			
			 this.add(awards);
			 awards.addActionListener(this);
		 }
		
		 else 
		 {
			 this.add(seeRankings);
			 seeRankings.addActionListener(this);
			
			 this.add(awards);
			 awards.addActionListener(this);
		 }
	}
	
	
	 public void paintComponent(final Graphics g) 
	 { 
		 g.setColor(Color.WHITE);
		 g.fillRect(0,0,2000,2000); //simulates a "snowy ground" in the main window
		 
		 //set locations of imported images in the main window (I learned this on dreamincode.net)
		 penguin.paintIcon(this, g, 400, 280); 
		 pineTree.paintIcon(this, g, 20, 110);
		 pineTree.paintIcon(this, g, 800, 100);
		 pineTree.paintIcon(this, g, 620, 400);
		 pineTree.paintIcon(this, g, -150, 400);

		 
		 g.setColor(Color.CYAN);
		 for(int k = 0; k <= 180; k++)//for loop to draw 100 snow flakes every 200 milliseconds in a random position
		 {
			 int i = ((int)(Math.random()*1280)); 
			 int z = ((int)(Math.random()*720));
						 
			 g.fillOval(i, z, 15, 15);
		 }
					 	
	 }
	 
	 //initialQuestion method:
	 //	   -ask the initial question ("start new season" or "see last year rankings") and sets the main array depending on what the user chooses 	
	 public static void initialQuestions()
	 {
		 boolean finished = false;
		 
		 String[] startButtons = {"Start a new Season", "See Last Year Season"};
		 
		 //it returns either 1 or 0 depending on what button the user presses (I learned this on stackoverflow)
		 int thisOrLastYear = JOptionPane.showOptionDialog(null ,"Select an Option", "This/Last year", 
			                  JOptionPane.INFORMATION_MESSAGE, 1, null, startButtons, startButtons[1]); 
			
		 if(thisOrLastYear == 0)
		 {
			 while(!finished)
			 {
				 //try{...}catch(NumberFormatException i){...} is used to show a message when the input is wrong instead of running 
				 //into an error
				 try
				 {
					 String strNumAtl = JOptionPane.showInputDialog("Enter number of the athletes in the team this season (2013/2014)"); 
					 numAtl = Integer.parseInt(strNumAtl);
				 }
				
				 catch(NumberFormatException i)
			 	 {
					 JFrame frame = new JFrame();
					 String message = "You have to enter a number";
					 JOptionPane.showMessageDialog(frame, message);
					 continue;
				 }
			
				 if(numAtl == 0)
				 {
					 JFrame frame = new JFrame();
					 String message = "You have to enter a number that is greater than 0";
					 JOptionPane.showMessageDialog(frame, message);
					 continue;
				 }
			 
				 try
				 {
					 String strRaces = JOptionPane.showInputDialog("Enter number of races the team will do this season (2013/2014)"); 
					 races = Integer.parseInt(strRaces);
				 }
			 
				 catch(NumberFormatException i)
				 {
					 JFrame frame = new JFrame();
					 String message = "You have to enter a number!";
					 JOptionPane.showMessageDialog(frame, message);
					 continue;
				 }
				
				 if(races == 0)
				 {
					 JFrame frame = new JFrame();
					 String message = "You have to enter a number that is greater than 0";
					 JOptionPane.showMessageDialog(frame, message);
					 continue;
				 }
				 
				 try
				 {
					 String strTrains = JOptionPane.showInputDialog("Enter number of trainings the team will do this season (2013/2014)"); 
					 trains = Integer.parseInt(strTrains);
					 finished = true;
				 }
			 
				 catch(NumberFormatException i)
				 {
					 JFrame frame = new JFrame();
					 String message = "You have to enter a number!";
					 JOptionPane.showMessageDialog(frame, message);
					 continue;
				 }
				 
				 if(trains == 0)
				 {
					 JFrame frame = new JFrame();
					 String message = "You have to enter a number that is greater than 0";
					 JOptionPane.showMessageDialog(frame, message);
					 continue;
				 }
				 
				 
			 }
				
			 array = new Object[(races+trains)*numAtl][6];
					
			 JOptionPane.showMessageDialog(frame, message);
				
			 NameAndSex = new Object[2][numAtl];
				
			 
			 for(int x = 0; x <= numAtl -1; x++)
			 {
				 String strName = JOptionPane.showInputDialog("Enter name of the athlete # "+ x);
				 
				 String[] buttons = { "Boy", "Girl"};  
				 
				 int boyOrGirlValue = JOptionPane.showOptionDialog(null ,"Is it a boy or a girl?", "Boy/Girl", 
					                  JOptionPane.INFORMATION_MESSAGE, 1, null, buttons, buttons[1]);
					
				 NameAndSex[0][x] = strName;
					
				 if(boyOrGirlValue == 0)
				 {
					 NameAndSex[1][x] = true;
				 }
					
				 else 
				 {
					 NameAndSex[1][x] = false;
				 }
					
			 }
				
		 }
			
		 else
		 {
			 array = LastYear.lasYearArr;
			 numAtl = LastYear.numAtl;
			 races = LastYear.races;
			 trains = LastYear.trains;
		}		
	 }
	
	 //Main method:
	 //	  -Asks the initial question calling the initialQuestion method
	 //	  -Builds the main window that terminates the program when closed 
	public static void main(String[] args)
	{
		
		initialQuestions();
		
		JFrame menuFrame = new JFrame();
		menuFrame.setTitle("MAIN MENU");
		menuFrame.setSize(1100, 900);
		menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ClassMain panel = new ClassMain();
		Container pane = menuFrame.getContentPane();
		pane.add(panel);
		menuFrame.setVisible(true);	
	
	
	}


	
	public void actionPerformed(ActionEvent e) 
	{
		//this to repaint the JPanel every time actionPerformed is called, because the timer calls it every 200 milliseconds, and 
		//I want to paint the snow flakes every 200 milliseconds
		repaint();
		
		//if the button addTime is pressed it asks for the main informations about the athlete and it's time,
		//to then add it to the next free row in the main array
		if(e.getSource() == addTime)
		{
			int bibNum = 0;
			double time =0;
			
			JFrame myFrame = new JFrame();
			String myMessage = "Please enter just one time per athlete for each training and race";
			JOptionPane.showMessageDialog(myFrame, myMessage);
			
			try
			{
				String strBibNum = JOptionPane.showInputDialog("Enter athlete's bib number ");
				bibNum = Integer.parseInt(strBibNum);
				
			}
			
			catch(NumberFormatException i)
			{
				JFrame frame = new JFrame();
				String message = "You have to enter a number!";
				JOptionPane.showMessageDialog(frame, message);
				return;
			}
			
			String[] buttons = { "Race", "Training"};  
			int RaceOrTrain = JOptionPane.showOptionDialog(null, "Was it a race or a training?", "Train/Race",
			        JOptionPane.INFORMATION_MESSAGE, 1, null, buttons, buttons[1]);
			
			int RaceTrainNum;
			boolean isRace;
			
			if(RaceOrTrain == 0)
			{
				try
				{
					String strRaceTrainNum = JOptionPane.showInputDialog("Enter the number of the race");
					RaceTrainNum = Integer.parseInt(strRaceTrainNum);
					isRace = true;
				}
				
				catch(NumberFormatException i)
				{
					JFrame frame = new JFrame();
					String message = "You have to enter a number!";
					JOptionPane.showMessageDialog(frame, message);
					return;
				}
				
				
			}
			
			else 
			{
				try
				{
					String strRaceTrainNum = JOptionPane.showInputDialog("Enter the number of the training");
					RaceTrainNum = Integer.parseInt(strRaceTrainNum);
					isRace = false;
				}
				
				catch(NumberFormatException i)
				{
					JFrame frame = new JFrame();
					String message = "You have to enter a number!";
					JOptionPane.showMessageDialog(frame, message);
					return;
				}
				
				
			}
			
			
			try
			{
				String strTime = JOptionPane.showInputDialog("Enter the time of the athlete in format 00.00"); 
				time = Double.parseDouble(strTime);
			}
			
			catch(NumberFormatException i)
			{
				JFrame frame = new JFrame();
				String message = "You have to enter a number!";
				JOptionPane.showMessageDialog(frame, message);
				return;
			}
			
			if(time == 0)
			{
				 JFrame frame = new JFrame();
				 String message = "You have to enter a number that is greater than 0";
				 JOptionPane.showMessageDialog(frame, message);
				 return;
			}
			
			
			for(int k = 0; k<= array.length-1; k++)
			{
				if(array[k][2] == null)
				{
					array[k][0] = NameAndSex[1][bibNum];
					array[k][1] = RaceTrainNum;
					array[k][2] = NameAndSex[0][bibNum];
					array[k][3] = isRace;
					array[k][4] = bibNum;
					array[k][5] = time;
							
					break;
				}
			}
			
		}
		
		//if seeRanking is pressed, a window with the ranking buttons is called
		else if(e.getSource() == seeRankings)
		{
			JFrame rankingFrame = new JFrame();
			rankingFrame.setTitle("RANKING MENU");
			rankingFrame.setSize(900, 900);
			rankingFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			RankingButtons panel = new RankingButtons();
			Container pane = rankingFrame.getContentPane();
			pane.add(panel);
			rankingFrame.setVisible(true);	
		}
		
		//if awards is pressed, a window with the awards buttons is called
		else if(e.getSource() == awards)
		{
			int counter = 0;
			
			for(int i = 0; i < array.length; i++)
			{
				if(array[i][0] != null)
				{
					if((Boolean)array[i][3])
					{
						JFrame awardsFrame = new JFrame();
						awardsFrame.setTitle("RANKING MENU");
						awardsFrame.setSize(400, 300);
						awardsFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
						AwardButtons panel = new AwardButtons();
						Container pane = awardsFrame.getContentPane();
						pane.add(panel);
						awardsFrame.setVisible(true);
						counter++;
						break;
					}
				}
			}
			
			if(counter == 0)
			{
				JFrame frame = new JFrame();
				String message = "There has been no awards win by anyone yet";
				JOptionPane.showMessageDialog(frame, message);
			}
		
		
		}
	}

}
