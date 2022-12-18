package com.vicgan.spring.data.jpa.controller;

import com.vicgan.spring.data.jpa.model.Employee;
import com.vicgan.spring.data.jpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable("id") Long id){
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("/first_name/{name}")
    public List<Employee> getEmployeeByFirstName(@PathVariable("name") String firstName){
        return employeeService.getEmployeeByFirstName(firstName);
    }

    @GetMapping("/last_name/{name}")
    public List<Employee> getEmployeeByLastName(@PathVariable("name") String lastName){
        return employeeService.getEmployeeByLastName(lastName);
    }

    @GetMapping("/job_position/{jobPosition}")
    public List<Employee> getEmployeesByJobPosition(@PathVariable("jobPosition") String jobPosition){
        return employeeService.getEmployeesByJobPosition(jobPosition);
    }

//    @GetMapping("/department")
//    public List<Employee> getEmployeeByDepartmentName(@RequestParam("departmentName") String departmentName){
//        return employeeService.getEmployeeByDepartmentName(departmentName);
//    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@RequestBody Employee employee, @PathVariable("id") Long id){
        return employeeService.updateEmployee(employee, id);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployeeById(@PathVariable("id") Long employeeId){
        employeeService.deleteEmployeeById(employeeId);
    }
}
