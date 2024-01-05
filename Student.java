package practice;

public class Student {
	int id;
	String name;
	
	Student(){
		this("radha");
		System.out.println("no-arg");
	}
	Student(int id){
		this(7 ,"mohan");
		System.out.println(id);
	}
	Student(String name){
		this(202);
		System.out.println(name);
	}
	 
	Student(int id, String name) {
		System.out.println(name+" "+id);
	}


	public static void main(String[] args) {
		Student s=new Student();
		
	}

}
