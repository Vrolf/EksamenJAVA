import java.util.ArrayList;
import java.util.Scanner;

public class WhileLoopScanner {

	public static void main(String[] args) {
	
		String sentence = "VICTOR ER AWESOME";
		Scanner scan = new Scanner(sentence); // THIS SCANS THE WORDS IN THE SENTENCE
		ArrayList<String> words = new ArrayList<String>();
		
		while(scan.hasNext()) {
			words.add(scan.next());
		}
		System.out.println(words);
	}

}
