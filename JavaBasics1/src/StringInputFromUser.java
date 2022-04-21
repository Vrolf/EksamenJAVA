import java.util.Scanner;

public class StringInputFromUser {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Pokemon 1");
		String pokemon1 = scan.nextLine();
		
		System.out.println("Enter Pokemon 2");
		String pokemon2 = scan.nextLine();
		
		System.out.println("Enter Pokemon 3");
		String pokemon3 = scan.nextLine();
		
		System.out.println("Du har valgt disse pokemon!");
		System.out.println(pokemon1);
		System.out.println(pokemon2);
		System.out.println(pokemon3);

	}

}
