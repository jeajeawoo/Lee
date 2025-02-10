package spring_exam.demo.service;

import spring_exam.demo.dto.MemberForm;
import spring_exam.demo.entity.Member;

import java.util.List;

public interface MemberService {
    public List<Member> selectAllMember();

    public Member selectMember(Long id);

    public Member inputMember(MemberForm memberdto);

    public Member updateMember(Long id, MemberForm memberdto);

    public Member deleteMember(Long id);
}
