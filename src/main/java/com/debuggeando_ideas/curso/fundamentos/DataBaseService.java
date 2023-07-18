package com.debuggeando_ideas.curso.fundamentos;

import java.util.List;

public interface DataBaseService {

    String getById(Long id);

    List<String> getAllRecords();

}
