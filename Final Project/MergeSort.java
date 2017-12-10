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
 * MergeSort Class:
 * 
 * -Applies the merge sort algorithm to sort an array of doubles
 * 
 * 
 * IMPORTANT INFORMATIONS:
 * 
 * 	I reviewed the mergesort code on the book before writing this class
 * 
 */

public class MergeSort
{
	static double[] temp;

	// Sorts "a" in ascending order
	public static void sort(double[] a)
	{
		int i = a.length;
		temp = new double[i];
		recursiveSort(a, 0, i-1);
	}

  // Recursive helper method: sorts from a[from] to a[to]
	public static void recursiveSort(double[] a, int from, int to)
	{
		// Base case: 1 or 2 elements
		  if (to - from < 2)       
		  {
			  if (to > from && a[to] < a[from])
			  {
				  // swap a[to] and a[from]
				  double aTemp = a[to];
				  a[to] = a[from]; 
				  a[from] = aTemp;
			  }
		  }
	    
		  else
		  {
			  int half = (from + to) / 2;
			  recursiveSort(a, from, half);
			  recursiveSort(a, half + 1, to);
			  merge(a, from, half, to);
		  }
	}

  // Merges from a[from] to a[half] and from a[half+1] to a[to]
	private static void merge(double[] a, int from, int half, int to)
	{
		 int x = from; 
	    	int y = half + 1;
	    	int k = from;

	    	// While both arrays have elements that hasn't been processed yet:
	    	while (x <= half && y <= to)
	    	{
	    		if (a[x] < a[y])
	    		{
	    			temp[k] = a[x++];
	    		}
	    	
	    		else
	    		{
	    			temp[k] = a[y++];
	    		}
	    	
	    		k++;
	    	}

	    	// Copies the beginnings of the first half into temp
	    	while (x <= half)
	    	{
	    		temp[k++] = a[x++];  
	    	}

	    	// Copies the beginning of the second half into temp
	    	while (y <= to)
	    	{
	    		temp[k++] = a[y++]; 
	    	}

	    	// Copies temp into a
	    	for (k = from; k <= to; k++)
	    	{
	    		a[k] = temp[k];
	    	}
  	  }
}
