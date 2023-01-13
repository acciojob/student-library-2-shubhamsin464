package com.driver.controller;

import com.driver.RequestDto.StudentRequestDto;
import com.driver.models.Student;
import com.driver.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/student")
//Add required annotations
public class StudentController {

    @Autowired
    StudentService studentService;
    //Add required annotations
    @GetMapping("/getStudentByEmail")
    public ResponseEntity getStudentByEmail(@RequestParam("email") String email){

        return new ResponseEntity<>("Student details printed successfully ", HttpStatus.OK);
    }

    //Add required annotations
    @GetMapping("/getStudentById")
    public ResponseEntity getStudentById(@RequestParam("id") int id){

        return new ResponseEntity<>("Student details printed successfully ", HttpStatus.OK);
    }

    //Add required annotations
    @PostMapping("/createStudent")
    public ResponseEntity<String> createStudent(@RequestBody() StudentRequestDto studentRequestDto){
        studentService.createStudent(studentRequestDto);
        return new ResponseEntity<>("the student is successfully added to the system", HttpStatus.CREATED);
    }

    //Add required annotations
    @PutMapping("/updateStudent")
    public ResponseEntity updateStudent(@RequestBody Student student){

        return new ResponseEntity<>("student is updated", HttpStatus.ACCEPTED);
    }

    //Add required annotations
    @DeleteMapping("/deleteStudent")
    public ResponseEntity deleteStudent(@RequestParam("id") int id){

        return new ResponseEntity<>("student is deleted", HttpStatus.ACCEPTED);
    }

}
