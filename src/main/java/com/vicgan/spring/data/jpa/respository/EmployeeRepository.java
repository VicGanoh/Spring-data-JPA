package com.vicgan.spring.data.jpa.respository;

import com.vicgan.spring.data.jpa.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
