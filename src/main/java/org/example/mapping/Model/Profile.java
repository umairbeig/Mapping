package org.example.mapping.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "FN")
    private String firstName;
    @Column(name = "LN")
    private String lastName;
    @Column(name = "Email")
    private String email;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "college_name")
    private College college;

    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;

     @ManyToMany
     @JoinTable(
             name = "profile_subject",
             joinColumns = @JoinColumn(name = "profile_id"),
             inverseJoinColumns = @JoinColumn(name = "subject_id")
     )
    private Set<Subject> subjects;

}
