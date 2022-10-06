package com.innostudy.book.web.dto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class HelloResponseDtoTest {

    @Test
    public void 롬복기능테스트() {
        //junit은 다른 거에 의존적이다
        String name = "test";
        int amount = 1000;

        HelloResponseDto dto = new HelloResponseDto(name, amount);

        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}