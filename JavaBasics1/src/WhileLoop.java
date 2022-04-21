
public class WhileLoop {

	public static void main(String[] args) {
		/*
		while(true) {
			System.out.println("A");  WIll JUST PRINT OUT A IN THE TERMINAL UNTIL IT DIES
		}*/
		
		int a = 0;
		
		while(a < 10) {
			System.out.println("a is less than 10: " + a );
			a++;
		}
		
		//for(int i = 0; i < 10; i++) {
			//System.out.println("i is less than 10: " + i); .. The equvalent of the while loop above
		//}
		
		
		// DO WHILE LOOP
		// THE DO WHILE LOOP will always to whats inside the paratesis first
		
		do {
			System.out.println("a");
			
		}while( a == 1);
		

	}

}
