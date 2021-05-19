package spring_rest_api.service;

import spring_rest_api.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public Employee findByID(Integer id);
}
