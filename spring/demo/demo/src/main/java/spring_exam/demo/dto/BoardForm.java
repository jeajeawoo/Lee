package spring_exam.demo.dto;

import lombok.*;
import spring_exam.demo.entity.Board;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoardForm {
    private Long id;
    private String title;
    private String content;

    //DTO를 엔티티로 변환하는 메소드 추가
    //객체 새성
    public Board toEntity() {

        return new Board(id,title,content);

    }

}
