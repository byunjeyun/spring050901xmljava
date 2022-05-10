package com.uragil.spring050901;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public Student student1() {
		
		
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("수영");
		hobbys.add("승마");
		hobbys.add("육상");
		
		Student student = new Student("강감찬", 30, hobbys);
		
		student.setHeight(178);
		student.setWeight(88);
		
		return student;
	}
	
	@Bean
	public Student student2() {
		
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("요리");
		hobbys.add("낚시");
		hobbys.add("도박");
		
		Student student = new Student("고니", 32, hobbys);
		
		student.setHeight(170);
		student.setWeight(68);
		
		return student;
		
	}
	
	
}
