package com.nirmala.studentsystem.service;

import java.util.List;



import com.nirmala.studentsystem.bean.Student;


public interface StudentServiceHelper {
	
	public Student saveStudent(Student std);
	
	public Student getStudent(int  id);
	
	public List<Student> getAllStudent();
	
	public Student updateStudent(Student std);

	public void deleteStudent(int id);

}
