package com.diptam.SpringBootCRUD.Repository;

import com.diptam.SpringBootCRUD.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor, Long> {
}
