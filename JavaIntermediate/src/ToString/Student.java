package ToString;

public class Student {
	
	int studetnId;
	String name; 
	
	Student(int studentId, String name )	{
		
	this.studetnId = studentId;
	this.name = name; 
			
	}
	
	public String toString(){
		return studetnId + " " + name;
	}

}
