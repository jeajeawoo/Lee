package spring_exam.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring_exam.demo.dto.StudentForm;
import spring_exam.demo.entity.Student;
import spring_exam.demo.service.StudentService;

import java.util.List;

@RestController
public class StudentApiController {

    @Autowired
    StudentService studentService;

    @GetMapping("/api/students")
    public List<Student> selectstudent(){
        List<Student> studentList = studentService.selectAllStudent();
        return studentList;
    }
    @PostMapping("/api/students")
    public Student insertStudent(@RequestBody StudentForm studentForm){
        Student student = studentService.insertStudent(studentForm);
        return student;
    }
    @PatchMapping("/api/students/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable("id") Long id,
                                                 @RequestBody StudentForm studentForm){
        Student studentupdate = studentService.updateStudent(id,studentForm);
        if (studentupdate == null || id==studentForm.getId()){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        return ResponseEntity.status(HttpStatus.OK).body(studentupdate);
    }
    @DeleteMapping("/api/students/{id}")
    public ResponseEntity<Student> deleteStudent(@PathVariable("id") Long id){
        Student studentdelete = studentService.deleteStudent(id);
        if (studentdelete == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        return ResponseEntity.status(HttpStatus.OK).body(studentdelete);
    }
}
