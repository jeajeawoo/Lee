package spring_exam.demo.dto;

import lombok.*;
import spring_exam.demo.entity.Member;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MemberForm {
    private Long id;
    private String email;
    private String name;
    private String addr;


    public Member toEntity() {

        return new Member(id,email,name,addr);

    }


}


