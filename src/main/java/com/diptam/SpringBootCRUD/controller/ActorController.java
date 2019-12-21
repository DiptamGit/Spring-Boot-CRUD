package com.diptam.SpringBootCRUD.controller;

import com.diptam.SpringBootCRUD.model.Actor;
import com.diptam.SpringBootCRUD.model.Product;
import com.diptam.SpringBootCRUD.service.ActorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @GetMapping
    public ResponseEntity<List<Actor>> findByFirstAndLastName(@RequestParam("firstName") String fname, @RequestParam("lastName") String lname){
        log.debug("Request : "+fname+" : "+lname);
        return ResponseEntity.ok(actorService.findByFirstAndLastName(fname, lname));
    }
}
