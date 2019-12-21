package com.diptam.SpringBootCRUD.Repository;

import com.diptam.SpringBootCRUD.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ActorRepository extends JpaRepository<Actor, Long> {

    @Query("select * from sakila.actor a where a.first_name = ?1 and a.last_name = ?2")
    public List<Actor> findByFirstNameAndLastName(String fname, String lname);
}
