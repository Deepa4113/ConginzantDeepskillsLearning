package com.cognizant.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.hibernate.Employee;

/**
 * Hands-on 4: Spring Data JPA equivalent of HibernateEmployeeDao.addEmployee().
 * Spring manages the session and transaction for us via @Transactional.
 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
}
