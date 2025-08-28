package org.example.mapping.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "Student_Name")

    String name;

    @OneToOne(mappedBy = "student",cascade = CascadeType.PERSIST)
    private Profile profile;


    public void setProfile(Profile profile) {
        profile.setStudent(this);
        this.profile = profile;
    }

}
