package com.jojoldu.book.springboot.dto;

import static org.assertj.core.api.Assertions.assertThat;

import com.jojoldu.book.springboot.web.dto.HelloResponseDto;
import org.junit.Test;

public class HelloResponseDtoTest {

    @Test
    public void 롬북_기능테스트(){
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
