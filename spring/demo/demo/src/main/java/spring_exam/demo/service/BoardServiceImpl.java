package spring_exam.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring_exam.demo.dto.BoardForm;
import spring_exam.demo.entity.Board;
import spring_exam.demo.entity.Comment;
import spring_exam.demo.repository.BoardRepository;
import spring_exam.demo.repository.CommentRepository;

import java.util.List;

@Slf4j
@Service
public class BoardServiceImpl implements BoardService{

    @Autowired
    BoardRepository boardRepository;

    @Autowired
    CommentRepository commentRepository;
    @Override
    public List<Board> selectAllBoard() {
        List<Board> boardList = boardRepository.findAll();
        return boardList;
    }

    @Override
    public Board selectBoard(Long id) {
        Board board = boardRepository.findById(id).orElse(null);
        if (board==null){
            log.info("잘못된 아이디"+id);
            return null;
        }
        return board;
    }

    @Override
    public Board inputBoard(BoardForm boarddto) {
        log.info(boarddto.toString());
        Board board = boarddto.toEntity();
        log.info(board.toString());

        Board saved = boardRepository.save(board);
        return saved;
    }

    @Override
    public Board updateBoard(Long id, BoardForm boarddto) {
        Board board = boarddto.toEntity();

        Board boardcheck = boardRepository.findById(id).orElse(null);
        if (boardcheck == null){
            log.info("잘못된 아이디"+id);
            return null;
        }
        boardcheck.patchCheck(board);
        //2번객체와 새로운 객체를 비교해서 null값이 아닐때 업데이트 시킴 null값이면 기존값
        Board boardupdate = boardRepository.save(boardcheck);
        return boardupdate;
    }

    @Override
    public Board deleteBoard(Long id) {
        Board boardcheck = boardRepository.findById(id).orElse(null);
        List<Comment> commentDtoList = commentRepository.findByBoardid(id);
        if (commentDtoList!=null){
            commentRepository.deleteAll(commentDtoList);
        }
        if (boardcheck == null){
            log.info("잘못된 아이디"+id);
            return null;
        }
        boardRepository.delete(boardcheck);
        return boardcheck;
    }
}
