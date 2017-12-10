import java.util.Scanner;


public class NicoloFrisianiPayRoll {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = input.nextLine();
		
		System.out.println("What is your lastname?");
		String lastname = input.nextLine();
		
		System.out.println("How much is your rate?");
		int rate = input.nextInt();
		
		System.out.println("How many hours did you work?");
		int hours = input.nextInt();
		
		
		int federaltax = (hours * rate * 17)/100;
		
		int statetax = (hours * rate * 4)/100;
		
		int Fee = 20;
		
		
		System.out.println("Hi " + name + " " + lastname);
		System.out.println("You grossed $" +(hours * rate));
		System.out.println("but you only get $" +((hours * rate)-(statetax + federaltax + Fee)));
		System.out.println("Hahahahahah!  Lol!  don't you feel poor?");
	}
}
