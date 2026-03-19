package com.capgemini.serialization.execution;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.serialization.entity.Project;
import com.capgemini.serialization.entity.Student;
import com.capgemini.serialization.fileHandler.fileHandler;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;

public class JavaApp {
	public static void execution()  {
		
//		try {
//			FileHandler.serialization();
//			FileHandler.createTheFile();
//			FileHandler.deserialization();
//			FileHandler.deleteTheFile();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} 
		//Student Serialization only
		
	}
	
	public static void execution1() {
		//Many to many
		//Many student has many projects
		Project project1 = new Project(1, "EQ Model","AI  ML Based");
		Project project2 = new Project(2, "STM Model","AI Based");
		Project project3 = new Project(3, "Chat bot ","DL Based");
		
		List<Project> projects = new ArrayList<Project>();
		projects.add(project1);
		projects.add(project2);
		projects.add(project3);
		
		Student student1 = new Student(1, "raja", "raja@gail.com", 67982368L,projects);
		Student student2 = new Student(2, "rani", "rani@gail.com", 67982338L,projects);
		Student student3 = new Student(3, "raja", "raja@gail.com", 67982368L,projects);
		
		List<Student> students = new ArrayList<Student>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
//		try {
//			FileHandler.serialization(students);
//			FileHandler.createTheFile();
//			FileHandler.deserialization();
//			FileHandler.deleteTheFile();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} 	
	}
	
	public static void execution2() {
		//one to many
		Project project1 = new Project(1, "EQ Model","AI  ML Based");
		Project project2 = new Project(2, "STM Model","AI Based");
		Project project3 = new Project(3, "Chat bot ","DL Based");
		
		List<Project> projects = new ArrayList<Project>();
		projects.add(project1);
		projects.add(project2);
		projects.add(project3);
		
		Student student = new Student(1, "raja", "raja@gail.com", 67982368L,projects);
		
		
		try {
			fileHandler.createTheFile();
			fileHandler.serialization(student);
			fileHandler.deserialization();
			fileHandler.deleteTheFile();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		
		
	}
}