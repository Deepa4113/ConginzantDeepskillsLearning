package com.cognizant.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.hibernate.Employee;

/**
 * Hands-on 4: Spring Data JPA equivalent of HibernateEmployeeDao.
 * No SessionFactory, no manual Transaction handling - just extend JpaRepository.
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
