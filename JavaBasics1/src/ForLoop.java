
public class ForLoop {

	public static void main(String[] args) {
	
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Jeg er Kjekk"); // Printer ut det faktum at jeg er kjekk 10 ganger
			
		}// Good practice to use i as variable name 
		// i++ means increment i by one 
		for(int i = 0; i < 15; i++) {
			System.out.println(i);
		}

		int[] grades = {98, 100, 83, 22, 39};
		
		for(int i = 0; i < grades.length; i++) {
			System.out.println(grades[i]);
		}
	} // THE THREE MOST COMMON WAYS PEEOPLE USE FOR LOOPS 
	


}
