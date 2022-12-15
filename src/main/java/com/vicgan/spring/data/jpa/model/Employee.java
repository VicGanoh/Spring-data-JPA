package com.vicgan.spring.data.jpa.model;

import jakarta.persistence.*;

@Entity
@Table(
        name = "Employee_db",
        uniqueConstraints = @UniqueConstraint(
                name = "unique_email",
                columnNames = "email_address"
        )
)
public class Employee {

    @Id
    @SequenceGenerator(name = "employee_seq", sequenceName = "employee_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_seq")
    @Column(name = "id")
    private Long id;
    private String firstName;
    private String lastName;
    private String jobPosition;

    public Employee(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Employee(String firstName, String lastName, String jobPosition, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobPosition = jobPosition;
        this.email = email;
    }

    @Column(name = "email_address")
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

