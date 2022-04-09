package com.employee.crud.controller;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.employee.crud.dto.Employee;

@Controller
public class EmployeeController {

	@GetMapping("/showEmployees")
	public String showEmployeeList(Model model) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee(1, "Abhilash", "abhi@gmail.com"));
		employees.add(new Employee(2, "Prashant", "prashant@gmail.com"));
		employees.add(new Employee(3, "Soumik", "soumik@gmail.com"));
		employees.add(new Employee(4, "Ravi", "ravi@gmail.com"));
		employees.add(new Employee(5, "Wily", "willy@gmail.com"));

		model.addAttribute("employees", employees);
		return "employee-list";
	}
}
