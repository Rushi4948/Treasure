package com.crudapplication.serviceImpl;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudapplication.model.Student;
import com.crudapplication.repository.StudentRepository;
import com.crudapplication.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentRepository sr;

	//save operation
	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return sr.save(student);
	}

	//Read operation
	@Override
	public List<Student> fetchStudentList() {
		return sr.findAll();
	}

	//Update Operation
	@Override
	public Student updateStudent(Student student, Integer rollno) {
		Student stud = sr.findById(rollno).get();
		if(rollno == stud.getRollno())
		{
			stud.setName(student.getName());
			stud.setAddress(student.getAddress());
			stud.setMarks(student.getMarks());
			stud.setMobileno(student.getMobileno());
		}
		return sr.save(stud);
	}

	//Delete Operation
	@Override
	public void deleteStudentByRollNo(Integer rollno) {
		sr.deleteById(rollno);
	}
}
