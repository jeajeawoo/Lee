package spring_exam.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring_exam.demo.dto.BuyItemDto;
import spring_exam.demo.service.BuyItemService;

import java.util.List;

@RestController
public class BuyItemApiController {
    @Autowired
    BuyItemService buyItemService;

    @GetMapping("/api/members/buy_items")
    public ResponseEntity<List<BuyItemDto>> listbuyitem(){
        List<BuyItemDto> buyItemDtoList = buyItemService.selectAllBuyItem();
        return ResponseEntity.status(HttpStatus.OK).body(buyItemDtoList);
    }
    @GetMapping("/api/members/{memberid}/buy_items")
    public ResponseEntity<List<BuyItemDto>> listmemeberbuyitem(@PathVariable("memberid") Long memberid){
        List<BuyItemDto> buyItemDtoList = buyItemService.selectMemberBuyItem(memberid);
        return ResponseEntity.status(HttpStatus.OK).body(buyItemDtoList);
    }
    @PostMapping("/api/members/{memberid}/buy_items")
    public ResponseEntity<BuyItemDto> insertmemberbuyitem(@PathVariable("memberid") Long memberid,
                                                          @RequestBody BuyItemDto buyItemDto){
        BuyItemDto insertedMemberItem = buyItemService.insertMemberItem(memberid, buyItemDto);
        return ResponseEntity.status(HttpStatus.OK).body(insertedMemberItem);
    }
    @GetMapping("/api/members/{memberid}/buy_items/{item}")
    public ResponseEntity<List<BuyItemDto>> searchmemberItem(@PathVariable("memberid") Long memberid,
                                                             @PathVariable("item") String item){
        List<BuyItemDto> buyItemDtoList = buyItemService.searchItem(item,memberid);
        return ResponseEntity.status(HttpStatus.OK).body(buyItemDtoList);
    }
    @DeleteMapping("/api/members/buy_items/{id}")
    public ResponseEntity<BuyItemDto> deletememberbuyitem(@PathVariable("id") Long id){
        BuyItemDto deletedbuyitem = buyItemService.deleteMemberBuyItem(id);
        return ResponseEntity.status(HttpStatus.OK).body(deletedbuyitem);
    }
}
