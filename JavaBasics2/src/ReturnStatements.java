
public class ReturnStatements {

	public static void main(String[] args) {
		
		printAMessage();
		int sum = add(5, 4);
		System.out.println(sum);
		
		String shouthing = caps("Why are you reading my diary mom?");
		System.out.println(shouthing);
		
		int[] awesoneArray = gimmeArrayFromtInts(3,2,7);
		System.out.println(awesoneArray[0]);
		System.out.println(awesoneArray[1]);
		System.out.println(awesoneArray[2]);

	}
	
	public static void printAMessage() {
		
		System.out.println("This is our first method!");
		
	}
	
	public static int add(int a, int b) {
		System.out.println(a + b);
		return a + b;
		
	}
	
	public static String caps(String s) {
		return s.toUpperCase();
		
	}
	
	public static int[] gimmeArrayFromtInts(int a, int b, int c) {
		int[] array = new int[3];
		array[0] = a;
		array[1] = b;
		array[3] = c;
		return array;
	}

}
