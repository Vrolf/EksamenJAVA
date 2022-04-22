
public class RecursiveMethods {

	
	public static void main(String[] args) {

		sayHI(5);
		countBackwards(14);
		
	}
	
	public static void sayHI(int n) {
		System.out.println("hi");
		if( n == 0) {
			System.out.println("Done!");
		}else {
			System.out.println("hi");
			n--;
			sayHI(n);
		}
	}
	
	public static void countBackwards (int l) {
		if(l == 0) {
			System.out.println("DONE");
		}else {
			System.out.println(l);
			l--;
			countBackwards(l);
		}
	}
	
	

	// Need a base case 
}
