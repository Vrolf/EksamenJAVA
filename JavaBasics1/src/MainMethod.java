
public class MainMethod {

	public static void main(String[] args) {
		// When you run code - you run things inside the main method
		System.out.println(args[0]); // PRINTS HEI, BECAUSE WE ADDED THIS AS A ARGUMENT

		// hei("HEI");
	//}
	
	// VOID METHOD SYNTAX THAT DOES NOT RETURN ANYTHING 
	
	//static void hei(String s) {
		//System.out.println(s);
	//()}

	
	if(args[0].equals("HEI,")) {
		System.out.println("YOYO");
	} else if(args[0].equals("HEHEHE")) {
		System.out.println("YAY!");
	}
}

