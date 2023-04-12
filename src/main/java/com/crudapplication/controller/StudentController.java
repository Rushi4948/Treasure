package com.crudapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crudapplication.model.Student;
import com.crudapplication.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService ssr;
	
	//Save Operation
	@PostMapping("/saveStudent")
	public Student saveStudent(@RequestBody Student student)
	{
		return ssr.saveStudent(student);
	}
	
	//Read Operation
	@GetMapping("/fetchStudent")
	public List<Student> fetchStudent()
	{
		return ssr.fetchStudentList();
	}
	
	//UpdateOperation
	@PutMapping("/updateStudent/{rollno}")
	public Student updateStudent(@RequestBody Student student, @PathVariable("rollno") Integer rollno)
	{
		return ssr.updateStudent(student, rollno);
	}
	
	
	//DeleteOperation
	@DeleteMapping("/deleteStudent/{rollno}")
	public String deleteStudent(@PathVariable("rollno") Integer rollno)
	{
		ssr.deleteStudentByRollNo(rollno);
		return "Data Deleted Successfully...!!!";
	}
}
