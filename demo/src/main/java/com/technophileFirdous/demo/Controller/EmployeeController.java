package com.technophileFirdous.demo.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.technophileFirdous.demo.Model.Employee;
import com.technophileFirdous.demo.Repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;

    @PostMapping("/employee")
    public String createNewEmployee(@RequestBody Employee entity) {
        // TODO: process POST request
        employeeRepository.save(entity);
        return "Data Saved Successfully";
    }

    @GetMapping("/employee")
    public ResponseEntity<List<Employee>> getAllEmployee() {
        // TODO: process GET request
        List<Employee> empList = new ArrayList<>();
        employeeRepository.findAll().forEach(empList::add);
        return new ResponseEntity<List<Employee>>(empList, HttpStatus.OK);
    }

    @GetMapping("/getEmployee/{empId}")
    public ResponseEntity<Employee> getMethodName(@PathVariable Long empId) {
        // Optional
        Optional<Employee> employeeDetails = employeeRepository.findById(empId);
        if (employeeDetails.isPresent()) {
            return new ResponseEntity<Employee>(employeeDetails.get(), HttpStatus.FOUND);
        } else {
            return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
        }

    }

    @PutMapping("updateEmployee/{id}")
    public String updateEmployee(@PathVariable Long id, @RequestBody Employee entity) {
        // TODO: process PUT request

        Optional<Employee> emp = employeeRepository.findById(id);
        if (emp.isPresent()) {
            Employee updatedEmp = new Employee();
            updatedEmp.setEmp_age(entity.getEmp_age());
            updatedEmp.setEmp_city(entity.getEmp_city());
            updatedEmp.setEmp_name(entity.getEmp_name());
            updatedEmp.setEmployee_id(id);
            employeeRepository.save(updatedEmp);
            return "Employee Updated Successfully";
        } else {
            return "Please enter valid employee details";
        }

    }

    @DeleteMapping("employeeToDelete/{empId}")
    public String deleteEmployee(@PathVariable Long id) {

        Optional<Employee> emp = employeeRepository.findById(id);
        if (emp.isPresent()) {
            Employee updatedEmp = new Employee();

            updatedEmp.setEmployee_id(id);
            employeeRepository.delete(updatedEmp);
            return "Employee Updated Successfully";
        } else {
            return "Please enter valid employee details";
        }
    }

}
