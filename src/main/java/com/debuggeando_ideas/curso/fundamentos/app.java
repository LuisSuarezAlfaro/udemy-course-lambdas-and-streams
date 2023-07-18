package com.debuggeando_ideas.curso.fundamentos;

import javax.xml.crypto.Data;

public class app {

    public static void main(String[] args) {
        DataBaseService mongo = new MongoDB();
        DataBaseService postgres = new PostgresDB();

        System.out.println(mongo.getById(20L));
        System.out.println(postgres.getById(20L));


    }

}
