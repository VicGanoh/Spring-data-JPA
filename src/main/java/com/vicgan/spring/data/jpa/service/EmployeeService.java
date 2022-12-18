package com.vicgan.spring.data.jpa.service;

import com.vicgan.spring.data.jpa.model.Employee;
import com.vicgan.spring.data.jpa.respository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees(){
        return new ArrayList<>(employeeRepository.findAll());
    }

    public Optional<Employee> getEmployeeById(Long employeeId){
        return employeeRepository.findById(employeeId);
    }

    public List<Employee> getEmployeeByFirstName(String firstName){
        return employeeRepository.findByFirstNameIgnoreCase(firstName);
    }

    public List<Employee> getEmployeeByLastName(String lastName){
        return employeeRepository.findByLastNameIgnoreCase(lastName);
    }

    public List<Employee> getEmployeesByJobPosition(String jobPosition){
        return new ArrayList<>(employeeRepository.getByJobPosition(jobPosition));
    }

//    public List<Employee> getEmployeeByDepartmentName(String departmentName){
//        return new ArrayList<>(employeeRepository.findByDepartmentName(departmentName));
//    }

    public Employee updateEmployee(Employee employee, Long id){
        return employeeRepository.save(employee);
    }

    public void deleteEmployeeById(Long employeeId){
        employeeRepository.deleteById(employeeId);
    }

}
