package spring_exam.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring_exam.demo.entity.Student;

import java.util.ArrayList;

public interface StudentRepository extends JpaRepository<Student,Long> {
    @Override
    ArrayList<Student> findAll();
}
