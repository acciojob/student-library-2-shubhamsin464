package com.driver.RequestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentRequestDto {
    private String name;
    private int age;
    private String country;
    private String emailId;




}
