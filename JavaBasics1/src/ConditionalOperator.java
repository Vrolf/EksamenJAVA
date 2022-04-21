
public class ConditionalOperator {

	public static void main(String[] args) {
		// HOW TO USE THE CONDITIONAL OPERATOR
		
		// int a = (7 > 3) ? 7 : 3; 
		
		int a;
		
		// THE SAME AS 
		if(7 > 3) {
			a = 7;
		}  else {
			a = 3; 
		}
		
		System.out.println(a);

		
		String b = "hello";
		
		double result = b.equals("hello") ? 0.5 : 0.25;
		
		System.out.println(result);
		
		String c = "JAVA";
		
		char result1 = c.equals("HTML") ? 'A': 'B';
		
		System.out.println(result1);
		
		
	}

}
