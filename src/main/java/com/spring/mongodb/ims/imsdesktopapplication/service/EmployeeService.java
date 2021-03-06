package com.spring.mongodb.ims.imsdesktopapplication.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.mongodb.ims.imsdesktopapplication.exceptions.InvalidInputException;
import com.spring.mongodb.ims.imsdesktopapplication.model.Employee;
import com.spring.mongodb.ims.imsdesktopapplication.shared.dto.EmployeeDTO;

@Service
public interface EmployeeService {

	void createEmployee(EmployeeDTO employeeDTO) throws InvalidInputException;
	
	void updateEmployee(String id, EmployeeDTO employeeDTO) throws InvalidInputException;
	
	void deleteEmployee(String employeeId);

	Employee getEmployeeByUserName(String userName, String password);
	
	Employee getEmployeeByEmail(String email, String password);
	
	List<EmployeeDTO> getEmployees();
	
	List<EmployeeDTO> getEmployees(int page, int limit);
	
	List<EmployeeDTO> getManagers();
	

}
