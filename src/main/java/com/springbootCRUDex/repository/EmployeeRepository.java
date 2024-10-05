package com.springbootCRUDex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootCRUDex.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
