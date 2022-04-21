import java.util.ArrayList;

public class ForEachLoops {

	public static void main(String[] args) {
		
		// Regular For each loop 
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		// FOR EACH LOOP 
		
		String[] cars = {"FERARRI 488", "BWM M2", "TESLA MODEL X"};
		
		for(String car : cars ) {
			System.out.println(car);
	
		}
		
		int[] tall = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int talls : tall) {
			System.out.println(talls);
		}
		
		ArrayList <Integer> numbers = new ArrayList<Integer>();
		numbers.add(55);
		numbers.add(99);
		numbers.add(1000);
	
		for(int a : numbers ) {
			System.out.println(a);
		}

	}

}
