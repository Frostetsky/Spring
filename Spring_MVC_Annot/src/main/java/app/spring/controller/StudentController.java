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
    public String findAll(@RequestParam(value = "page", required = false) Integer page, Model model) {

        model.addAttribute("students", studentService.findAll());
        return "all-students";
    }

    @GetMapping("/findById")
    public String findById(@RequestParam(value = "id") Integer id,
                           @RequestParam(value = "surname") String surname,
                           Model model) {
        model.addAttribute("name", studentService.findName(id, surname));
      //  Student student = studentService.findById(id).get();

      //  model.addAttribute("student", student);

        return "student-one";
    }

    /*@GetMapping("/findByName")
    public String findByName(@RequestParam("name") String name, Model model) {

        model.addAttribute("studentsbyname", studentService.findByName(name));

        return "student-name";
    }*/
}
