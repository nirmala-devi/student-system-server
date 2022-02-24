package com.nirmala.studentsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nirmala.studentsystem.bean.Student;
import com.nirmala.studentsystem.repository.StudentRepository;

@Service
public class StudentService implements StudentServiceHelper{
	
	@Autowired
	private StudentRepository stdRepos;

	@Override
	public Student saveStudent(Student std) {
		return stdRepos.save(std);
		
	}

	@Override
	public void deleteStudent(int id) {		
		 stdRepos.deleteById(id);;
	}

	@Override
	public Student getStudent(int id) {		
		return stdRepos.getById(id);
	}

	@Override
	public List<Student> getAllStudent() {
		return stdRepos.findAll();
	}

	@Override
	public Student updateStudent(Student std) {	
		return stdRepos.save(std);
	}

}
