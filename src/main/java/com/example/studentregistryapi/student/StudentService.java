package com.example.studentregistryapi.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	public List<Student> getStudents() {
		return Stream.of(
				new Student(1L, "Mariam", "mariam.jamal@gmail.com", LocalDate.of(2000,  Month.JANUARY, 5 ), 21)
				
				)
				.collect(Collectors.toList());
	}

}
