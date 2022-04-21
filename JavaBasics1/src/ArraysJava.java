
public class ArraysJava {

	public static void main(String[] args) {
		System.out.println("Welcome to our zombie kille program!!!!");
		
		String backpack[] = {"Shotgun", "Assult Rifle", "Sniper"}; // ARRAY SYNTAX
		String zoombies[] = {"Close-range zombie", "Mid-range zoombie", "Long-range zombie"};
		
		System.out.println("Backpack items!");
		System.out.println(backpack[0]);
		System.out.println(backpack[1]);
		System.out.println(backpack[2]);

		System.out.println("THese are the zoombies !");
		System.out.println(zoombies[0]);
		System.out.println(zoombies[1]);
		System.out.println(zoombies[2]);
		
		
		// OHHH NOOO, THERE ARE ONE LONG RANGE ZOOMBIE OUTSIDE MY HOUSE - LET ME PICK UP THE SNIPER
		
		String g = "there is a long-range zombie outside your house, pick your weapon in the array";
		System.out.println(g.toUpperCase());
		
		System.out.println("Item in hand: " + backpack[2]);

		
		

	}

}
