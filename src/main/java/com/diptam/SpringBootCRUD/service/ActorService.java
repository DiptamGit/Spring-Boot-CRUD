package com.diptam.SpringBootCRUD.service;

import com.diptam.SpringBootCRUD.Repository.ActorRepository;
import com.diptam.SpringBootCRUD.model.Actor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ActorService {

    @Autowired
    private final ActorRepository actorRepository;

    public List<Actor> findAll(){
        return actorRepository.findAll();
    }
}
