package com.example.projectGenerator.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.projectGenerator.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, String>{
	
//	@Query("select p from Project p where p.studentUid=?1")
	public List<Project> findByStudent_Uid(String uid);

	public List<Project> findByFac_Uid(String uid);

	public List<Project> findByRegno(String regno);

}
