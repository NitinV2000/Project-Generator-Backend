package com.example.projectGenerator.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

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
	private String faculty;
	private String facultyId;
	private String courseCode;
	private String courseName;
	private String duration;
	private String description;
}
