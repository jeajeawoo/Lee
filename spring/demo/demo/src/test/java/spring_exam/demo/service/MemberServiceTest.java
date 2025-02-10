package spring_exam.demo.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import spring_exam.demo.dto.MemberForm;
import spring_exam.demo.entity.Member;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MemberServiceTest {

    @Autowired
    MemberService memberService;

    @Test
    @Transactional
    void deleteMember() {
        Member member = new Member(38L,"Son@gmail.com","손흥민","잉글랜드");
        Member result = memberService.deleteMember(38L);
        assertEquals(member.toString(), result.toString());
    }

    @Test
    @Transactional
    void inputMember() {
        MemberForm dto = new MemberForm(null,"Son@gmail.com","손흥민","잉글랜드");
        Member member = new Member(42L,"Son@gmail.com","손흥민","잉글랜드");
        Member result = memberService.inputMember(dto);
        assertEquals(member.toString(),result.toString());
    }

    @Test
    @Transactional
    void updateMember() {
        MemberForm dto = new MemberForm(38L,"Son@gmail.com","손흥민","잉글랜드");
        Member member = new Member(38L,"Son@gmail.com","손흥민","잉글랜드");
        Member result = memberService.updateMember(38L,dto);
        assertEquals(member.toString(),result.toString());
    }

    @Test
    void selectMember() {
        Member member = new Member(38L,"Son@gmail.com","손흥민","잉글랜드");
        Member result = memberService.selectMember(38L);
        assertEquals(member.toString(),result.toString());
    }
}