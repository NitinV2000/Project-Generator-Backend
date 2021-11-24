package com.example.projectGenerator.Service;

import java.util.List;

import com.example.projectGenerator.entity.Project;

public interface ProjectService {

	public Project saveProject(Project project);

	public List<Project> getProjectList();

	public Project updateProject(String title, Project project);

}
