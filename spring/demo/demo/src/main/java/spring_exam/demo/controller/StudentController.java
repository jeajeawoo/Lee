package spring_exam.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import spring_exam.demo.entity.Student;
import spring_exam.demo.repository.StudentRepository;

@Controller
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("student")
    public String selectstudent(){
        return "student";
    }
    @GetMapping("student/insert")
    public String insertstudent(){
        return "insert_student";
    }

    @GetMapping("student/update/{id}")
    public String updatestudent(@PathVariable("id") Long id, Model model){
        Student student = studentRepository.findById(id).orElse(null);
        model.addAttribute("student",student);
        return "update_student";
    }

    @GetMapping("student/delete/{id}")
    public String deletestudent(@PathVariable("id") Long id,Model model){
        Student student = studentRepository.findById(id).orElse(null);
        model.addAttribute("student",student);
        return "delete_student";
    }

    @GetMapping("student/delete_{name}/{id}")
    public String deleteokstudent(@PathVariable("id") Long id,
                                @PathVariable("name") String name,
                                RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("message",
                name+"님의 정보가 삭제되었습니다");
        return "redirect:/student";
    }
}
