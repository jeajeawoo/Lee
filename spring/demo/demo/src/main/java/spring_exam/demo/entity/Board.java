package spring_exam.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

//DB 의 테이블

@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Board {

    //기본키
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동 증가값 1,2,3
    private Long id;

    @Column
    private String title;

    @Column
    private String content;

    public void patchCheck(Board board){
        if (board.title != null ){
            this.title=board.title;
        }
        if (board.content != null){
            this.content=board.content;
        }
    }
}
