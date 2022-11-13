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


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public void setAge(String age) {
		this.age = Integer.parseInt(age);
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}
}
