package Constructors;

public class Main {

	public static void main(String[] args) {
		
		// shirt s = new shirt(); The last Shirt m.a.o "new Shirt();" is the default constructor. 
		
		shirt s = new shirt("Blue", 'M'); // While this is a made constructor
		
		System.out.println(s.color);
		System.out.println(s.size);
		

	}

}
