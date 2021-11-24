package com.example.projectGenerator.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
	
	@Id
	private String uid;
	@NotBlank(message = "Add Student Name")
	private String name;
	private String email;
	private String password;
	
	@JsonIgnore
	@OneToMany(
			mappedBy = "student"
			)
	private Set<Project> projects = new HashSet<>();
}
