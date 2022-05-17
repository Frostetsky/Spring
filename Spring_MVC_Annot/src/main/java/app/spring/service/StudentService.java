package app.spring.service;

import app.spring.model.Student;
import app.spring.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public void saveOrUpdate(Student student) {
        studentRepository.saveStudent(student);
    }

    public void deleteStudent(Integer id) {
        studentRepository.delete(id);
    }

    public Student getStudent(Integer id) {
        return studentRepository.getStudent(id);
    }
}
