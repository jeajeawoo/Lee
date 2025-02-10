package spring_exam.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring_exam.demo.dto.MemberForm;
import spring_exam.demo.entity.Member;
import spring_exam.demo.repository.MemberRepository;

import java.util.List;

@Service
@Slf4j
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberRepository memberRepository;

    @Override
    public Member selectMember(Long id) {
        Member member = memberRepository.findById(id).orElse(null);
        if (member==null){
            log.info("잘못된 아이디"+id);
            return null;
        }
        return member;
    }

    @Override
    public List<Member> selectAllMember() {
        List<Member> memberList = memberRepository.findAll();
        return memberList;
    }

    @Override
    public Member inputMember(MemberForm memberdto) {
        log.info(memberdto.toString());
        Member member = memberdto.toEntity();
        log.info(member.toString());
        Member saved = memberRepository.save(member);
        return saved;
    }

    @Override
    public Member updateMember(Long id, MemberForm memberdto) {
        Member member = memberdto.toEntity();
        log.info(member.toString());
        Member membercheck = memberRepository.findById(id).orElse(null);
        if (membercheck == null){
            log.info("잘못된 아이디"+id);
            return null;
        }
        membercheck.patchCheck(member);
        //2번객체와 새로운 객체를 비교해서 null값이 아닐때 업데이트 시킴 null값이면 기존값
        Member memberupdate = memberRepository.save(membercheck);
        return memberupdate;
    }

    @Override
    public Member deleteMember(Long id) {
        Member membercheck = memberRepository.findById(id).orElse(null);
        if (membercheck == null){
            log.info("잘못된 아이디"+id);
            return null;
        }
        memberRepository.delete(membercheck);
        return membercheck;
    }
}
