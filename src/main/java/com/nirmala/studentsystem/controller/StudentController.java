package com.nirmala.studentsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nirmala.studentsystem.bean.Student;
import com.nirmala.studentsystem.service.StudentServiceHelper;

@RestController
@CrossOrigin
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentServiceHelper stdSer;
	
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student std) {		
		return stdSer.saveStudent(std);
		
	}
	
	@GetMapping("/getAll")
	public List<Student> getAllStudent() {
		return stdSer.getAllStudent();
	}
	
	@PutMapping("/")
	public Student updateStudent(@RequestBody Student std) {
		return stdSer.saveStudent(std);
	}
	
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable int id) {
		stdSer.deleteStudent(id);
		return "Student Deleted";
	}

}
