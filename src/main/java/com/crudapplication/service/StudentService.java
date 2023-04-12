package com.crudapplication.service;

import java.util.List;

import com.crudapplication.model.Student;

public interface StudentService {

	public Student saveStudent(Student student);

	public List<Student> fetchStudentList();

	public Student updateStudent(Student student, Integer rollno);

	public void deleteStudentByRollNo(Integer rollno);

}
