package com.example.projectGenerator.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectGenerator.entity.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty, String>{

}
