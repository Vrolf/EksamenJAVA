
public class ComparingStrings {

	public static void main(String[] args) {
		
		String z = new String("lemur");
		String l = new String("lemur");
		
		String a = "lemur";
		String b = "lemur";
		
		if(a == b) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		if(z.equals(l)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		String o = "DOG F iD";
		if(o.toLowerCase().equals("dog f id")) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}

}
