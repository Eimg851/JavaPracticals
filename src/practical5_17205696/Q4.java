package practical5_17205696;
/*
A hangman program that randomly generates a word and prompts the user to guess one
letter at a time.
When the user guesses all the letters in the word,
display the number of incorrect guesses and ask the user to enter `y' (or `Y') to play the game again,
or any other character to exit..
*/
import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		//Create scanner object
		Scanner input = new Scanner(System.in);
		do {
		//Initialise list of words for game
		String[] words = {"hello", "world", "programming", "java", "ucd", "practical", "lecture", "snow"};
		int index = (int)(Math.random() * words.length);
		String word = words[index];
		//Hide letters in word
		char[] hiddenWord = new char[word.length()];
		for (int i = 0; i < word.length(); i++)
			hiddenWord[i] += '*';
		String wordCheck = "*";
		String alreadyGuessed = "";
		
		int wrongCount = 0;
		while(new String(hiddenWord).contains(wordCheck)){
			boolean found = false; 
			System.out.println("Guess a letter["+new String(hiddenWord)+"] > ");
			String guess = input.next();
			
			if(word.contains(guess)){
				found = true;
			}
			for(int j = 0; j<alreadyGuessed.length(); j++) {
				if(alreadyGuessed.charAt(j) == guess.charAt(0)) {
				System.out.println("		'"+guess+"' is already guessed.");
				break;
				}}
			alreadyGuessed += guess;

			if (found == false) {
				wrongCount += 1;
				System.out.println("		'"+guess+"' is not in the word");
			}
			else {
				for (int i = 0; i < word.length(); i++) {
					char check = guess.charAt(0);
				if (check == word.charAt(i)) {
					hiddenWord[i] = check;
				}
				
			}
	}
			}
		System.out.println("		You win! The word is ["+new String(hiddenWord)+"]. You missed "+wrongCount+" times.");
		
		// Prompt the user to enter 'y' to play again
		System.out.print("Enter 'y' to play again or any other character to exit > ");
			if (input.next().toLowerCase().charAt(0) != 'y')
			break; // The user does not wish to play again, quit
	} while (true);

		// Display a final message
		System.out.println("Goodbye");
		
		//Close scanner object
		input.close();
		
	}
		}