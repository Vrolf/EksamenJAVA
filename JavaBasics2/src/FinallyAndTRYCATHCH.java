import java.util.Scanner;

public class FinallyAndTRYCATHCH {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		
		
		
try {
			
			System.out.println(scan.next());
			
		}catch(Exception e) {
			
			System.out.println(e);
			
		}finally {
			
			scan.close();
			
		}

		try {
			
			int a = 5 / 0;
			
		}catch(Exception e) {
			
			System.out.println(e);
			
		}finally {
			
			System.out.println("This is in finally, it will always get run");
			
		}
		
try {
			
			int b = 5 / 2;
			
		}catch(Exception e) {
			
			System.out.println(e);
			
		}finally {
			
			System.out.println("This is in finally, it will always get run");
			
		}
	}

}
