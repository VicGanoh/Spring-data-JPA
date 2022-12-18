package com.vicgan.spring.data.jpa.model;

import jakarta.persistence.*;

@Embeddable
@AttributeOverrides({
        @AttributeOverride(
                name = "name",
                column = @Column(name = "department_name")
        )
})
public class Department {

    private String departmentName;

    public Department(){}

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
