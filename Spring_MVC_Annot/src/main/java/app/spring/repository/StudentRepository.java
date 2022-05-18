package app.spring.repository;

import app.spring.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

   /* @Query(value = "from Student s where s.name = :name")
    public List<Student> findByName(@Param("name") String name);
   */

   /* public List<Student> findByName(String name);*/

}
