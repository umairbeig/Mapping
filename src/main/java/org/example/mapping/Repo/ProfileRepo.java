package org.example.mapping.Repo;

import org.example.mapping.Model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepo extends JpaRepository<Profile,Integer> {
}
