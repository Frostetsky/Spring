package spring_rest_api.dao;

import spring_rest_api.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();
}
