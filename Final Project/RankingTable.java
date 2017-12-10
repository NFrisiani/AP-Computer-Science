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
 * RankingTable Class:
 * 
 * -Expects a 2D array of Object as a parameter
 * 
 * 
 * -Builds a table with this array and with an array of Strings as columns titles.
 * 
 * 
 * IMPORTANT INFORMATIONS:
 * 
 * 	I learned this on a youtube tutorial (Java GUI Tutorial 19 - JTable) by (Winston Lievsay)
 * 
 */


import javax.swing.*;
import java.awt.*;

public class RankingTable extends JFrame
{
	public RankingTable(Object[][] data) //object data is a 2d object array with all the information for the table to be done
	{
		setLayout(new FlowLayout()); //sets the layout of the table
		
		String[] columnNames = {"Position", "Bib Number", "Name", "Gender", "Time"}; //column's titles
		
		JTable rankTable = new JTable(data, columnNames); 
		
		rankTable.setPreferredScrollableViewportSize(new Dimension(500, 500));
		rankTable.setFillsViewportHeight(true);
		
		JScrollPane scrollPane = new JScrollPane(rankTable);
		
		add(scrollPane);
	}
}
