package com.debuggeando_ideas.curso.utilFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ExamplePredicate {

    static Predicate<Integer> isMayorA100 = n -> n > 100;
    static Predicate<Integer> isMenorA10 = n -> n < 10;

    static Predicate<Integer> estaEntre10y100 = isMayorA100.or(isMenorA10);

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,10,50,100,150,200));
        //numbers.removeIf(n -> n > 100);
        //numbers.removeIf(estaEntre10y100);
        numbers.removeIf(estaEntre10y100.negate());
        System.out.println(numbers);

    }

}
