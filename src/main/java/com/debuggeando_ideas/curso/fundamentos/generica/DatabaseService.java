package com.debuggeando_ideas.curso.fundamentos.generica;

import java.util.List;

public interface DatabaseService<T> {

    T getById(Long id);
    List<T> getAllRecords();

}
