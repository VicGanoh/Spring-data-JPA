package com.vicgan.spring.data.jpa.respository;

import com.vicgan.spring.data.jpa.model.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    public List<Employee> findByFirstNameIgnoreCase(String firstName);

    public List<Employee> findByLastNameIgnoreCase(String lastName);

    @Query("SELECT e FROM Employee e WHERE e.department = ?1")
    public List<Employee> findByDepartmentName(String departmentName);

    // JPQL
    @Query("SELECT e FROM Employee e WHERE e.jobPosition = :jobPosition")
    public List<Employee> getByJobPosition(@Param("jobPosition") String jobPosition);

    @Modifying
    @Transactional
    @Query(
            value = "UPDATE employee_db SET first_name = ?1 WHERE email_address = ?2",
            nativeQuery = true
    )
    int updateEmployeeNameByEmail(String firstName, String email);


}
