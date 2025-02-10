package spring_exam.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring_exam.demo.dto.CommentDto;
import spring_exam.demo.service.CommentService;

import java.util.List;

@RestController
public class CommentApiController {
    @Autowired
    CommentService commentService;

    @GetMapping("/api/boards/comments")
    public ResponseEntity<List<CommentDto>> listcomment(){
        List<CommentDto> commentDtoList = commentService.selectAllComment();
        return ResponseEntity.status(HttpStatus.OK).body(commentDtoList);
    }
    @GetMapping("/api/boards/{boardid}/comments")
    public ResponseEntity<List<CommentDto>> listboardcomment(@PathVariable("boardid") Long boardid){
        List<CommentDto> commentDtoList = commentService.selectBoardComment(boardid);
        return ResponseEntity.status(HttpStatus.OK).body(commentDtoList);
    }
    @GetMapping("/api/boards/comments/{name}")
    public ResponseEntity<List<CommentDto>> listnamecommnet(@PathVariable("name") String name){
        List<CommentDto> commentDtoList = commentService.selectNameComment(name);
        return ResponseEntity.status(HttpStatus.OK).body(commentDtoList);
    }
    @PostMapping("/api/boards/{boardid}/comments")
    public ResponseEntity<CommentDto> insertboardcommnet(@PathVariable("boardid") Long boardid,
                                                         @RequestBody CommentDto commentDto){
        CommentDto insertedBoardComment = commentService.insertBoardComment(boardid, commentDto);
        return ResponseEntity.status(HttpStatus.OK).body(insertedBoardComment);
    }
    @DeleteMapping("/api/boards/comments/{id}")
    public ResponseEntity<CommentDto> deleteboardcomment(@PathVariable("id") Long id){
        CommentDto deletedcomment = commentService.deleteBoardComment(id);
        return ResponseEntity.status(HttpStatus.OK).body(deletedcomment);
    }

}
