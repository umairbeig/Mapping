package org.example.mapping.Services;

import org.example.mapping.Model.Profile;
import org.example.mapping.Model.Student;
import org.example.mapping.Model.Subject;
import org.example.mapping.Repo.StudentRepo;
import org.example.mapping.Repo.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Set;

@Service

public class ProfileServices {

   @Autowired
    StudentRepo s;

   @Autowired
   SubjectRepo sr;

   public List<Student> findAllStudents(){
      return s.findAll();
   }

   public Student addStudent(@RequestBody Student st){

       s.save(st);

       return st;
   }

   public List<Subject> findAllProfiles(){
       return sr.findAll();
   }

}
