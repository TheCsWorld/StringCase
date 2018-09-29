
import java.util.Scanner;
/*reads a string from the keyboard, and outputs the string twice in a row, first all
uppercase and next all lowercase. Example: the string “Hello" is given, the output will be “HELLOhello"*/
public class ChangeStringCase {

	public static void main(String[] args) {
		String word;
		System.out.print("Enter a word: ");
		Scanner inputScanner = new Scanner(System.in);
		word = inputScanner.nextLine();
		inputScanner.close();
		System.out.print(word.toUpperCase() + " " + word.toLowerCase());		//need to put in " " so the words will be spaced
	}

}
