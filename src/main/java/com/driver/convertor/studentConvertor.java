package com.driver.convertor;

import com.driver.RequestDto.StudentRequestDto;
import com.driver.models.Student;

public class studentConvertor {
    public static Student convertDtoToEntity(StudentRequestDto studentRequestDto){
        Student student = Student.builder().name(studentRequestDto.getName()).age(studentRequestDto.getAge()).
                country(studentRequestDto.getCountry()).emailId(studentRequestDto.getEmailId()).build();
        return student;
    }
}
