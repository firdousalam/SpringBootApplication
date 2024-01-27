package com.technophileFirdous.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employee_id;
    @Column
    private String emp_name;
    @Column
    private int emp_age;
    @Column
    private String emp_city;

    public Long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Long employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public int getEmp_age() {
        return emp_age;
    }

    public void setEmp_age(int emp_age) {
        this.emp_age = emp_age;
    }

    public String getEmp_city() {
        return emp_city;
    }

    public void setEmp_city(String emp_city) {
        this.emp_city = emp_city;
    }

    @Override
    public String toString() {
        return "Employee [employee_id=" + employee_id + ", emp_name=" + emp_name + ", emp_age=" + emp_age
                + ", emp_city=" + emp_city + "]";
    }

    public Employee(Long employee_id, String emp_name, int emp_age, String emp_city) {
        this.employee_id = employee_id;
        this.emp_name = emp_name;
        this.emp_age = emp_age;
        this.emp_city = emp_city;
    }

    public Employee() {

    }

}
