package Interface;

interface fun { // An INTEFACE IS AN OUTLINE OF AN CLASS
	// WATER BOTTLE EXAMPLE 
	
	String color = "Blue";
	
	void fillUp();
	
}

public class interfaceFUn  implements fun{

	public static void main(String[] args) {
		System.out.println(color);
		
	interfaceFUn ex = new interfaceFUn();
	ex.fillUp();
		

	}

	@Override
	public void fillUp() {
		System.out.println("Bottle Is filed up");
		
	}

}
