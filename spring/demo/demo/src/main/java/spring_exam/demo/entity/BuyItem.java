package spring_exam.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import spring_exam.demo.dto.BuyItemDto;

import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BuyItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String item;

    @Column
    @Temporal(value = TemporalType.DATE) //년월일 date 타입 db에 매핑
    @CreationTimestamp //타임자동으로 생성해줌
    private Date orderdate;

    @ManyToOne
    @JoinColumn(name="memberid")
    private Member member;

    public static BuyItem dtoConvertEntity(BuyItemDto buyItemDto, Member member){
        if(member.getId() != buyItemDto.getMemberid()){
            throw new IllegalArgumentException("댓글 생성 실패 : 원글 id가 다릅니다");
        }
        return new BuyItem(buyItemDto.getId(),buyItemDto.getItem(),
                buyItemDto.getOrderdate(), member);
    }
}
