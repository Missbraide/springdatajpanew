package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PracticeEllaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeEllaApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(EmployeeRepository repository){
		return (args ->{
			insertJavaAdvocates(repository);
			System.out.println(repository.findAll());

		});
	}

	private void insertJavaAdvocates(EmployeeRepository repository){
		repository.save(new Employee("Ella", "Braide"));
		repository.save(new Employee("Lola", "Oredola"));
		repository.save(new Employee("Arit", "Jack"));
		repository.save(new Employee("Ayo", "Rex"));

	}
}
