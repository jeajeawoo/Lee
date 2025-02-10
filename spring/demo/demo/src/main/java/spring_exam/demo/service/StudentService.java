package spring_exam.demo.service;

import spring_exam.demo.dto.StudentForm;
import spring_exam.demo.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> selectAllStudent();

    public Student insertStudent(StudentForm studentForm);

    public Student updateStudent(Long id, StudentForm studentForm);

    public Student deleteStudent(Long id);
}
