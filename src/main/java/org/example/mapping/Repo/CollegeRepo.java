package org.example.mapping.Repo;

import org.example.mapping.Model.College;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollegeRepo extends JpaRepository<College,Integer> {
}
