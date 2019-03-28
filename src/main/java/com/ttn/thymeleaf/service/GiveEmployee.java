package com.ttn.thymeleaf.service;

import com.ttn.thymeleaf.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GiveEmployee {
    public List<Employee> getEmpList(){
        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee("Vineet","IT","Male",30000));
        employees.add(new Employee("Shivam","IT","Male",30000));
        employees.add(new Employee("DHANENDRA","IT","Male",66000));
        employees.add(new Employee("Rishabh","IT","Male",30000));
        employees.add(new Employee("Anuj","IT","Male",10000));
        return employees;
    }
}
