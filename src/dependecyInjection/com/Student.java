package dependecyInjection.com;

public class Student {
	private String studentName;

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void disp() {
	  System.out.println("Student name is : "+studentName);
	}
}
