package com.example.projectGenerator.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projectGenerator.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String>{

}
