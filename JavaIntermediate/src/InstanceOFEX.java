
interface Bird{
	
	public void sing() {
		System.out.println("Singing!");
	}
	
}

class Eagle implements Bird{

	@Override
	public void sing() {
	 System.out.println("Singing!");
		
	}
	
}


public class InstanceOFEX {
	
	public static void main(String[] args) {
		
		Eagle e = new Eagle();
		System.out.println(e instanceof Bird);
		// the thing on the right checks if it is a class, subclass or interface of the thing of the left
		
		Eagle s = null; // Will return false, of logical reasons. 
		System.out.println(s instanceof Bird);
		
	}

}
