package spring_exam.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring_exam.demo.dto.StudentForm;
import spring_exam.demo.entity.Student;
import spring_exam.demo.repository.StudentRepository;

import java.util.List;

@Slf4j
@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> selectAllStudent() {
        List<Student> studentList = studentRepository.findAll();
        return studentList;
    }

    @Override
    public Student insertStudent(StudentForm studentForm) {
        Student student = studentForm.toEntity();
        Student saved = studentRepository.save(student);
        return saved;
    }

    @Override
    public Student updateStudent(Long id, StudentForm studentForm) {
        Student student = studentForm.toEntity();
        Student studentcheck = studentRepository.findById(id).orElse(null);
        if (studentcheck == null){
            log.info("잘못된 아이디"+id);
            return null;
        }
        studentcheck.patchCheck(student);
        Student updatestudent = studentRepository.save(studentcheck);
        return updatestudent;
    }

    @Override
    public Student deleteStudent(Long id) {
        Student studentcheck = studentRepository.findById(id).orElse(null);
        if (studentcheck == null){
            log.info("잘못된 아이디"+id);
            return null;
        }
        studentRepository.delete(studentcheck);
        return studentcheck;
    }
}
