package com.driver.convertor;

import com.driver.RequestDto.AuthorRequestDto;
import com.driver.models.Author;

public class AuthorConvertor {
    public static Author convertDtoToEntity(AuthorRequestDto authorRequestDto){

        Author author = Author.builder().
                name(authorRequestDto.getName())
                .age(authorRequestDto.getAge()).country(authorRequestDto.getCountry())
                .email(authorRequestDto.getEmail()).build();


        return  author;
    }

}
