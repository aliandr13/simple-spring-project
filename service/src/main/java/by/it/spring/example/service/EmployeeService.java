package by.it.spring.example.service;

import by.it.spring.example.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    Optional<Employee> find(Long id);

    List<Employee> findAll();

}
