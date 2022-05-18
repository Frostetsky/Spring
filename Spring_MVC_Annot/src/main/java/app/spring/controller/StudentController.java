package app.spring.controller;

import app.spring.model.Student;
import app.spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;


@Controller
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/findStudents")
    public String findAll(@RequestParam("page") Integer page, Model model) {
        PageRequest pageRequest = PageRequest.of(page, 2);
        List<Student> students = studentService
                .findAll(pageRequest)
                .get()
                .collect(Collectors.toList());
        model.addAttribute("students", students);
        return "all-students";
    }

    @GetMapping("/findById")
    public String findById(@RequestParam("id") Integer id, Model model) {
        Student student = studentService.findById(id).get();


        model.addAttribute("student", student);

        return "student-one";
    }

    /*@GetMapping("/findByName")
    public String findByName(@RequestParam("name") String name, Model model) {

        model.addAttribute("studentsbyname", studentService.findByName(name));

        return "student-name";
    }*/
}
