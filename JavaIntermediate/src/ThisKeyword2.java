
public class ThisKeyword2 { // this. cannot  be used with static - has to only be public void name
	
	
	String food; 
	char size; 
	
	public void setData(String food, char size) {
		this.food = food; 
		this.size = size;
		
	}

	public static void main(String[] args) {
		ThisKeyword2 t = new ThisKeyword2();
		t.setData("soup", 'L');
		System.out.println(t.food);
		System.out.println(t.size);

	}

}

