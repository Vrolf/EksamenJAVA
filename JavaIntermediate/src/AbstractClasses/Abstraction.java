package AbstractClasses;

// ABSTRACT CLASSES HELP MAKE REGULAR CLASSES

abstract class Dog{
	
	public void bark() {
		System.out.println("BARK!");
	}
	
	public abstract void poop();  // AN abstract method is a methods that is not implemented yet 
	
	// Abstract classes help us organize what the class should do 
	// You cannot have any implemented methods inside an interface 
	// but with abstract classes you can have both 
}

class Pitbul extends Dog{

	@Override
	public void poop() {
		System.out.println("Dog Pooped!");
		
	}
	
}

public class Abstraction {

	public static void main(String[] args) {
		
		Pitbul p = new Pitbul();
		
		p.bark();
		p.poop();

	}

}
