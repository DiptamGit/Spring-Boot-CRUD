package com.diptam.SpringBootCRUD.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Entity
public class Actor {

    @Id
    private Long actor_id;

    private String first_name;

    private String last_name;

    private LocalDateTime last_update;
}
