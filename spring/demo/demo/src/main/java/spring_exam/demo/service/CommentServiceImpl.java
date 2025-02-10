package spring_exam.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring_exam.demo.dto.CommentDto;
import spring_exam.demo.entity.Board;
import spring_exam.demo.entity.Comment;
import spring_exam.demo.repository.BoardRepository;
import spring_exam.demo.repository.CommentRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommentServiceImpl implements CommentService{
    @Autowired
    CommentRepository commentRepository;

    @Autowired
    BoardRepository boardRepository;

    @Override
    public List<CommentDto> selectAllComment(){
        /*List<Comment> commentList = commentRepository.findAll();
        //dto를 저장할 List를 생성
        List<CommentDto> commentDtos = new ArrayList<CommentDto>();
        for(Comment comment : commentList){
            //엔티티를 dto로 변환
            CommentDto commentDto = CommentDto.entityConvertDto(comment);
            //변환된 dto를 dto 컬렉션에 저장
            commentDtos.add(commentDto);
        }*/
        //1. 스트림으로 변환 --> 엔티티를 dto변환 --> list 컬렉션으로 저장
        return commentRepository.findAll()
                .stream()
                .map(comment -> CommentDto.entityConvertDto(comment))
                .collect(Collectors.toList());
    }

    @Override
    public List<CommentDto> selectBoardComment(Long boardid) {
        /*List<Comment> commentList = commentRepository.findByBoardid(boardid);
        //dto를 저장할 List를 생성
        List<CommentDto> commentDtos = new ArrayList<CommentDto>();
        for(Comment comment : commentList){
            //엔티티를 dto로 변환
            CommentDto commentDto = CommentDto.entityConvertDto(comment);
            //변환된 dto를 dto 컬렉션에 저장
            commentDtos.add(commentDto);
        }*/
        return commentRepository.findByBoardid(boardid)
                .stream()
                .map(comment -> CommentDto.entityConvertDto(comment))
                .collect(Collectors.toList());
    }

    @Override
    public List<CommentDto> selectNameComment(String name) {
        return commentRepository.findByName(name)
                .stream()
                .map(comment -> CommentDto.entityConvertDto(comment))
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public CommentDto insertBoardComment(Long boardid , CommentDto commentDto) {
        //외래키이용 원글 확인
        Board board = boardRepository.findById(boardid)
                .orElseThrow(()->new IllegalArgumentException("원글 조회 실패"));
        //dto를 엔티티로 변환
        Comment comment = Comment.dtoConvertEntity(commentDto,board);
        //테이블에 insert
        Comment saved = commentRepository.save(comment);

        //dto로 변환해서 리턴
        return CommentDto.entityConvertDto(saved);
    }

    @Override
    @Transactional
    public CommentDto deleteBoardComment(Long id) {
        Comment comment = commentRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException("삭제 실패 : id가 존재하지 않음"));
        commentRepository.delete(comment);
        return CommentDto.entityConvertDto(comment);
    }
}
