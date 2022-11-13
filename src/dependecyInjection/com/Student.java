package dependecyInjection.com;

public class Student {
	private String studentName;
	private int age;
	private String addr;

	
	public void disp() {
	  System.out.println("Student name is : "+studentName);
	  System.out.println("Student age is : "+age);
	  System.out.println("Student Address is : "+addr);
	}


	public Student(String studentName, int age, String addr) {
		super();
		this.studentName = studentName;
		this.age = age;
		this.addr = addr;
	}


}
