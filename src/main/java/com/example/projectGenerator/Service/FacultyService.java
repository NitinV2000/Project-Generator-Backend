package com.example.projectGenerator.Service;

import java.util.List;

import com.example.projectGenerator.entity.Faculty;

public interface FacultyService {

	public Faculty saveFaculty(Faculty faculty);

	public List<Faculty> getFacultyList();

}
