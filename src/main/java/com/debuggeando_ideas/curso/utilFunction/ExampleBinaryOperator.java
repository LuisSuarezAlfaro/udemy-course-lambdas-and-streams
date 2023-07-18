package com.debuggeando_ideas.curso.utilFunction;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class ExampleBinaryOperator {

    public static void main(String[] args) {

        BiFunction<String, String, String> normalizarFuncion = (a,b) -> a.toUpperCase() + " - " + b.toLowerCase();
        System.out.println(normalizarFuncion.apply("hola","MUNDO"));

        BinaryOperator<String> normalizar = (a,b) -> a.toUpperCase() + " - " + b.toLowerCase();
        System.out.println(normalizar.apply("hola","MUNDO"));

    }

}
