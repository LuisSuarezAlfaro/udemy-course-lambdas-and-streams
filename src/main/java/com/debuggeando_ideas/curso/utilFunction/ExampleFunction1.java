package com.debuggeando_ideas.curso.utilFunction;

import java.util.function.Function;

public class ExampleFunction1 {

    static Function<Integer, Integer> multiply = n -> n * 10;
    static Function<Integer, Integer> sum = n -> n + 10;

    static Function<Integer, Integer> addThenMultiply = multiply.andThen(sum);

    static Function<Integer, Integer> composeMultiply = multiply.compose(sum);

    public static void main(String[] args) {
        System.out.println(multiply.apply(5));
        System.out.println(sum.apply(5));

        //1*10=10+10=20
        //5*10=50+10=60
        System.out.println(addThenMultiply.apply(5));

        //1+10=11*10=110
        //5+10=15*10=150
        System.out.println(composeMultiply.apply(5));
    }
}
