package app.spring.repository;

import app.spring.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class StudentRepository  {

    private final SessionFactory sessionFactory;

    @Autowired
    public StudentRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Student> findAll() {
        List<Student> students;
        try (Session session = sessionFactory.openSession()) {
            session.getTransaction().begin();
            students = session.createQuery("from Student", Student.class).getResultList();
        }
        return students;
    }
}
