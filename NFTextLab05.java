// NFTextLab05.java
// The Student Records Algorithm Program
// This is the student, starting version of the TextLab05 assignment.


import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

      
public class NFTextLab05
{
	public static void main(String args[]) throws IOException
	{
		List studentArray = new List(100);
		studentArray.getList();
		studentArray.display("UNSORTED LIST OF STUDENTS");
		studentArray.pause();
		
		studentArray.gpaSort(); 
		studentArray.display("STUDENTS SORTED IN DESCENDING ORDER BY GPA");
		studentArray.pause();
		
		studentArray.ageSort(); 
		studentArray.display("STUDENTS SORTED IN ASCENDING ORDER BY AGE");
		studentArray.pause();	
		
		studentArray.idSort();  
		studentArray.display("STUDENTS SORTED IN ASCENDING ORDER BY ID#");
		studentArray.pause();	
		
		Integer studentID = getID();
		int index = studentArray.search(studentID);
		
		if (index == -1)
		{
		    System.out.println("There is no student with an ID# of "+studentID+".\n");
		}
		else
		{
			studentArray.displayStudent(index);   // displays the information for the found student
		
			studentArray.delete(index);           // remove the same student from the array
			studentArray.display("STUDENTS SORTED IN ASCENDING ORDER BY ID# WITHOUT STUDENT# "+studentID);
			studentArray.pause();
		}    
	}
	
	public static int getID()
	{
		Scanner input = new Scanner(System.in);	 
		System.out.print("\nEnter the 6-digit ID of the student.  { 100000 - 999999 }  -->  ");
		return input.nextInt();
	}
}


class Person
{
	public String name;
	public int id;
	public int age;
	public double gpa;
   
	Person(String n, int ID, int a,double g)
	{
		name = n;
		id = ID;
		age = a;
		gpa = g;
	}
}


class List
{
	private Person student[];	// stores array elements
	private int capacity;		// actual array capacity
	private int size;			// number of elements in the array
   
	public List(int c)
	{
		capacity = c;
		size = 0;
		student = new Person[capacity];            
	}

	public void getList() throws IOException
	{
		FileReader inFile = new FileReader("students2.dat");	
		BufferedReader inStream = new BufferedReader(inFile);	     
		String s1,s2,s3,s4;
		int age, id;
		double gpa;						
		int index = 0;
		while( ((s1 = inStream.readLine()) != null) && 
			   ((s2 = inStream.readLine()) != null) && 
			   ((s3 = inStream.readLine()) != null) &&
			   ((s4 = inStream.readLine()) != null) )	
		{
			String name = s1;
			id = Integer.parseInt(s2);
			age = Integer.parseInt(s3);
			gpa = Double.parseDouble(s4);

			student[index] = new Person(name,id,age,gpa);       
			index++;
		}   
		inStream.close(); 
		size = index;   					
	}
	
	private String spaces(String name)
    {
    	int tab = 24 - name.length();
    	String temp = "";
    	for (int j = 1; j <= tab; j++)
    	    temp += " ";
    	return temp;    
    }
      
	public void display(String listInfo)
	{
		DecimalFormat output = new DecimalFormat("0.000");
		System.out.println("\nDISPLAYING "+ listInfo);
		System.out.println("\nStudent ID#     Student Name            Age         GPA");
		System.out.println("============================================================");
		     
		for (int k = 0; k < size; k++)
			System.out.println(student[k].id + "          "+student[k].name + spaces(student[k].name) + student[k].age + "          " + output.format(student[k].gpa));
	}   
	
	public void pause() 
	{   
		Scanner input = new Scanner(System.in);	 
		String dummy;
		System.out.println("\nPress <Enter> to continue.");						
		dummy = input.nextLine();								
	}

	public void displayStudent(int index)
	{
		System.out.println();
		System.out.println();
		System.out.println("Student record for ID# " + student[index].id);
		System.out.println();
		System.out.println("Name: " + student[index].name);
		System.out.println("Age: " + student[index].age);
		System.out.println("Gpa: " + student[index].gpa);
	}   

	public void swap(int x, int y)
	{
		Person temp = student[x];
		student[x] = student[y];
		student[y] = temp;
	}
	public void gpaSort()
	{
		 for (int i = size; i > 1; i--) 
		 {
			 int Max = 0;
			 
		    for (int x = 1; x < i; x++) 
		    {
		        if (student[x].gpa < student[Max].gpa) 
		        {
		        	Max = x;
		        }
		    }  
        swap(Max, (i-1));
	   	}
	}

	public void ageSort()
	{
		 for (int i = size; i > 1; i--) 
		 {
			 int Max = 0;
			 
		    for (int x = 1; x < i; x++) 
		    {
		        if (student[x].age > student[Max].age) 
		        {
		        	Max = x;
		        }
		    }  	    
		    swap(Max, (i-1));
	   	}
	}
	
	public void idSort()
	{
		 for (int i = size; i > 1; i--) 
		 {
			 int Max = 0;
			 
		    for (int x = 1; x < i; x++) 
		    {
		        if (student[x].id > student[Max].id) 
		        {
		        	Max = x;
		        }
		    }  
		    
		    swap(Max, (i-1));
	   	}
	}
	
	public int search(Integer studentID)
	{
		int left = 0;
		int right = size -1;
		
		while(left <= right)
		{
			int middle = (left + right) /2;
			
			int diff = studentID.compareTo(student[middle].id);
			
			if(diff > 0)
			{
				left = middle +1;
			}
			
			if(diff < 0)
			{
				right = middle -1;
			}
			
			else if(diff == 0)
			{
				return middle;
			}
		}
		
		return -1;
	}		
	
	
	public void delete(int index)
	{
		for(int k=index; k<size-1;k++)
		{
			student[k]=student[k+1];
		}
		
		size--;
		
	  }
}    

