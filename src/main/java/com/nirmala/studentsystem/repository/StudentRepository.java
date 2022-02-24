package com.nirmala.studentsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nirmala.studentsystem.bean.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
