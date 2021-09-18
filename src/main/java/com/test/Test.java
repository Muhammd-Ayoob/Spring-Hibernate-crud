package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.StudentDao;
import com.entities.Student;

public class Test {

	public static void main(String args[])
	{
		
		ApplicationContext context= new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Student student=(Student) context.getBean("student");
		
		StudentDao dao= (StudentDao) context.getBean("sudentDao");
		
		/*student.setName("Naresh");
		student.setCity("Umerkot");
		student.setRollNo("18CS47");
		
		dao.insert(student);*/
		
		
		
		/*student.setId(2);
		student.setName("Abdul Muqeet");
		student.setRollNo("18CS81");
		student.setCity("Kandhkot");
		
		dao.update(student);*/
		
		
		
		
		/*Student student2=dao.getStudent(3);
		
		System.out.println(student2);*/
		
		
		
		/*List<Student> list= dao.getStudents();
		
		for(Student student2: list)
		{
			System.out.println(student2);
		}*/
		
		
		//dao.delete(1);
	} 
}
