package com.technophileFirdous.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.technophileFirdous.demo.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
