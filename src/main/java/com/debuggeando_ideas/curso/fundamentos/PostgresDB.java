package com.debuggeando_ideas.curso.fundamentos;

import java.util.List;

public class PostgresDB implements DataBaseService{
    @Override
    public String getById(Long id) {
        return "Getting data form Postgres with id " + id;
    }

    @Override
    public List<String> getAllRecords() {
        return List.of("Hello World for postgres");
    }
}
