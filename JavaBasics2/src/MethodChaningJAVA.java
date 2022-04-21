
public class MethodChaningJAVA {

	public static void main(String[] args) {
		
		String a = "doug dimmadome";
		System.out.println(a.toUpperCase().charAt(0));
		
		String b = "pie";
		
		int c = a.concat("is good").chars().toArray()[0];
		
		System.out.println(c);
		
		
		Student s = new Student();
		s.setGrade(99).setName("bob");
		
		System.out.println(s.name);
		System.out.println(s.grade);
		
	}
	
	class Student{
		String name; 
		int grade; 
		
		public Student setName(String name) {
			this.name = name;
			return this;
		}
		
		public Student setGrade(int grade) {
			this.grade = grade;
			return this;
		}
		
	}

}
