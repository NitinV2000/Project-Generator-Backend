package com.example.projectGenerator.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projectGenerator.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, String>{

}
