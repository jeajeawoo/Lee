package spring_exam.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import spring_exam.demo.dto.CommentDto;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String cbody;

    @Column
    private String name;

    @JoinColumn(name = "boardid")
    @ManyToOne(cascade = CascadeType.REMOVE)
    private Board board;

    public static Comment dtoConvertEntity(CommentDto commentDto,Board board){
        if(board.getId() != commentDto.getBoardid()){
            throw new IllegalArgumentException("댓글 생성 실패 : 원글 id가 다릅니다");
        }
        return new Comment(commentDto.getId(),commentDto.getCbody(),
                commentDto.getName(), board);
    }
}
