package dependecyInjection.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Student student =(Student)context.getBean("student");
		student.disp();
	}
}
