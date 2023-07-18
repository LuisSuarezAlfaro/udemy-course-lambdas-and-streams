package com.debuggeando_ideas.curso.fundamentos.generica;

public class App {

    public static void main(String[] args) {

        ProductDB pDB = new ProductDB();
        EmployeeDB eDB = new EmployeeDB();

        System.out.println(pDB.getById(2L));
        System.out.println(eDB.getById(1L));
    }

}
