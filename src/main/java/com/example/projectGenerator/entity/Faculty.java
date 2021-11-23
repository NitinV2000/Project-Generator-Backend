package com.example.projectGenerator.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Faculty {
	
	@Id
	private String uid;
	@NotBlank(message = "Add Faculty Name")
	private String name;
	private String email;
	private String password;
}
