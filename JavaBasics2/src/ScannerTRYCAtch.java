import java.util.Scanner;

public class ScannerTRYCAtch {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("HVIKLET TALL LIKER DU?");
	
		
	try {

		int n = scan.nextInt();
		System.out.println(n);
	} catch(Exception e) {
		System.out.println("DU MÅ LEGGE INN ET TALL");
	}
		
	}

}
