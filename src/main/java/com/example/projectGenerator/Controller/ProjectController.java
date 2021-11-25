package com.example.projectGenerator.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.projectGenerator.Service.FacultyService;
import com.example.projectGenerator.Service.ProjectService;
import com.example.projectGenerator.Service.StudentService;
import com.example.projectGenerator.entity.Faculty;
import com.example.projectGenerator.entity.Project;
import com.example.projectGenerator.entity.Student;

@RestController
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private FacultyService facultyService;
	
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
	
	//Assigning student to the Project
	@PutMapping("/project/{title}/{uid}")
	public Project enrollStudentToProject(@PathVariable("title") String title,@PathVariable("uid") String uid) {
		Student s = studentService.getStudent(uid);
		Project p = projectService.getProject(title);
		p.assignStudent(s);
		return projectService.saveProject(p);
	}
	
	//Get according to student uid -> p.student.uid
	@GetMapping("/project/{uid}")
	public List<Project> getProjectsOfStudent(@PathVariable("uid") String uid){
		return projectService.getProjectsOfStudent(uid);
	}
	
	//Assigning faculty to the Project
		@PutMapping("/project/faculty/{title}/{uid}")
		public Project enrollFacultyToProject(@PathVariable("title") String title,@PathVariable("uid") String uid) {
			Faculty f = facultyService.getFaculty(uid);
			Project p = projectService.getProject(title);
			p.assignFaculty(f);
			return projectService.saveProject(p);
		}
		
		//Get according to faculty uid -> p.fac.uid
		@GetMapping("/project/faculty/{uid}")
		public List<Project> getProjectsOfFaculty(@PathVariable("uid") String uid){
			return projectService.getProjectsOfFaculty(uid);
		}
		
		@GetMapping("/project/view/{regno}")
		public List<Project> getProjectsOfRegno(@PathVariable("regno") String regno){
			return projectService.getProjectsOfRegno(regno);
		}
}
