package spring_rest_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring_rest_api.entity.Employee;
import spring_rest_api.exception_handling.EmployeeIncorrectData;
import spring_rest_api.exception_handling.NoSuchEmployeeException;
import spring_rest_api.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> findAll() {
        List<Employee> result = employeeService.getAllEmployees();
        return result;
    }

    @GetMapping("/employees/{id}")
    public Employee findByID(@PathVariable Integer id) {
        Employee result = employeeService.findByID(id);
        if (result == null) {
            throw new NoSuchEmployeeException("There is no employee with id = " + id + " in DataBase");
        } else {
            return result;
        }
    }

    @PostMapping("/employees")
    public Employee add(@RequestBody Employee employee) {
        employeeService.add(employee);
        return employee;
    }

    @PutMapping("/employees")
    public Employee update(@RequestBody Employee employee) {
        employeeService.add(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteByID(@PathVariable Integer id) {
        Employee employee = employeeService.findByID(id);
        if (employee == null) {
            throw new NoSuchEmployeeException("There is no employee with ID = " + id + " in DataBase");
        } else {
            employeeService.deleteByID(id);
            return "Employee with ID = " + id + " was deleted.";
        }
    }
}
