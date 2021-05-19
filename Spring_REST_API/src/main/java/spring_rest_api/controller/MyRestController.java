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

    @ExceptionHandler
    public ResponseEntity<EmployeeIncorrectData> handleException(NoSuchEmployeeException ex) {
        EmployeeIncorrectData employeeIncorrectData = new EmployeeIncorrectData();
        employeeIncorrectData.setInfo(ex.getMessage());
        return new ResponseEntity<>(employeeIncorrectData, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<EmployeeIncorrectData> handleException(NumberFormatException ex) {
        EmployeeIncorrectData employeeIncorrectData = new EmployeeIncorrectData();
        employeeIncorrectData.setInfo(ex.getMessage());
        return new ResponseEntity<>(employeeIncorrectData, HttpStatus.BAD_REQUEST);
    }
}
