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
class kråke extends Bird{
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
		
		kråke k = new kråke(); 
		k.sing();
	}

}

