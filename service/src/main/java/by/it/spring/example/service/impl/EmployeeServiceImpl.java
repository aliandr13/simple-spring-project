package by.it.spring.example.service.impl;

import by.it.spring.example.model.Employee;
import by.it.spring.example.repository.EmployeeRepository;
import by.it.spring.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    @Transactional(readOnly = true, timeout = 1)
    public Optional<Employee> find(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    @Transactional(readOnly = true, timeout = 5)
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }
}
