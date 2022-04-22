package Encapsulaiton;

public class Student {
	
	private String name;  // ENCAPSULATED
	private int age; // ENCAPSULATED
	
	public void setName(String newName) {
		name = newName;
	}
	
	public String getName() {
		return name; 
	}
	
	public void setAge(int newage) {
		age = newage;
	}
	
	public int getage() {
		return age; 
	}

}
