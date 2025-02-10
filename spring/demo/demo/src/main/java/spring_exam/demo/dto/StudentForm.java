package spring_exam.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import spring_exam.demo.entity.Student;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentForm {
    private Long id;
    private int 영어;
    private int 국어;
    private int 수학;
    private String name;

    public Student toEntity() {

        return new Student(id,영어,국어,수학,name);

    }
}
