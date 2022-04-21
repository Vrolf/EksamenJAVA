
public class BooleanDoorexample {

	public static void main(String[] args) {
		
		boolean passedDoor = true; 
		boolean missedDoor = false;
		boolean allDoorPassed = false;
	
		int doorCount = 0;
	
		if(passedDoor) {
			System.out.println("We passed the first door");
			doorCount = doorCount + 1;
		}
		
		if(passedDoor) {
			System.out.println("We passed the second door");
			doorCount = doorCount + 1;
			
		}
		
		if(passedDoor) {
			System.out.println("We passed the third door");
			doorCount = doorCount + 1; 
		}
		
		if(doorCount == 3) {
			allDoorPassed = true;
			
		}
		
		if(allDoorPassed) {
			System.out.println("Gongrats you passed all the doors");
		}
		

	}

}
