package com.diptam.SpringBootCRUD.Repository;

import com.diptam.SpringBootCRUD.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ActorRepository extends JpaRepository<Actor, Long> {

    @Query(value = "select * from sakila.actor a where a.first_name = :fname and a.last_name = :lname", nativeQuery = true)
    public List<Actor> findByFirstNameAndLastName(String fname, String lname);

    @Query(value = "select * from sakila.actor a where a.first_name = :fname", nativeQuery = true)
    public List<Actor> findByFirstName(String fname);

}
