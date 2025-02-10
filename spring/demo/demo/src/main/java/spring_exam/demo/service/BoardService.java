package spring_exam.demo.service;

import spring_exam.demo.dto.BoardForm;
import spring_exam.demo.entity.Board;

import java.util.List;

public interface BoardService {
    public List<Board> selectAllBoard();

    public Board selectBoard(Long id);

    public Board inputBoard(BoardForm boarddto);

    public Board updateBoard(Long id, BoardForm boarddto);

    public Board deleteBoard(Long id);
}
