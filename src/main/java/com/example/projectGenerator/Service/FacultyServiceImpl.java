package com.example.projectGenerator.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projectGenerator.Repository.FacultyRepository;
import com.example.projectGenerator.entity.Faculty;

@Service
public class FacultyServiceImpl implements FacultyService{

	@Autowired
	private FacultyRepository facultyRepository;
	
	@Override
	public Faculty saveFaculty(Faculty faculty) {
		return facultyRepository.save(faculty);
	}

	@Override
	public List<Faculty> getFacultyList() {
		// TODO Auto-generated method stub
		return facultyRepository.findAll();
	}

}
