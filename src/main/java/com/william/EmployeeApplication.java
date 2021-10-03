package com.william;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
		//Employee employee = new Employee("William", "1", "Scotland");
		Employee employee = new Employee();
		employee.setEmployeeId("1");
		employee.setName("William");
		employee.setCountry("India");
		//mod just to test git to remote
		System.out.println(employee.toString());
	}

}
