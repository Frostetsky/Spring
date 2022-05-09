package app.spring.controller;

import app.spring.model.Student;
import app.spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

// Server1 (core) - пишет логи
// Server2 (mvc) - хранит логи
// браузер пользователя

// Server1 (записывает в файл)
// Server1 -> Server2 (Server2 сохранил данные в БД)
// Browser -> Server2 (предоставляет данные через контроллер)


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


    @GetMapping("/findStudents")
    public String findAll(Model model) {
        List<Student> students = studentService.findAll();
        model.addAttribute("students", students);
        return "all-students";
    }

    @RequestMapping("/updateStudent")
    public String updateStudent() {
        return null;
    }

    @RequestMapping("/deleteStudent")
    public String deleteStudent() {
        return "redirect:/students/findStudents";
    }

}
