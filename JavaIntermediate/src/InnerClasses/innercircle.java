package InnerClasses;

class Outside{
	
	int a = 7; 
	
	class Inside{ // nested class ----- THIS CLASS CANNOT BE PRIVATE, THEN OUTSIDE CLASS WILL NOT KNOW IT 
		int b = 14; 
		
	}
	
}

public class innercircle {

	public static void main(String[] args) {
		
		Outside o = new Outside(); 
		Outside.Inside i = o.new Inside();
		System.out.println(o.a + " " + i.b);
		

	}

}
