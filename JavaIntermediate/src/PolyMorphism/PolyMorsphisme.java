package PolyMorphism;

// POLYMORPHISM MEANS MANY FORMS


class Bird{
	public void sing() {
		System.out.println("tweedle tweedle");
	}
}

class Eagle extends Bird{
	public void sing()
	{
		System.out.println("COMMING TO EAT FISH tweeet tweeeeet");
	}
}
class kr�ke extends Bird{
	public void sing() {
		System.out.println("diving towards your baguette sid tweeeeeeeeet");
	}
}

public class PolyMorsphisme {
	
	public static void main(String[] args) {
		Bird b = new Bird(); 
		b.sing();
		
		Eagle e = new Eagle();
		e.sing();
		
		kr�ke k = new kr�ke(); 
		k.sing();
	}

}

