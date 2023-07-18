package com.debuggeando_ideas.curso.streams;

import com.debuggeando_ideas.util.BasicVideogame;
import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

import java.awt.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOperacionesIntermedias {

    public static void main(String[] args) {

        Stream<Videogame> videogames = Database.videogames.stream();

        //operadorDistinct(videogames);
        //operadorLimit(videogames);
        //operadorSkip(videogames);
        //operadorFilter(videogames);
        //operadorMap(videogames);
        //operacionFlatMap(videogames);
        //OperadorMapVsFlatMap(videogames);
        //operadorPeek(videogames);
        //operadorSort(videogames);
        //operadorTakeWhile(videogames);
        operadorDropWhile(videogames);

    }

    public static void operadorDistinct(Stream<Videogame> stream){
        System.out.println(stream.distinct().count());
    }

    public static void operadorLimit(Stream<Videogame> stream){
        List<Videogame> r = stream.limit(5).collect(Collectors.toList());
        r.forEach(System.out::println);
    }

    public  static void operadorSkip(Stream<Videogame> stream){
        List<Videogame> r = stream.skip(15).collect(Collectors.toList());
        r.forEach(System.out::println);
    }

    public static void operadorFilter(Stream<Videogame> stream){
        List<Videogame> r = stream
                .filter(v -> v.getPrice() > 12.0)
                .filter(v -> !v.getIsDiscount())
                .filter(v -> v.getOfficialWebsite().contains("forza"))
                .collect(Collectors.toList());

        r.forEach(System.out::println);

    }

    public static void operadorMap(Stream<Videogame> stream){
        List<BasicVideogame> basicVideogames = stream
                .map(v -> {
                   return BasicVideogame.builder()
                           .name(v.getName())
                           .price(v.getPrice())
                           .console(v.getConsole()).build();
                })
                .collect(Collectors.toList());
        basicVideogames.forEach(System.out::println);

        System.out.println("--------------------");

        List<String> titles =  basicVideogames.stream()
                .map(BasicVideogame::getName)
                .collect(Collectors.toList());
        titles.forEach(System.out::println);
    }

    public static void operacionFlatMap(Stream<Videogame> stream){
        //var r = stream.map(Videogame::getReviews).collect(Collectors.toList());
        //r.forEach(System.out::println);
        var r2 = stream.flatMap(v -> v.getReviews().stream()).collect(Collectors.toList());
        r2.forEach(System.out::println);
    }

    public static void OperadorMapVsFlatMap(Stream<Videogame> stream){
        //var totalReviews = stream.map(v -> v.getReviews().size()).collect(Collectors.toList());
        //System.out.println(totalReviews.size());
        Long totalReviews = stream.flatMap(v -> v.getReviews().stream()).count();
        System.out.println(totalReviews);
    }

    public static void operadorPeek(Stream<Videogame> stream){
        //stream.peek(System.out::println).collect(Collectors.toList());
        stream.peek(v -> v.setName("")).forEach(System.out::println);
    }

    public static void operadorSort(Stream<Videogame> stream){
        /*List<Videogame> listSorted = stream
                .sorted(Comparator
                        .comparingInt(v -> v.getReviews().size()))
                .collect(Collectors.toList());*/

        List<Videogame> listSorted = stream
                .sorted(Comparator
                        .comparingDouble(v -> v.getPrice()))
                .collect(Collectors.toList());

        listSorted.forEach(System.out::println);
    }

    public static void operadorTakeWhile(Stream<Videogame> stream){
        List<Videogame> r = stream
                .sorted(Comparator
                        .comparing(Videogame::getName))
                .takeWhile(v -> !v.getName().startsWith("M"))
                .collect(Collectors.toList());

        r.forEach(System.out::println);
    }

    public static void operadorDropWhile(Stream<Videogame> stream){
        List<Videogame> r = stream
                .sorted(Comparator
                        .comparing(Videogame::getName))
                .dropWhile(v -> !v.getName().startsWith("M"))
                .collect(Collectors.toList());

        r.forEach(System.out::println);
    }

}
