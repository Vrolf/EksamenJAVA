package Encapsulaiton;

public class Main {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.setName("Tommy");
		s.setAge(22);
		
		System.out.println(s.getName()); // THIS IS ENCAPSULATIOn
		System.out.println(s.getage());
	}

}
