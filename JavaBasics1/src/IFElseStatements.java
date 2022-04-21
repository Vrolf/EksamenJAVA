import java.util.Scanner;

public class IFElseStatements {
	
	// GRADE SYSTEM FUN WITH IF ELSE STATEMENTS 

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a grade:");
		
		//char Grade = scan.next().charAt(0);
		//System.out.println("Grade = " + Grade);
		
		int n = scan.nextInt();
		
		if (n >= 90 && n <= 100) {
			System.out.println("A");
			
		}else if(n >= 80 && n <= 90) {
			System.out.println("B");
			
		}else if(n >= 60 && n <= 80) {
			System.out.println("C");
			
		}else if (n >= 50 && n <= 60) {
			System.out.println("D");
			
		}else if (n >= 40 && n <= 50) {
			System.out.println("E");
			
		}else if (n >= 0 && n <= 40) {
			System.out.println("F");
			
		}else {
			System.out.println("Tallet du la inn er ikke i gyldig det må være mellom 0-100");
		}

	}

}
