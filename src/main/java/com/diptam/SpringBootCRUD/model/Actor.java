package com.diptam.SpringBootCRUD.model;

import lombok.Data;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Data
@Entity
public class Actor {

    private Long actor_id;

    private String first_name;

    private String last_name;

    private LocalDateTime last_update;
}
