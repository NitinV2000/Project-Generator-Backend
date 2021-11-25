package com.example.projectGenerator.Service;

import java.util.List;

import com.example.projectGenerator.entity.Project;

public interface ProjectService {

	public Project saveProject(Project project);

	public List<Project> getProjectList();

	public Project updateProject(String title, Project project);

	public Project getProject(String title);

	public List<Project> getProjectsOfStudent(String uid);

	public List<Project> getProjectsOfFaculty(String uid);

	public List<Project> getProjectsOfRegno(String regno);

}
