// NFTextLab03.java
// This is the student starting version of the TextLab03 assignment.
// Testing <main> methods are provided for the 80-point and 100-point versions.
// This means that this version will not compile as provided.


import java.util.ArrayList;


public class NFTextLab03
{ 
	public static void main(String args[])
	{
		System.out.println("\nLAB13 100-POINT VERSION\n");
		
		Matrix m1 = new Matrix();
		m1.displayMatrix("Matrix m1 Default Display");
		System.out.println();
		
		Matrix m2 = new Matrix(3,5);
		int count = 100;
		for (int r = 0; r < m2.getRows(); r++)
		{
			for (int c = 0; c < m2.getCols(); c++)
			{
				m2.setValue(r,c,new Integer(count));
				count++;
			}
		}		
		m2.displayMatrix("Matrix m2 3 X 5 Consecutive Integers Display");
		System.out.println();
		
		m2.resize(4,4);
		m2.displayMatrix("Matrix m2 After 4 X 4 Resizing Display");
		System.out.println();
		
		Matrix m3 = new Matrix(3,3,new Integer(100));				
		m3.displayMatrix("Matrix m3 3 X 3 Initialized to 100 Display");
		System.out.println();
	}
	
}



class Matrix
{
	
	
	private int listSize;	// total number of elements in the matrix
	private int numRows;	// number of rows in the matrix
	private int numCols;	// number of cols in the matrix
	private ArrayList<Integer> list;	// one-dimensional array stores matrix values
								



/** Constructs empty ArrayList object and sets all values to 0 **/

public Matrix()
{
	list = new ArrayList<Integer>(numCols*numRows);
	
}
/** Constructs r X c matrix with all elements initialized to 0 **/

public Matrix(int r, int c)
{
	list = new ArrayList<Integer>(r*c);
	
	numCols = c;
	numRows = r;
	
	for(int pos = 0; pos <= r*c; pos++)
	{
			list.add(pos, 0);
	}
	
}
/** Constructs r X c matrix will all elements initialized to value **/

public Matrix(int r, int c, int value)
{
	list = new ArrayList<Integer>(r*c);
	
	numCols = c;
	numRows = r;
	
	for(int pos = 0; pos <= r*c; pos++)
	{
			list.add(pos, value);
	}
}
/** Returns numRows value **/

public int getRows()
{
	return numRows;
}
/** Returns numCols value **/

public int getCols()
{
	return numCols;
}
/** Returns listSize value **/

public int getSize()
{
	return listSize;
}
/** Returns Matrix object value at (r,c) location **/ 

public int getValue(int r, int c)
{
	return (Integer) list.get(r*c);
	
	
}
/** Alters Matrix object value at (r,c) to value **/

public void setValue(int r, int c, int value)
{
	int q = r*numCols +1;
	
	list.set(q+c, value);
}
/** Displays Matrix object in two-dimensional matrix format **/

public void displayMatrix(String str)
{
	if(list.size() == 0)
	{
		
		str += "\n" + "Matrix has no elements";
	}
	
	
	for(int i = 0; i <= list.size()-1; i++)
	{
		str += list.get(i) + " ";
		
		if(i % numCols == 0)
		{
			str += "\n";
		}
	}
	
	
	System.out.println(str);
}
/** Resizes Matrix object to new rows X cols size, copies all possible

 previous values and initializes new elements to zero **/

public void resize(int rows, int cols)
{
	
	for(int i = 0; i <= list.size() -1 ; i++)
	{
		if(i % (cols+1) == 0 && i != 0)
		{
				list.set(i,0);
				
		}
	}
	
	for(int k = 1; k <= list.size() -1; k++)
	{
		if(list.get(k) == 0)
		{
			list.remove(k);
		}
	}
	
	
	for(int pos = numRows*rows +1; pos <= (numRows*rows +1) + cols -1; pos++)
	{
			list.add(pos, 0);
	}
	
	numCols = cols;
	numRows = rows;
}



}
