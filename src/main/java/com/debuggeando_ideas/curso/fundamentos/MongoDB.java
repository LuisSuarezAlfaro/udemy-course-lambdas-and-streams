package com.debuggeando_ideas.curso.fundamentos;

import java.util.List;

public class MongoDB implements DataBaseService{


    @Override
    public String getById(Long id) {
        return "Getting data from Mongo with id " + id;
    }

    @Override
    public List<String> getAllRecords() {
        return List.of("Hello World");
    }
}
