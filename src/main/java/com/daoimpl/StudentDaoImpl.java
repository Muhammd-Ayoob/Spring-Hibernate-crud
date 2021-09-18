package com.daoimpl;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.dao.StudentDao;
import com.entities.Student;

public class StudentDaoImpl implements StudentDao {
	
	//HibernateTemplate object to call hibernate methods to perform different operations
	HibernateTemplate hibernateTemplate;
	
	
	//Inserting data in database
	@Transactional
	public int insert(Student student)
	{
		int r=(Integer)this.hibernateTemplate.save(student);
		
		return r;
	}
	
	
	
	//Updateing any row from database
	@Transactional
	public int update(Student student) {
		
		this.hibernateTemplate.saveOrUpdate(student);
		
		System.out.println("Update Successfully");
		
		return 0;
		
	}
	
	
	//Getting single row from table
	public Student getStudent(int id)
	{
		Student student=hibernateTemplate.get(Student.class, id);
		
		
		return student;
	}
	
	
	//Get All data(rows) of database
	public List<Student> getStudents()
	{
		
		List<Student> list= hibernateTemplate.loadAll(Student.class);
		
		return list;
	}
	
	
	
	//Method to delete a single row by id
	@Transactional
	public void delete(int id)
	{
		Student student=hibernateTemplate.get(Student.class, id);
		
		this.hibernateTemplate.delete(student);
		
	}
	
	
	/**
	 * @return the hibernateTemplate
	 */
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	/**
	 * @param hibernateTemplate the hibernateTemplate to set
	 */
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	
}
