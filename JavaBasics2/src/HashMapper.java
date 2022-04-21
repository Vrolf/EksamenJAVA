import java.util.HashMap;

public class HashMapper {

	public static void main(String[] args) {
		
		HashMap<String, Integer> happy = new HashMap <String, Integer>();
		happy.put("a", 10);
		happy.put("b", 3);
		happy.put("c", 88);
		
		//System.out.println(happy);
		
		HashMap<String, String> fun = new HashMap<String, String>();
		fun.put("BobbyJoe1999", "MyPassword");
		fun.put("HelloKityFan", "Password123");
		fun.put("VEC", "ERKJEKK");
		System.out.println(fun.replace("BobbyJoe1999", "BetterPassword123"));
		System.out.println(fun);

	}
	

}
