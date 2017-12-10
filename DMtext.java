import java.util.Scanner;


public class DMtext {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		String name = "";
		int age = 0;
		System.out.println("What is you name?");
		name = input.nextLine();
		
		System.out.println("How old are you?");
		age = input.nextInt();
		
		System.out.println("Hello " + name + ", you are really " + age +" years old?");
		
	}
}
