package spring_exam.demo.service;

import spring_exam.demo.dto.BuyItemDto;

import java.util.List;

public interface BuyItemService {

    public List<BuyItemDto> selectAllBuyItem();

    public List<BuyItemDto> selectMemberBuyItem(Long memberid);

    public BuyItemDto insertMemberItem(Long memberid , BuyItemDto buyItemDto);

    public List<BuyItemDto> searchItem(String item , Long memberid);

    public BuyItemDto deleteMemberBuyItem(Long id);
}
