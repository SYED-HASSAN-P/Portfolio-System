
  package com.springbootCRUDex.service;
  
  import java.util.List;

import org.springframework.stereotype.Service;
  
  import com.springbootCRUDex.model.Employee;
  
  
  @Service
  public interface EmployeeService {
  
  public Employee createEmp(Employee emp);
  public List<Employee> getEmployee();
  public Employee getEmployee(int id);
  public Employee updateEmp(Employee emp, int id);
  public void deleteEmp(int id);
  
  }
 
