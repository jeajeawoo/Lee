package spring_exam.demo.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring_exam.demo.dto.BoardForm;
import spring_exam.demo.entity.Board;
import spring_exam.demo.service.BoardService;

import java.util.List;

@Slf4j
@RestController
//crud의 결과를 json으로 변환해서 리턴
public class BoardApiController {

    @Autowired
    BoardService boardService;

    @GetMapping("/api/boards")
    public List<Board> apilist(){
        List<Board> boardList = boardService.selectAllBoard();
        return boardList;
    }
    @GetMapping("/api/boards/{id}")
    public ResponseEntity<Board> apiview(@PathVariable("id") Long id){
        Board board = boardService.selectBoard(id);
        if (board==null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        return ResponseEntity.status(HttpStatus.OK).body(board);
    }
    @PostMapping("/api/boards")
    public Board apiinput(@RequestBody BoardForm boarddto){
        Board inputBoard = boardService.inputBoard(boarddto);
        return inputBoard;
    }
    @PatchMapping("/api/boards/{id}")
    public ResponseEntity<Board> apiupdate(@PathVariable("id") Long id ,
                                           @RequestBody BoardForm boarddto){
        Board boardupdate = boardService.updateBoard(id,boarddto);
        if (boardupdate == null || id != boarddto.getId()){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        return ResponseEntity.status(HttpStatus.OK).body(boardupdate);
    }
    @DeleteMapping("/api/boards/{id}")
    public  ResponseEntity<Board> apidelete(@PathVariable("id") Long id){
        Board deleted = boardService.deleteBoard(id);
        if (deleted == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
}
