
public class SettersANDgetters {
	
	String name; 
	int age; 

	public static void main(String[] args) {
		
		SettersANDgetters a = new SettersANDgetters();
		
		a.setName("Pablo");
		a.setAge(59);
		System.out.println(a.getName());
		System.out.println(a.getAge());
		a.printDetails();

	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age; 
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void printDetails() {
		System.out.println(name + ", " + age);
	}

}
