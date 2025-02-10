package spring_exam.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring_exam.demo.dto.BuyItemDto;
import spring_exam.demo.entity.BuyItem;
import spring_exam.demo.entity.Member;
import spring_exam.demo.repository.BuyItemRepository;
import spring_exam.demo.repository.MemberRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BuyItemServiceImpl implements BuyItemService{
    @Autowired
    BuyItemRepository buyItemRepository;

    @Autowired
    MemberRepository memberRepository;

    @Override
    public List<BuyItemDto> selectAllBuyItem(){
        List<BuyItem> buyItemList = buyItemRepository.findAll();
        //dto를 저장할 List를 생성
        List<BuyItemDto> buyItemDtos = new ArrayList<BuyItemDto>();
        for(BuyItem buyItem : buyItemList){
            //엔티티를 dto로 변환
            BuyItemDto buyItemDto = BuyItemDto.entityConvertDto(buyItem);
            //변환된 dto를 dto 컬렉션에 저장
            buyItemDtos.add(buyItemDto);
        }
        return buyItemDtos;
    }

    @Override
    public List<BuyItemDto> selectMemberBuyItem(Long memberid) {
        List<BuyItem> buyItemList = buyItemRepository.findByMemberId(memberid);
        //dto를 저장할 List를 생성
        List<BuyItemDto> buyItemDtos = new ArrayList<BuyItemDto>();
        for(BuyItem buyItem : buyItemList){
            //엔티티를 dto로 변환
            BuyItemDto buyItemDto = BuyItemDto.entityConvertDto(buyItem);
            //변환된 dto를 dto 컬렉션에 저장
            buyItemDtos.add(buyItemDto);
        }
        return buyItemDtos;
    }

    @Override
    @Transactional
    public BuyItemDto insertMemberItem(Long memberid, BuyItemDto buyItemDto) {
        //외래키이용 원글 확인
        Member member = memberRepository.findById(memberid)
                .orElseThrow(()->new IllegalArgumentException("원글 조회 실패"));
        //dto를 엔티티로 변환
        BuyItem buyItem = BuyItem.dtoConvertEntity(buyItemDto,member);
        //테이블에 insert
        BuyItem saved = buyItemRepository.save(buyItem);
        //dto로 변환해서 리턴
        return BuyItemDto.entityConvertDto(saved);
    }

    @Override
    public List<BuyItemDto> searchItem(String item, Long memberid) {
        return buyItemRepository.findByMemberIdAndItem(memberid,item)
                .stream()
                .map(buyItem -> BuyItemDto.entityConvertDto(buyItem))
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public BuyItemDto deleteMemberBuyItem(Long id) {
        BuyItem buyItem = buyItemRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException("삭제 실패 : id가 존재하지 않음"));
        buyItemRepository.delete(buyItem);
        return BuyItemDto.entityConvertDto(buyItem);
    }

}
