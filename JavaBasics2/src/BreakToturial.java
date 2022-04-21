
public class BreakToturial {

	public static void main(String[] args) {

		while(true) {
			System.out.println("HEI");
			break;
		}
		
		int i = 0;
	
		while(i < 3) {
			System.out.println("HEEEI");
			i++;
			break;
		}
		
		int[] numbers = {10, 20, 30, 40, 50};
		
		for(int j = 0; j < numbers.length; j++) {
			if(numbers[j] == 30) {
				break;
			}
			System.out.println(numbers[j]);
		}
		int v = 1;
		
		switch(v) {
		case 0: 
			System.out.println("ZERO");
			break;
		case 1: 
			System.out.println("ONE");
			break;
		default:
			System.out.println("WFT MAN????");
			break;
		}
		
		// NESTED FOR LOOP BREAK
		
		for(int l = 0; l < 5; l++) {
			for(int p = 0; p < 3; p++) {
				System.out.println(l + ", " + p);
				break;
			}
		}
	
		

	}

}
