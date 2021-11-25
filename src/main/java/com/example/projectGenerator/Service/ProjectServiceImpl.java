package com.example.projectGenerator.Service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projectGenerator.Repository.ProjectRepository;
import com.example.projectGenerator.entity.Project;

@Service
public class ProjectServiceImpl implements ProjectService{
	
	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public Project saveProject(Project project) {
		return projectRepository.save(project);
	}

	@Override
	public List<Project> getProjectList() {
		return projectRepository.findAll();
	}

	@Override
	public Project updateProject(String title, Project project) {
		Project p = projectRepository.findById(title).get();
		if(Objects.nonNull(project.getStartDate()) && !"".equalsIgnoreCase(project.getStartDate())) {
			p.setStartDate(project.getStartDate());
		}
		if(Objects.nonNull(project.getEndDate()) && !"".equalsIgnoreCase(project.getEndDate())) {
			p.setEndDate(project.getEndDate());
		}
		if(Objects.nonNull(project.getLink()) && !"".equalsIgnoreCase(project.getLink())) {
			p.setLink(project.getLink());
		}
		if(Objects.nonNull(project.getAuthor()) && !"".equalsIgnoreCase(project.getAuthor())) {
			p.setAuthor(project.getAuthor());
		}
		if(Objects.nonNull(project.getFaculty()) && !"".equalsIgnoreCase(project.getFaculty())) {
			p.setFaculty(project.getFaculty());
		}
		if(Objects.nonNull(project.getFacultyId()) && !"".equalsIgnoreCase(project.getFacultyId())) {
			p.setFacultyId(project.getFacultyId());
		}
		if(Objects.nonNull(project.getCourseCode()) && !"".equalsIgnoreCase(project.getCourseCode())) {
			p.setCourseCode(project.getCourseCode());
		}
		if(Objects.nonNull(project.getCourseCode()) && !"".equalsIgnoreCase(project.getCourseCode())) {
			p.setCourseCode(project.getCourseCode());
		}
		if(Objects.nonNull(project.getCourseName()) && !"".equalsIgnoreCase(project.getCourseName())) {
			p.setCourseName(project.getCourseName());
		}
		if(Objects.nonNull(project.getDuration()) && !"".equalsIgnoreCase(project.getDuration())) {
			p.setDuration(project.getDuration());
		}
		if(Objects.nonNull(project.getDescription()) && !"".equalsIgnoreCase(project.getDescription())) {
			p.setDescription(project.getDescription());
		}
		return projectRepository.save(p);
	}

	@Override
	public Project getProject(String title) {
		return projectRepository.findById(title).get();
	}

	@Override
	public List<Project> getProjectsOfStudent(String uid) {
		return projectRepository.findByStudent_Uid(uid);
	}

	@Override
	public List<Project> getProjectsOfFaculty(String uid) {
		return projectRepository.findByFac_Uid(uid);
	}

	@Override
	public List<Project> getProjectsOfRegno(String regno) {
		return projectRepository.findByRegno(regno);
	}

}
