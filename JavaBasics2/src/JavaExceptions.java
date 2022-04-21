import java.util.ArrayList;

public class JavaExceptions {

	public static void main(String[] args) {
		String[] pets = {"dog", "cat", "donkey"};
		System.out.println(pets[3]);
		
		// WILL GIVE AN OUTOFBOUNDS EXCEPTION 
		
		ArrayList<String> list = new ArrayList<String>();
		list.get(0); // GIVES EXCEPTION 
		
		ArrayList<String> lister = null;
		list.get(0); // GIVES NULLPOINTER EXCEPTION
		
		
	}

}
