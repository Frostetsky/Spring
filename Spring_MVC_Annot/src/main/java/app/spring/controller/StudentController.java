package app.spring.controller;

import app.spring.model.Student;
import app.spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("/createStudent")
    public String createStudent(Model model) {
        model.addAttribute("student", new Student());
        return "student-info";
    }

    @PostMapping("/saveStudent")
    public String saveStudent(@ModelAttribute("student") Student student) {

        studentService.saveOrUpdate(student);

        return "redirect:/students/findStudents";
    }


    @GetMapping("/findStudents")
    public String findAll(Model model) {
        List<Student> students = studentService.findAll();
        model.addAttribute("students", students);
        return "all-students";
    }

    @RequestMapping("/updateStudent")
    public String updateStudent(@RequestParam("studentId") Integer id, Model model) {

        Student student = studentService.getStudent(id);
        model.addAttribute("student", student);

        return "student-info";
    }

    @RequestMapping("/deleteStudent")
    public String deleteStudent(@RequestParam("studentId") Integer id) {

        studentService.deleteStudent(id);

        return "redirect:/students/findStudents";
    }

}
