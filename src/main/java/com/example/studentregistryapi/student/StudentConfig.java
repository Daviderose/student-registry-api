package com.example.studentregistryapi.student;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
		
		return args -> {
			
			Student mariam = new Student(
					"Mariam", 
					"mariam.jamal@gmail.com", 
					LocalDate.of(2000, 1, 5)
					);
			
			studentRepository.save(mariam);		
		};
	}
}
