package com.ulbbang.book.firstproject.dto;

import com.ulbbang.book.firstproject.web.dto.HelloResponseDto;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {
    @Test
    public void lombok_test_one() {
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