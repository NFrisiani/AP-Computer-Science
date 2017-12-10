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
 * PerfRegTable Class:
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


import java.awt.*;
import javax.swing.*;


public class PerfRegTable extends JFrame {

	public PerfRegTable(Object[][] data)
	{	
		setLayout(new FlowLayout());
		
		String[] columnNames = {"Position", "Bib Number", "Name", "Gender", "ÆTime"};
		
		JTable rankTable = new JTable(data, columnNames);
		
		rankTable.setPreferredScrollableViewportSize(new Dimension(500, 500));
		rankTable.setFillsViewportHeight(true);
		
		JScrollPane scrollPane = new JScrollPane(rankTable);
		
		add(scrollPane);
	}
}
