package spring_exam.demo.service;

import spring_exam.demo.dto.CommentDto;

import java.util.List;

public interface CommentService {
    public List<CommentDto> selectAllComment();

    public List<CommentDto> selectBoardComment(Long boardid);

    public List<CommentDto> selectNameComment(String name);

    public CommentDto insertBoardComment(Long boardid , CommentDto commentDto);

    public CommentDto deleteBoardComment(Long id);
}
