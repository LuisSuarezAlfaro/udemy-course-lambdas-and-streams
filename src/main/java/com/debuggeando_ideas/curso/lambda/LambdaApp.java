package com.debuggeando_ideas.curso.lambda;

import java.util.List;

public class LambdaApp {

    public static void main(String[] args) {

        /*Math restar = new Math() {
            @Override
            public Double ejecutar(Double a, Double b) {
                return a - b;
            }
        };*/

        Math restar = (a,b) -> a - b;
        System.out.println(restar.ejecutar(15.0, 5.0));

        Math multiplicar = (a,b) -> a * b;
        System.out.println(multiplicar.ejecutar(5.0, 5.0));

        Math dividir = (a,b) -> {
            System.out.println("Iniciar dividir");
            return a / b;
        };
        System.out.println(dividir.ejecutar(5.0, 5.0));

        System.out.println(dividir.sum(5.0, 6.0));

        /**
         * Ciclo for con expresiones lambdas
         */

        List<String> ciudades = List.of("Mexico","Colombia","Argentina","Chile","Uruguay");

        for (String c: ciudades){
            System.out.println(c);
        }

        ciudades.forEach(c -> System.out.println(c.toUpperCase()));

    }

}
