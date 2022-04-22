
public class ThisKeyWord {
	
	int a; 
	int b; 
	
	public  void setData(int a, int b) {
		// THIS KEYWORD WILL NOT WORK WITH STATIC KEYWORD 
		
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) {
		
		ThisKeyWord t = new ThisKeyWord();
		t.setData(4, 3);
		System.out.println(t.a);
		System.out.println(t.b);
		
	}

}
