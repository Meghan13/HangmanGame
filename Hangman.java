import java.util.ArrayList;
import java.util.List;
public class Hangman
{
	//*******This is a text based game of Hangman


	public static void main(String[] args) 
	{
		int trys = 0;

		// String head = " O";
		// String body = "|";
		// String lowerBody = "   |";
		// String lArm = " \\";
		// String rArm = "/";
		// String lLeg = "  /";
		// String rLeg = " \\";
		String head = "   |-----|\n   |     |\n   O     |\n         |\n        /|\n   ____/_| ";
		String body = "   |-----|\n   |     |\n   O     |\n   |     |\n        /|\n   ____/_| ";
		//String lowerBody = "   |-----|\n   |     |\n   O     |\n   |     |\n   |    /|\n   ____/_| ";
		String lArm = "   |-----|\n   |     |\n   O     |\n  \\|     |\n        /|\n   ____/_| ";
		String rArm = "   |-----|\n   |     |\n   O     |\n  \\|/    |\n        /|\n   ____/_| ";
		String lLeg = "   |-----|\n   |     |\n   O     |\n  \\|/    |\n   |    /|\n  /____/_| ";
		String rLeg = "   |-----|\n   |     |\n   O     |\n  \\|/    |\n   |    /|\n  /_\\__/_| ";
		String nuse = "   |-----|\n   |     |\n         |\n         |\n        /|\n   ____/_| ";

		List<String> gallowState = new ArrayList<>();

		gallowState.add(nuse);
		gallowState.add(head);
		gallowState.add(body);
		gallowState.add(lArm);
		gallowState.add(rArm);
		gallowState.add(lLeg);
		gallowState.add(rLeg);

		// for(int i = 0; i<gallowState.size(); i++)
		// {
		// 	System.out.println(gallowState.get(i));
		// }


		String givenWord = "cat";
		char guessedLetter = ' ';
		int wordlength = givenWord.length();

		//System.out.println("Welcome to Hangman!\nPress enter to generate a new word: ");
		System.out.println("Welcome to Hangman!\nGuess a letter: ");

		for(int i = 0; i<=wordlength-1;i++)
		{
			System.out.print("_ ");
		} 

		System.out.println("\n\n\n" + rArm);






	}
		

} 