package com.debuggeando_ideas.curso.referenciaMetodos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ObjectMetodoReferencia {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>(10);
        IntStream repetir = IntStream.range(1,11);
        //repetir.forEach(i -> System.out.println(i));
        //repetir.forEach(i -> numeros.add(i));
        repetir.forEach(numeros::add);
        System.out.println(numeros);

    }
}
