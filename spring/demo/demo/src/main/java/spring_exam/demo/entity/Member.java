package spring_exam.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동 증가값 1,2,3
    private Long id;

    @Column
    private String email;

    @Column
    private String name;
    @Column
    private String addr;

    public void patchCheck(Member member){
        if (member.email != null ){
            this.email=member.email;
        }
        if (member.name != null){
            this.name=member.name;
        }
        if (member.addr != null){
            this.addr=member.addr;
        }
    }

}
