package com.debuggeando_ideas.curso.streams;

import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamFinalOperadores {

    public static void main(String[] args) {

        Stream<Videogame> videogames = Database.videogames.stream();
        //operadorCount(videogames);
        //operadorForEach(videogames);
        //operadorAnyMatch(videogames);
        //operadorAllMatch(videogames);
        //operadorNoneMatch(videogames);
        //operadorFindFirst(videogames);
        //operadorFindAny(videogames);
        //operadorReduce(videogames);
        //operadorMax(videogames);
        operadorMin(videogames);
    }

    static void operadorCount(Stream<Videogame> stream){
        System.out.println(stream.count());
    }

    static void operadorForEach(Stream<Videogame> stream){
        stream.forEach(System.out::println);
    }

    static void operadorAnyMatch(Stream<Videogame> stream){
        boolean r = stream.anyMatch(v -> v.getTotalSold() > 1);
        System.out.println(r);
    }

    static void operadorAllMatch(Stream<Videogame> stream){
        boolean r = stream.allMatch(v -> v.getTotalSold() > 150);
        System.out.println(r);
    }
    static void operadorNoneMatch(Stream<Videogame> stream){
        boolean r = stream.noneMatch(v -> v.getReviews().isEmpty());
        System.out.println(r);
    }

    static void operadorFindFirst(Stream<Videogame> stream){
        Optional<Videogame> r = stream.findFirst();
        System.out.println(r.orElseThrow());
    }

    static void operadorFindAny(Stream<Videogame> stream){
        Optional<Videogame> r = stream.findAny();
        System.out.println(r.orElseThrow());
    }

    static void operadorReduce(Stream<Videogame> stream){
        /**
         * Con descuento
         */
        Optional<Integer> r = stream
                .filter(Videogame::getIsDiscount)
                        .map(Videogame::getTotalSold)
                                .reduce(Integer::sum);
                                //.reduce((a,b) -> a + b);

        /**
         * Sin descuento
         */
        /*Optional<Integer> r = stream
                .filter(v -> !v.getIsDiscount())
                .map(Videogame::getTotalSold)
                .reduce(Integer::sum);
        */

        System.out.println(r.orElseThrow());
    }

    static void operadorMax(Stream<Videogame> stream){
        Optional<Videogame> r = stream.max(Comparator.comparing(Videogame::getName));
        System.out.println(r.orElseThrow().getName());
    }

    static void operadorMin(Stream<Videogame> stream){
        Optional<Videogame> r = stream.min(Comparator.comparing(Videogame::getName));
        System.out.println(r.orElseThrow().getName());
    }

}
