package com.debuggeando_ideas.curso.referenciaMetodos;

import java.util.function.BiPredicate;

public class AlbitrarioMetodoReferencia {

    public static void main(String[] args) {
        boolean isEquals = false;

        BiPredicate<String, String> equals = (s1, s2) -> s1.equals(s2);
        isEquals = equals.test("a","a");
        System.out.println(isEquals);

        BiPredicate<String, String> equals2 = String::equals;
        isEquals = equals2.test("b","a");
        System.out.println(isEquals);

    }

}
