package org.example.mapping.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
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

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "student_id")
    @JsonIgnore
    private Student student;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "profiles",cascade = CascadeType.PERSIST)
    private Set<Subject> subjects;

    public void setSubjects(Set<Subject> subjects) {
        subjects.forEach(s->{s.getProfiles().add(this);});
        this.subjects = subjects;
    }



}
