package com.capgemini.serialization.fileHandler;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.capgemini.serialization.entity.Project;
import com.capgemini.serialization.entity.Student;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class fileHandler {
	private static final String PATH = "src/main/resources/Student.json";
	private static final File FILE = new File(PATH);
	private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
	
	public static void createTheFile() throws IOException {
		if(FILE.createNewFile()) {
			System.out.println("JSON File is created");
		}else {
			System.out.println("JSON File is already exits");
		}
		
	}
// Student serialization	n deserialization
//	public static void serialization() throws StreamWriteException, DatabindException, IOException {
//		Student student = new Student(1, "raja", "raja@gmail.com", 67982368L);
//		OBJECT_MAPPER.writeValue(FILE,student);
//		System.out.println("Serialization Done Successfully");
//	}
//	public static void deserialization() throws IOException {
//
//	    
//	    Student student = OBJECT_MAPPER.readValue(FILE, Student.class);
//
//	    System.out.println("Deserialization Done Successfully ");
//
//	    
//	    System.out.println("ID: " + student.getId());
//	    System.out.println("Name: " + student.getName());
//	    System.out.println("Email: " + student.getMailId());
//	    System.out.println("Contact: " + student.getContactNumber());
//	}

// Many to Many
//	public static void serialization(List<Student> student) throws StreamWriteException, DatabindException, IOException {
//		OBJECT_MAPPER.writeValue(FILE,student);
//		System.out.println("Serialization Done Successfully");
//	}

//Many to Many
//	public static void deserialization() throws StreamReadException, DatabindException, IOException {
//		Student[] students = OBJECT_MAPPER.readValue(FILE, Student[].class);
//		for(Student student : students) {
//			System.out.println(student);
//			List<Project> projects = student.getProject();
//			for(Project project : projects) {
//				System.out.println(project);
//			}
//		}
//		
//		System.out.println("Serialization Done Successfully");
//	}
	
	
//One to Many serializaion and deserialization
	public static void serialization(Student student) throws StreamWriteException, DatabindException, IOException {
		OBJECT_MAPPER.writeValue(FILE,student);
		System.out.println("Serialization Done Successfully");
	}
	
	public static void deserialization() throws StreamReadException, DatabindException, IOException {
		Student student = OBJECT_MAPPER.readValue(FILE, Student.class);
	    
	    System.out.println(student);

	    
	    System.out.println("Projects:");
	    for (Project p : student.getProject()) {
	        System.out.println(p);
	    }
		
		System.out.println("Deserialization Done Successfully ");
	}
	
	public static void deleteTheFile() throws IOException {
		if(FILE.delete()) {
			System.out.println("JSON File is deleted successfully");
		}else {
			System.out.println("JSON File Doesn't exits");
		}
		
	}
	
}