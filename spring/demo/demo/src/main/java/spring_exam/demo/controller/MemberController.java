package spring_exam.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import spring_exam.demo.dto.MemberForm;
import spring_exam.demo.entity.Member;
import spring_exam.demo.repository.MemberRepository;
import spring_exam.demo.service.MemberService;

import java.util.List;

@Slf4j
@Controller
public class MemberController {
    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    MemberService memberService;


    @GetMapping("member/input")
    public String boardmember(){
        return "/member/input";
    }

    @PostMapping("member/input_ok")
    public String boardmemberok(MemberForm memberForm , Model model){
        Member inputMember = memberService.inputMember(memberForm);
        model.addAttribute("memberForm",inputMember);
        return "/member/inputok";
    }
    @GetMapping("member/member_list")
    public String memberlist(Model model){
        List<Member> memberList = memberService.selectAllMember();
        model.addAttribute("memberlist",memberList);
        return "member/memberlist";
    }
    @GetMapping("member/memberview/{id}")
    public String memberidlist(@PathVariable("id") Long id, Model model){
        Member member = memberService.selectMember(id);
        //엔티티 존재하면 반환 없으면 null
        if(member!=null) {
            model.addAttribute("memberview", member);
        }else{
            return "board/error";
        }
        return "member/memberview";
    }
    @GetMapping("member/edit/{id}")
    public String edit(@PathVariable("id") Long id , Model model){
        Member member = memberRepository.findById(id).orElse(null);
        model.addAttribute("member",member);
        return "/member/edit";
    }
    @PostMapping("member/update")
    public String boardupdate(MemberForm memberForm){
        Member member = memberForm.toEntity();
        log.info(member.toString());
        Member member1;
        member1 = memberRepository.findById(member.getId()).orElse(null);
        if(member1 != null){
            Member saved =memberRepository.save(member);
        }
        return "redirect:/member/memberview/"+member.getId();
    }
    @GetMapping("member/delete/{id}")
    public String boarddelete(@PathVariable("id") Long id , RedirectAttributes redirectAttributes){
        Member member =memberService.deleteMember(id);
        if (member == null){
            return "board/error";
        }
        redirectAttributes.addFlashAttribute("message","삭제되었습니다.");
        return "redirect:/member/member_list";
    }
    @GetMapping("member/ajaxlist")
    public String ajax_list(){
        return "/member/ajaxlist";
    }
    @GetMapping("member/ajaxview/{id}")
    public String ajax_view(@PathVariable("id") Long id , Model model){
        model.addAttribute("id",id);
        return "/member/ajaxview";
    }
    @GetMapping("member/ajaxedit/{id}")
    public String ajax_edit(@PathVariable("id") Long id , Model model){
        Member member = memberRepository.findById(id).orElse(null);
        model.addAttribute("member",member);
        return "/member/ajaxedit";
    }
    @GetMapping("member/ajaxinput")
    public String ajax_input(){
        return "/member/ajaxinput";
    }
    @GetMapping("member/{id}/buyitem")
    public String ajax_buylist(@PathVariable("id") Long id , Model model){
        model.addAttribute("id",id);
        return "/member/ajaxbuyItem";
    }
    @GetMapping("member/{id}/buyitem/{item}")
    public String ajax_insertitem(@PathVariable("id") Long id,
                                  @PathVariable("item") String item,
                                  RedirectAttributes redirectAttributes){
        Member member = memberRepository.findById(id).orElse(null);
        redirectAttributes.addFlashAttribute("message",
                id+" 번 "+member.getName()+"님 "+item+"(이)가 등록되었습니다");
        return "redirect:/member/{id}/buyitem";
    }
    @GetMapping("member/{id}/orders/{item}")
    public String ajax_searchitem(@PathVariable("id") Long id,
                                  @PathVariable("item") String item,
                                  Model model){
        model.addAttribute("id",id);
        model.addAttribute("item",item);
        return "/member/ajaxsearch";
    }
    @GetMapping("member/{memberid}/{item}/{id}")
    public String ajax_deleteitem(@PathVariable("id") Long id,
                                  @PathVariable("memberid") Long memberid,
                                  @PathVariable("item") String item,
                                  RedirectAttributes redirectAttributes){

        redirectAttributes.addFlashAttribute("deletemessage",
                item+"(이)가 삭제되었습니다.");
        return "redirect:/member/{memberid}/buyitem";
    }
    @GetMapping("member/{memberid}/ajaxdelete/{id}")
    public String ajax_deletepage(@PathVariable("id") Long id,Model model,
                                  @PathVariable("memberid") Long memberid){
        model.addAttribute("id",id);
        model.addAttribute("memberid",memberid);
        return "/member/ajaxitemdelete";
    }
}
