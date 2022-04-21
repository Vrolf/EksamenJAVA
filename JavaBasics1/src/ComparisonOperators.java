
public class ComparisonOperators {

	public static void main(String[] args) {
		
		// == is equal to 
		// != Is not equal to 
		// <= less than or equal to 
		// < less than 
		// > Greater than 
		// >= greater than or equal to 
		// || OR 
		// && AND
		
		
		int a = 5;
		
		int b = 4;
		
		boolean c = (a == b); // prints False
		
		double f = 2.4;
		
		if( f == 2.4) {
			System.out.println("They are equal!");
		}
		
		if(f > 7) {
			System.out.println("They are equal!");
		}
		
		if(f == 2.4 || a == 2.5) { // true || false - but will print it out
			System.out.println("a is 2.4 or 2.5");
		}
		
		if(f >= 0 && a <= 100) {
			System.out.println("F IS IN THE RANGE");
		}
		
		

	}

}
