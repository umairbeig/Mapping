package org.example.mapping.Repo;

import org.example.mapping.Model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepo extends JpaRepository<Subject,Integer> {
}
