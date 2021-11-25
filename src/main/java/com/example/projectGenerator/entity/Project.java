package com.example.projectGenerator.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Project {
	
	@Id
	private String title;
	private String startDate;
	private String endDate;
	private String link;
	private String author;
	private String regno;
	private String faculty;
	private String facultyId;
	private String courseCode;
	private String courseName;
	private String duration;
	private String description;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(
			name = "Suid",
			referencedColumnName = "uid"
			)
	private Student student;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(
			name = "Fuid",
			referencedColumnName = "uid"
			)
	private Faculty fac;
	
	public void assignFaculty(Faculty faculty) {
		this.fac = faculty;
	}
	
	public void assignStudent(Student student) {
		this.student = student;
	}
}
