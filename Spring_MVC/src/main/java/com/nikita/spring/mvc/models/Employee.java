package com.nikita.spring.mvc.models;

import javax.validation.constraints.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, message = "Incorrect name")
    private String name;

    @NotBlank(message = "Surname is important field")
    private String surname;

    @Min(value = 10000, message = "salary must be greater than 9999")
    @Max(value = 100000, message = "salary must be less than 100001")
    private Integer salary;

    private String department;

    Map<String, String> departments;

    private String carBrand;

    Map<String, String> carBrands;

    private String[] languages;

    private Map<String, String> languagesList;

    @Pattern(regexp = "\\d-\\d{3}-\\d{3}-\\d{2}-\\d{2}", message = "please use pattern X-XXX-XXX-XX-XX")
    private String number;

    public Employee() {
        departments = new LinkedHashMap<>();
        carBrands = new LinkedHashMap<>();
        languagesList = new LinkedHashMap<>();
        departments.put("Information Technology", "IT");
        departments.put("Human Resources", "HR");
        carBrands.put("BMW", "BMW");
        carBrands.put("Audi", "Audi");
        languagesList.put("English", "EN");
        languagesList.put("French", "FR");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguagesList() {
        return languagesList;
    }

    public void setLanguagesList(Map<String, String> languagesList) {
        this.languagesList = languagesList;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
