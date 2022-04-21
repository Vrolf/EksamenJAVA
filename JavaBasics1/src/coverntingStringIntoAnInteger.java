
public class coverntingStringIntoAnInteger {

	public static void main(String[] args) {
		
		// STRING TO INTEGER
		
		String s = "102";
		
		Integer.parseInt(s); // Converts String into an Integer
		
		System.out.println(s + 4);

		String g = "10002"; 
		
		System.out.println(Integer.parseInt(g) + 10000);

		
		int m = 100;
		
		// INTEGER TO STRING
		System.out.println(Integer.toString(m)+ 1);
		
		
		// GET INTEGER FROM STRING THAT HAS NOT JUST NUMBERS
		
		String q = "age: 47";
		q = q.replaceAll("\\D+","");
		
		int n = Integer.parseInt(q);
		System.out.println(n + 2);
	}

}
