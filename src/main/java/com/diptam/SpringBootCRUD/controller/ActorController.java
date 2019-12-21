package com.diptam.SpringBootCRUD.controller;

import com.diptam.SpringBootCRUD.model.Actor;
import com.diptam.SpringBootCRUD.model.Product;
import com.diptam.SpringBootCRUD.service.ActorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/actors")
@Slf4j
@RequiredArgsConstructor
public class ActorController {

    @Autowired
    private final ActorService actorService;

    @GetMapping
    public ResponseEntity<List<Actor>> findAll(){
        return ResponseEntity.ok(actorService.findAll());
    }

    @GetMapping("/byName")
    public ResponseEntity<List<Actor>> findByFirstAndLastName(@RequestParam("firstName") String fname,
                                                              @RequestParam( required = false, value = "lastName") Optional<String> lname){
        log.info("Request : "+fname+" : "+lname);
        if (lname.isPresent()){
            return ResponseEntity.ok(actorService.findByFirstAndLastName(fname, lname.toString()));
        }else {
            return ResponseEntity.ok(actorService.findByFirstName(fname));
        }

    }
}
