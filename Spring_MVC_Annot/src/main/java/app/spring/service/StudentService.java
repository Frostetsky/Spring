package app.spring.service;

import app.spring.model.Student;
import app.spring.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(@Qualifier("JDBC") StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

   /*// public Optional<Student> findById(Integer id) {
        return studentRepository.findById(id);
    }*/

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public String findName(Integer id, String surname) {
        return studentRepository.findName(id, surname);
    }
}
