package spring_exam.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import spring_exam.demo.dto.BoardForm;
import spring_exam.demo.entity.Board;
import spring_exam.demo.repository.BoardRepository;

import java.util.List;

@Controller
public class BoardController {

    //repository객체
    @Autowired //자동으로 객체 생성
    private BoardRepository boardRepository;

    @GetMapping("/board/input")
    public String boardinput() {

        return "board/input";

    }

    @PostMapping("/board/input_ok")
    public String boardinputok(BoardForm boardform, Model model) {
        //1. dto 객체 생성 확인(입력 데이터를 dto로)
        System.out.println(boardform.toString());

        //2. dto를 엔티티로 변환
        Board board = boardform.toEntity();
        System.out.println(board.toString());

        //3.리포지토리를 이용해서 엔티티를 DB로 전달
        //save: insert --> 엔티티 리턴
        Board saved = boardRepository.save(board);
        //view 로 dto 객체 전송
        model.addAttribute("boardform", saved);
        return "board/inputok";
    }
    @GetMapping("board/blist")
    public String boardlist(Model model){
        List<Board> boardList = boardRepository.findAll();
        model.addAttribute("boardlist",boardList);
        return "board/blist";
    }
    @GetMapping("board/view/{id}")
    public String boardidlist(@PathVariable("id") Long id, Model model){

        Board board = boardRepository.findById(id).orElse(null);
        //엔티티 존재하면 반환 없으면 null
        if(board!=null) {
            model.addAttribute("boardview", board);
        }else{
            return "board/error";
        }
        return "board/view";
    }
    @GetMapping("board/edit/{id}")
    public String boardedit(@PathVariable("id") Long id , Model model){
        Board board = boardRepository.findById(id).orElse(null);
        model.addAttribute("board",board);
        return "/board/edit";
    }
    @PostMapping("board/update")
    public String boardupdate(BoardForm boardForm){
        Board board = boardForm.toEntity();

        Board board1;
        board1 = boardRepository.findById(board.getId()).orElse(null);

        if(board1 != null){
            Board board2 = boardRepository.save(board);
        }
        return "redirect:/board/view/"+board.getId();
    }
    @GetMapping("board/delete/{id}")
    public String boarddelete(@PathVariable("id") Long id ){
        Board board =boardRepository.findById(id).orElse(null);
        if (board != null){
            boardRepository.delete(board);
        }
        return "redirect:/board/blist";
    }
    @GetMapping("board/boardajax")
    public String boardajax(){
        return "/board/ajaxinput";
    }
    @GetMapping("board/ajaxedit/{id}")
    public String ajaxedit(@PathVariable("id") Long id , Model model){
        Board board = boardRepository.findById(id).orElse(null);
        model.addAttribute("board",board);
        return "/board/ajaxedit";
    }
    @GetMapping("board/ajaxdelete/{id}")
    public String ajaxdeleteboard(@PathVariable("id") Long id, Model model){
        model.addAttribute("id",id);
        return "/board/ajaxdelete";
    }
}
