package com.debuggeando_ideas.curso.utilFunction;

import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class ExampleUnaryOperation {

    static Function<String, String> funToUpper = s -> s.toUpperCase();

    static UnaryOperator<String> unaryToUpper = String::toUpperCase;

    static UnaryOperator<Integer> unaryInt = n -> n * n;

    static IntUnaryOperator unaryInt2 = n -> n * n;

    public static void main(String[] args) {
        String arg = "lambdas";
        System.out.println(funToUpper.apply(arg));

        System.out.println(unaryToUpper.apply(arg));

        System.out.println(unaryInt.apply(3));

        System.out.println(unaryInt2.applyAsInt(2));

    }

}
