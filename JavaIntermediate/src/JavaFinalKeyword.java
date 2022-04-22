
public class JavaFinalKeyword {
	
	// FINAL KEYWORD means final value, cannot be changed 
	
	final int MIN = 0; 
	final int MAX = 5; 
	static final double PI = 3.14159;
	
	void changeMAX(int newMAX) {
		MAX = newMAX; // NOT POSSIBLE 
	}
	
	final public void sayHi() {
		System.out.println("hi");
	}

	public static void main(String[] args) {
	
		JavaFinalKeyword f = new JavaFinalKeyword();
		System.out.println(f.MAX);

	}
}

 class otherclass extends JavaFinalKeyword{
	
	 final public void sayHi() {
			System.out.println("hi");
		} // CANNOT OVERIDE A FINAL METHOD 
	 
}
 
 
 final class finale{
	 Long x = 1001010101010L; 
 }
 
 class finalen extends finale{ // Not possible to extend final classes
	 
 }