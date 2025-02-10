package spring_exam.demo.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring_exam.demo.dto.MemberForm;
import spring_exam.demo.entity.Member;
import spring_exam.demo.service.MemberService;

import java.util.List;

@Slf4j
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class MemberApiController {

    @Autowired
    MemberService memberService;

    @GetMapping("/api/members")
    public List<Member> apimember(){
        List<Member> memberList = memberService.selectAllMember();
        return memberList;
    }
    @GetMapping("/api/members/{id}")
    public ResponseEntity<Member> apiview(@PathVariable("id") Long id){
        Member member = memberService.selectMember(id);
        if (member==null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        return ResponseEntity.status(HttpStatus.OK).body(member);
    }
    @PostMapping("/api/members")
    public Member apiinput(@RequestBody MemberForm memberdto){
        Member inputMember = memberService.inputMember(memberdto);
        return inputMember;
    }
    @PatchMapping("/api/members/{id}")
    public ResponseEntity<Member> apiupdate(@PathVariable("id") Long id ,
                                           @RequestBody MemberForm memberdto){

        Member memberupdate = memberService.updateMember(id,memberdto);
        if (memberupdate == null || id==memberdto.getId()){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        return ResponseEntity.status(HttpStatus.OK).body(memberupdate);
    }
    @DeleteMapping("/api/members/{id}")
    public  ResponseEntity<Member> apidelete(@PathVariable("id") Long id){
        Member memberdeleted = memberService.deleteMember(id);
        if (memberdeleted == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        return ResponseEntity.status(HttpStatus.OK).body(memberdeleted);
    }
}
