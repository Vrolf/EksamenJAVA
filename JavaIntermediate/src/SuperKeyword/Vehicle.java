package SuperKeyword;

public class Vehicle {
	
	int maxSpeed = 120;
	
	// super on methods
	
	//public void broom() {
		//System.out.println("|brom brom!!!");
		
		
		// Constructor SUPER 
		
	Vehicle()	{
		
		System.out.println("Vehicle constructor");
		
	}

}

class car extends Vehicle{
	
	//int maxSpeed = 100; 
	
	//public void display() {
		
		// Super on variables 
		//System.out.println(maxSpeed); Will grab the maxSpeed inside car class
		//System.out.println(super.maxSpeed); // THIS grabs the speed from the superclass "Vechicle"
	//}
		//public void broom() {
			//System.out.println("SKUURT"); // THIS WILL then print out from the car class 
			//super.broom(); // WILL NOW print from superclass
			
			
/////////////////////////////////////////////////////////////////////////////////////
			
// Constructor 
			
		car(){
			super();
			//System.out.println("We are in constructor ");
			
		}
			
			
		
	}
	




