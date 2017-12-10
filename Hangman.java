import java.util.Scanner;  // importing the scanner









public class Hangman{







public static void main (String[] args) {



// Declare variables needed and set starting condition


	boolean finished = false;

	boolean completedword = false;

	int badGuessCount = 0; // to count the number of bad guesses

	String spaces = ""; // temporary string to create a string of dashes

	String newspaces = ""; // temporary string to create a string of dashes

	String currentguess = ""; // current status of word guess




// select the word to be discovered


    System.out.println("Tell me the word to be guessed");

    Scanner scanword = new Scanner(System.in);

    String word = scanword.nextLine();

    int length = word.length(); // int for the length of the word

   

   

// create a string of dashes the same length as the word to be guessed


    for (int l = 0; l < length; l++) {

    		newspaces = spaces + "_";

    		spaces = newspaces;

    }

    currentguess = spaces;


// repeat cycle of guessing a new letter, checking it and showing status


    while(!finished) {


    	// display current status of word guess and gallows

    	System.out.println(currentguess);



    	// ask for new letter guess

    	System.out.println("\n\n\nPlease enter your letter:");

    	Scanner UsersGuess = new Scanner(System.in); // Scanner variable to get the letter from the user

    	String entryletter = UsersGuess.nextLine();// Transforming the Scanner variable in a String one


    	// test if the new letter guess is part of the word to be discovered

    	// if it is, update current guess 

    	// if it is not, increase badguesscount and inform on number of attempts remaining

    	// in any case display status of hangman


    	newspaces = currentguess;

    	boolean letterfound = false;

    	for (int l = 0; l < length; l++ ) {

    		if (word.charAt(l) == entryletter.charAt(0)){	  

    			int pos = l;

    			letterfound = true;

    			newspaces = currentguess.substring(0, pos) + entryletter + currentguess.substring(pos+1, length);

    			currentguess = newspaces;

    		}

    	}

    	if (letterfound	== false) {

    		badGuessCount++;

    		System.out.print("\n\nSorry, your guess was incorrect. You still have ");

    		System.out.print(6-badGuessCount);

    		System.out.println(" attempts");

    	}

 


    	// display status of hangman 

    	if (badGuessCount == 0) {

    		System.out.println("\n\n\n_____");

    		System.out.println("|   |");

    		System.out.println("|   ");

    		System.out.println("|   ");

    		System.out.println("|   ");

    	}


    	if (badGuessCount == 1) {

    		System.out.println("\n\n\n_____");

    		System.out.println("|   |");

    		System.out.println("|   o");

    		System.out.println("|   ");

    		System.out.println("|   ");

    	}


    	if (badGuessCount == 2) {

    		System.out.println("\n\n\n_____");

    		System.out.println("|   |");

    		System.out.println("|   o");

    		System.out.println("|   |");

    		System.out.println("|   ");

    	}


    	if (badGuessCount == 3) {

    		System.out.println("\n\n\n_____");

    		System.out.println("|   |");

    		System.out.println("|   o");

    		System.out.println("|  /|");

    		System.out.println("|   ");

    	}


    	if (badGuessCount == 4) {

    		System.out.println("\n\n\n_____");

    		System.out.println("|   |");

    		System.out.println("|   o");

    		System.out.println("|  /|\\");

    		System.out.println("|   ");

    	}


    	if (badGuessCount == 5) {

    		System.out.println("\n\n\n_____");

    		System.out.println("|   |");

    		System.out.println("|   o");

    		System.out.println("|  /|\\");

    		System.out.println("|  /");

    	}


    	if (badGuessCount == 6) {

    		System.out.println("\n\n\n_____");

    		System.out.println("|   |");

    		System.out.println("|   o");

    		System.out.println("|  /|\\");

    		System.out.println("|  / \\");

    	}



    	// check if all attempts exausted

    	if (badGuessCount==6) {

    		System.out.println("\n\nSorry but you lost.");

    		System.out.println("The word was: " +word);

    		finished=true;

    	}


    	// check if word fully guessed

    	completedword = true;

    	for (int l = 0; l < length; l++) {

    		if (currentguess.charAt(l) == '_') {

    			completedword = false;

    		} 

    	}

    	if (completedword == true) {

    		System.out.println("\n\n\nYES, YOU WON!!");

    		finished=true;

    	}

 

    }   // close repeat cycle of guessing a new letter, checking it and showing status



}  // close public static void main

}