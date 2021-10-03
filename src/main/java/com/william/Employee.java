package com.william;

import lombok.Data;

@Data
public class Employee {
	private String name;
	private String employeeId;
	private String country;

	public Employee() {
	}
	
	public Employee(String _employeeId, String _name,
					String _country) {
		employeeId = _employeeId;
		name	   = _name;
		country	   = _country;
	}
}
