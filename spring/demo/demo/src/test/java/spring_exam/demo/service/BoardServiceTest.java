package spring_exam.demo.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import spring_exam.demo.dto.BoardForm;
import spring_exam.demo.entity.Board;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BoardServiceTest {
    @Autowired
    BoardService boardService;

    @Test
    @Transactional //성공 실패 상관없이 롤백 , 롤백이 되어도 id값은 증가됌
    void inputBoard() {
        //1. 예상 데이터
        BoardForm dto= new BoardForm(null,"제목테스트","컨텐츠테스트");
        Board board = new Board(25L,"제목테스트","컨텐츠테스트");
        //2. 실제 데이터(함수 호출)
        Board result = boardService.inputBoard(dto);
        //3. 비교
        assertEquals(board.toString(),result.toString());
    }

    @Test
    @Transactional
    void deleteBoard() {
        Board board = new Board(21L,"제목테스트","컨텐츠테스트");
        Board result = boardService.deleteBoard(21L);
        assertEquals(board.toString(),result.toString());
    }

    @Test
    void updateBoard() {
        //1.예상 데이터
        BoardForm dto= new BoardForm(17L,"수정제목2","수정컨텐츠");
        Board board = new Board(17L,"수정제목2","수정컨텐츠");
        //2.실제 데이터
        Board result = boardService.updateBoard(17L,dto);
        //3.값 비교
        assertEquals(board,result);
    }
}