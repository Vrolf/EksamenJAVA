
public class NestedForLoops {

	public static void main(String[] args) {
		// Regular for loop 
		
		for(int i = 0; i <5; i++) {
			System.out.println("REGULAR FOR LOOP");
		}
		
		System.out.println("---------------------");
		
		String[] colors = {"Red", "Blue", "Green"};
		// NESTED FOR LOOP 
		for(int i = 0; i <3; i++) {
			System.out.println(colors[i]);
			
		}
		System.out.println("---------------------");
		
		// nested for loop 
		
		String[][] fancyColors = {{"RØD", "BLÅ", "GRØNN"},
								  {"CYAN", "MAGENTA", "TURQUISE"}
		};
		
		for(int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(fancyColors[i][j]);
			}
		}
		
		System.out.println("---------------------"); 
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.println("i: " + i + ", j: " + j);
			}
		}

		
	}

}
