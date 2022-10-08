package com.innostudy.book.web.controller;

import com.innostudy.book.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*컨트롤러를 JSON으로 반환
 각각 선언했던 @ResponseBody를 한번에 사용할 수 있게 함 */
@RestController
public class HelloController {

    //http Mtd인 Get 요청을 받는 API를 만듦
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }

}
