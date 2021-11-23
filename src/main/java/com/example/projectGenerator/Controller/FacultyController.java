package com.example.projectGenerator.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.projectGenerator.Service.FacultyService;
import com.example.projectGenerator.entity.Faculty;

@RestController
public class FacultyController {
	
	@Autowired
	private FacultyService facultyService;
	
	@PostMapping("/register-faculty")
	public Faculty saveFaculty(@RequestBody Faculty faculty) {
		return facultyService.saveFaculty(faculty);
	}
	
	@GetMapping("/register-faculty")
	public List<Faculty> getFacultyList(){
		return facultyService.getFacultyList();
	}
}
