package com.gangboot.demo;


import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.gangboot.demo.entity.Student;



@SpringBootApplication
@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = { DemoApplicationTests.class },webEnvironment = WebEnvironment.RANDOM_PORT)
public class DemoApplicationTests {
	
	@Autowired
	private TestRestTemplate testRestTemplate;

	@Test
	public void myFirstTesting() {
		System.out.println("*****myFirstTesting.... ");
		int a = 1, b = 1;
		//assertEquals(a, b);
		assertEquals(a, b, "Should be equal.");
	}
	
	@Test
	void otherTest() {
		assumeTrue(true);
		System.out.println("Running another test...");
		assertNotEquals(1, 2, "Why wouldn't these be the same?");
	}
	
	@Test
	void controllerTest() {
		String message = this.testRestTemplate.getForObject("/about", String.class);
		assertEquals("JUnit 5 and Spring Boot Example.", message);
	}
	
	@Test
	void studentsTest() {
		List<Student> students = this.testRestTemplate.getForObject("/students", List.class);
		System.out.println("Students:"+students);
		assertEquals(7, students.size());
	}
	
	@Test
	@DisplayName("Testing Student Pandiyar")
	void studentTest() {
		Student student = this.testRestTemplate.getForObject("/students/3", Student.class);
		System.out.println("Student:"+student.getName());
		assertEquals("Pandiyar", student.getName());
	}
	

}
