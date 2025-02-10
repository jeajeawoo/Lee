package spring_exam.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동 증가값 1,2,3
    private Long id;

    @Column
    private int 영어;

    @Column
    private int 국어;

    @Column
    private int 수학;

    @Column
    private String name;

    public void patchCheck(Student student){
        if (student.국어 <= 100 && student.국어 >= 0) {
            this.국어 = student.국어;
        }
        if (student.name != null){
            this.name=student.name;
        }
        if (student.영어 <= 100 && student.영어 >= 0){
            this.영어=student.영어;
        }
        if (student.수학 <= 100 && student.수학 >= 0){
            this.수학=student.수학;
        }
    }

}
