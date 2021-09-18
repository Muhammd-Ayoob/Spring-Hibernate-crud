package com.dao;

import java.util.List;

import com.entities.Student;

public interface StudentDao {

	public int insert(Student student);
	
	public int update(Student student);
	
	public Student getStudent(int id);
	
	public List<Student> getStudents();
	
	public void delete(int id);
		
}
