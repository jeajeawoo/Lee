package spring_exam.demo.repository;

import org.springframework.data.repository.CrudRepository;
import spring_exam.demo.entity.Member;

import java.util.ArrayList;

public interface MemberRepository extends CrudRepository<Member,Long> {
    @Override
    ArrayList<Member> findAll();

}
