package org.example.mapping.Controllers;

import org.example.mapping.Model.Student;
import org.example.mapping.Repo.ProfileRepo;
import org.example.mapping.Services.ProfileServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.HandlerMapping;

import java.util.List;

@RestController

public class ProfileController {
    @Autowired
    private ProfileRepo profileRepo;
    private HandlerMapping resourceHandlerMapping;
    @Autowired
    private ProfileServices profileServices;

    @GetMapping("/studentlist")
public ResponseEntity<List<Student>>findAllStudents(){

    return new ResponseEntity<>(profileServices.findAllStudents(), HttpStatus.OK);
}

@PostMapping("/addstudent")
    public ResponseEntity<Student> addStudent(@RequestBody Student s){
        return new ResponseEntity<>(profileServices.addStudent(s),HttpStatus.OK);
}
}
