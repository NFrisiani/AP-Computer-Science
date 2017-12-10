import java.util.Scanner;


public class NicoloFrisianiGrader {

	
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your first name: ");
		String FirstName = input.nextLine();
		
		System.out.println("Enter your last name: ");
		String LastName = input.nextLine();
		
		System.out.println("Enter your numeric grade: ");
		int NumericGrade = input.nextInt();
		
		
		if (NumericGrade >= 97)
		
		 	{ 
		 		
		 		System.out.println("Wow, " + FirstName + " " + LastName + ", you just got an A+!!");
		 		
		 	}
		
		 	
		 	
		 	
		 
		 if (NumericGrade >= 94 && NumericGrade < 97) 
		 {
			
			 	System.out.println("Great, " + FirstName + " " + LastName + ", you just got an A!");
			 	
		 }
		 
		 
		 
		 
		
		 if (NumericGrade >= 90 && NumericGrade < 94) 
		 {
			
			 	System.out.println("Good job, " + FirstName + " " + LastName + ", you just got an A-");
			 	
		 }
		 
		 
		 
		 
		 
		 if (NumericGrade >= 87 && NumericGrade < 90) 
		 {
			
			 	System.out.println("Good, " + FirstName + " " + LastName + ", you just got a B+");
			 	
		 }
		 
		
		 
		 
		 
		 if (NumericGrade >= 84 && NumericGrade < 87) 
		 {
			
			 	System.out.println("Yeah, " + FirstName + " " + LastName + ", you just got a B");
			 	
		 }
		 
		 
		 
		 
		 if (NumericGrade >= 80 && NumericGrade < 84) 
		 {
			
			 	System.out.println("Well done " + FirstName + " " + LastName + ", you just got a B-");
			 	
		 }
		 
		 
		 
		 
		 if (NumericGrade >= 77 && NumericGrade < 80) 
		 {
			
			 	System.out.println("Hey, " + FirstName + " " + LastName + ", you just got a C+");
			 	
		 }
		 
		 
		 
		 
		 if (NumericGrade >= 74 && NumericGrade < 77) 
		 {
			
			 	System.out.println("It's fine, " + FirstName + " " + LastName + ", you just got a C");
			 	
		 }
		 
		 
		 
		 
		 if (NumericGrade >= 70 && NumericGrade < 74) 
		 {
			
			 	System.out.println("Hey, " + FirstName + " " + LastName + ", you just got a C-");
			 	
		 }
		 
		 
		 
		 
		 if (NumericGrade >= 67 && NumericGrade < 70) 
		 {
			
		 	System.out.println("Hey, " + FirstName + " " + LastName + ", you just got a D+...I know you can do better!");
			 	
		 }
		 
		 
		 
		 
		 if (NumericGrade >= 64 && NumericGrade < 67) 
		 {
			
		 	System.out.println("Hey, " + FirstName + " " + LastName + ", you just got a D...I know you can do better!");
			 	
		 }
		 
		 
		 
		 
		 if (NumericGrade >= 60 && NumericGrade < 64) 
		 {
			
		 	System.out.println("Hey, " + FirstName + " " + LastName + ", you just got a D-...STUDY! I know you can do better!");
			 	
		 }
		 
		 
		 
		 
		 if (NumericGrade >= 57 && NumericGrade < 60) 
		 {
			
		 	System.out.println("Come on, " + FirstName + " " + LastName + ", you just got an F+...Go to STUDY!! I know you can do better!");
			 	
		 }
		 
		 
		 
		 
		 if (NumericGrade < 57) 
		 {
			
		 	System.out.println("COME ON, " + FirstName + " " + LastName + ", you just got an F...GO TO STUDY IGNORANT!!!");
			 	
		 }
		 
		 
		 
		 
		 
		 
	}
}
