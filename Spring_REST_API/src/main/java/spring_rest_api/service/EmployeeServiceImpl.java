package spring_rest_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring_rest_api.dao.EmployeeDAO;
import spring_rest_api.entity.Employee;
import spring_rest_api.exception_handling.NoSuchEmployeeException;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    public Employee findByID(Integer id) {
        return employeeDAO.findByID(id);
    }

    @Override
    public void add(Employee employee) {
        employeeDAO.add(employee);
    }
}
