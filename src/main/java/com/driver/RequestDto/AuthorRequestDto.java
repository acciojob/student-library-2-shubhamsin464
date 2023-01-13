package com.driver.RequestDto;

import lombok.Data;

import javax.persistence.Column;

@Data
public class AuthorRequestDto {


    private String name;

    private int age;

    private String country;

    @Column(unique = true)
    private String email;


}
