package com.telran.jpaunihometask.service;

import com.telran.jpaunihometask.dto.EmployeeRequest;
import com.telran.jpaunihometask.model.Company;
import com.telran.jpaunihometask.model.Employee;
import com.telran.jpaunihometask.repository.CompanyRepository;
import com.telran.jpaunihometask.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements  EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public Boolean addEmployee(EmployeeRequest employeeRequest) {

        Company company = companyRepository.getOne(employeeRequest.getCompanyId());

        if(company == null) {
            return false;
        }

        Employee employee = Employee.builder()
                .firstName(employeeRequest.getFirstName())
                .lastName(employeeRequest.getLastName())
                .company(company)
                .build();

        Employee employeeNew = employeeRepository.save(employee);

        if(employeeNew == null) {
            return false;
        }

        return true;
    }

    @Override
    public List<String> getEmployees(Long companyId) {
        List<Employee> employeeList = employeeRepository.getEmployees(companyId);

        return employeeList.stream()
                .map(e->e.getFirstName()+" "+e.getLastName())
                .collect(Collectors.toList());
    }
}
