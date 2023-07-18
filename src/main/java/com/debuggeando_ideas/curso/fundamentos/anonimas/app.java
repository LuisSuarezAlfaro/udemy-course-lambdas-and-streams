package com.debuggeando_ideas.curso.fundamentos.anonimas;

import com.debuggeando_ideas.curso.fundamentos.generica.DatabaseService;
import com.debuggeando_ideas.curso.fundamentos.generica.Employee;
import com.debuggeando_ideas.curso.fundamentos.generica.Product;

import java.util.List;

public class app {

    public static void main(String[] args) {

        System.out.println(Product.class.getName());
        System.out.println(Employee.class.getName());
        System.out.println(String.class.getName());

        DatabaseService<String> dbAnonimo = new DatabaseService<String>() {
            @Override
            public String getById(Long id) {
                return null;
            }

            @Override
            public List<String> getAllRecords() {
                return null;
            }
        };

        System.out.println(dbAnonimo.getClass().getName());

    }

}
