package com.debuggeando_ideas.curso.lambda;


@FunctionalInterface
public interface Math {

    Double ejecutar(Double a, Double b);

    default Double sum(Double a, Double b){return a + b;}

}
