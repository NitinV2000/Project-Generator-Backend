package com.example.projectGenerator.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.projectGenerator.Service.ProjectService;
import com.example.projectGenerator.entity.Project;

@RestController
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	@PostMapping("/project/new")
	public Project saveProject(@RequestBody Project project) {
		return projectService.saveProject(project);
	}
	
	@GetMapping("/project/new")
	public List<Project> getProjectList(){
		return projectService.getProjectList();
	}
	
	@PutMapping("/project/new/{title}")
	public Project updateProject(@PathVariable("title") String title, @RequestBody Project project){
		return projectService.updateProject(title,project);
	}
}
