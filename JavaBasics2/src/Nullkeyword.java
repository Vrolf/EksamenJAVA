import java.util.ArrayList;

public class Nullkeyword {

	public static void main(String[] args) {
	
		// [] - > "hey whatsup?"
		String a = "hello";
		// [hull]
		String b = null;
		
		// Primitives cannot store null 
		// int c = null; NOT POSSIBLE
		
		ArrayList b = null;
		
		if(a.equals(null)) { // THIS WILL GIVE A NULLPOINTEREXCEPTION
			System.out.println("is null");
			
		}
		

	}

}
