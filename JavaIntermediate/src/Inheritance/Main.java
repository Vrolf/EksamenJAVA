package Inheritance;

public class Main {

	public static void main(String[] args) {
		Mouse1 m1 = new Mouse1();
		
		m1.rightClick();
		m1.leftClick();
		m1.scrollDown();
		m1.scrollUp();
		
		Mouse2 m2 = new Mouse2();
		m2.leftClick();
		m2.leftClick();
		m2.scrollDown();
		m2.scrollUp();
		

	}

}
