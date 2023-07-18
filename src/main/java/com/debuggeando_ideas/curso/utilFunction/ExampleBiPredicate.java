package com.debuggeando_ideas.curso.utilFunction;

import java.util.function.BiPredicate;

public class ExampleBiPredicate {

    static BiPredicate<String, String> miIgual = (s1,s2) -> s1.concat(s2).equals("HolaMundo");

    public static void main(String[] args) {
        String s1 = "Hola";
        String s2 = "Mundo";
        System.out.println(miIgual.test(s1,s2));
    }
}
