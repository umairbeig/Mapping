package org.example.mapping.Services;

import org.example.mapping.Model.Student;
import org.example.mapping.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service

public class ProfileServices {

   @Autowired
    StudentRepo s;

   public List<Student> findAllStudents(){
      return s.findAll();
   }
   public Student addStudent(@RequestBody Student st){
       s.save(st);
       return st;
   }

}
