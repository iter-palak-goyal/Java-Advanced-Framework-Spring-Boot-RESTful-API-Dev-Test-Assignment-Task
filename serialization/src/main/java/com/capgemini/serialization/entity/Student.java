package com.capgemini.serialization.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student implements Serializable{
	private Integer id;
	private String name;
	private String email;
	private Long contactNo;
	private List<Project> project;
	
	
}