package spring_exam.demo.dto;

import lombok.*;
import spring_exam.demo.entity.Comment;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentDto {

    private Long id;
    private String cbody;
    private String name;
    private Long boardid;

    public static CommentDto entityConvertDto(Comment comment){

        return new CommentDto(comment.getId(),comment.getName(),comment.getCbody(),
                comment.getBoard().getId());
    }
}
