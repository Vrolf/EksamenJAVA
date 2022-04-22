
enum Levels{
	LOW, MEDIUM, HIGH; // WE USE ENUMS FOR THINGS THAT DO NOT CHANGE
}

public class LetsDoEnums {
	
	public static void main(String[] args) {
		
		Levels l = Levels.LOW;
	
		
		 
		switch(l) {
		case LOW:
			System.out.println("LOW LEVEL");
			break;
		case MEDIUM:
			System.out.println("MEDIUM LEVEL");
			break;
		case HIGH:
			System.out.println("HIGH LEVEL");
			break; 
		}

	}

}
