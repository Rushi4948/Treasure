package com.crudapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudapplication.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
