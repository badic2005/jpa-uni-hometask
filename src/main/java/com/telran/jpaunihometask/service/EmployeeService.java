package com.telran.jpaunihometask.service;

import com.telran.jpaunihometask.dto.EmployeeRequest;

import java.util.List;

public interface EmployeeService {
    Boolean addEmployee(EmployeeRequest employeeRequest);

    List<String> getEmployees(Long companyId);
}
