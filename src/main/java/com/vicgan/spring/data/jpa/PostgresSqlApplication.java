package com.vicgan.spring.data.jpa;

import com.vicgan.spring.data.jpa.model.Department;
import com.vicgan.spring.data.jpa.model.Employee;
import com.vicgan.spring.data.jpa.respository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PostgresSqlApplication {

//	private Logger log = LoggerFactory.getLogger(PostgresSqlApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PostgresSqlApplication.class, args);
	}

//	@Bean
//	CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository){
//		return args -> {
//			log.info("Adding new employee to database...");
//			log.info("-----------------------------------");
//
//			log.info("Saving employee to database...");
//			log.info("----------------------------");
//			employeeRepository.save(new Employee(
//					"Victor",
//					"Ganoh",
//					"Backend Engineer",
//					"vic@mail.com",
//					new Department("IT department")
//			));
//
//			log.info("Outputting employee by job position");
//			employeeRepository.getByJobPosition("Backend Engineer").forEach(position -> {
//			log.info(position.toString());
//		});
//
//		};
//}
}
