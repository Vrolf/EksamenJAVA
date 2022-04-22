import java.util.Scanner;

public class enums2 {
	
	enum Flavor{
		CHOCLATE, VANILLA, STRAWBERRY;
		
	 public static void getVanilla() {
		 System.out.println(Flavor.VANILLA);
	 }
	}

	public static void main(String[] args) {
		Flavor flav = Flavor.CHOCLATE;
		
		flav.getVanilla();
		
		if(flav == flav.CHOCLATE) {
			System.out.println("its choclate");
		}else if (flav == flav.VANILLA) {
			System.out.println("its vanilla");
		}else if(flav == flav.STRAWBERRY) {
			System.out.println("its strawberyy");
		}
		

	}

}
