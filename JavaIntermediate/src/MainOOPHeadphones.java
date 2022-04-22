
public class MainOOPHeadphones {

	public static void main(String[] args) {
		
		OOPHEADphones h = new OOPHEADphones();
		
		System.out.println(h.color);
		System.out.println(h.charge);
		System.out.println(h.controls);
		
		System.out.println(h.power);
		h.poweron();
		System.out.println(h.power);
		System.out.println(h.volume);
		h.volumeUp();
		h.volumeUp();
		h.volumeUp();
		h.volumeUp();
		System.out.println(h.volume);

		
	}

}
