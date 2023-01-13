package com.driver.services;

import com.driver.RequestDto.StudentRequestDto;
import com.driver.convertor.studentConvertor;
import com.driver.models.Card;
import com.driver.models.Student;
import com.driver.repositories.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class StudentService {


    @Autowired
    CardService cardService;

    @Autowired
    StudentRepository studentRepository;

    public Student getDetailsByEmail(String email){
        Student student = null;

        return student;
    }

    public Student getDetailsById(int id){
        Student student = null;

        return student;
    }

    public void createStudent(StudentRequestDto studentRequestDto){
//            Student student = new Student();
//        student.setAge(studentRequestDto.getAge());
//        student.setCountry(studentRequestDto.getCountry());
//        student.setEmailId(studentRequestDto.getEmailId());
//        student.setName(studentRequestDto.getName());

             try{
                 Student student = studentConvertor.convertDtoToEntity(studentRequestDto);
                 Card newCard = cardService.createAndReturn(student);
                 student.setCard(newCard);
                 studentRepository.save(student);
             }catch (Exception e){
                 log.info("Create student has caused an error");
             }
    }

    public void updateStudent(Student student){

    }

    public void deleteStudent(int id){
        //Delete student and deactivate corresponding card
    }
}
