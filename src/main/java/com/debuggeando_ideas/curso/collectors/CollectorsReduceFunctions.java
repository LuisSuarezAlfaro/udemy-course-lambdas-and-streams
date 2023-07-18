package com.debuggeando_ideas.curso.collectors;

import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsReduceFunctions {

    public static void main(String[] args) {
        Stream<Videogame> videogames = Database.videogames.stream();
        //avg(videogames);
        //sum(videogames);
        join(videogames);
    }


    public static void avg(Stream<Videogame> stream){
        Double avg = stream.collect(Collectors.averagingDouble(Videogame::getPrice));
        System.out.println(avg);
    }

    public static void sum(Stream<Videogame> stream){
        IntSummaryStatistics summaryStatistics = stream.collect(Collectors.summarizingInt(v -> v.getReviews().size()));

        System.out.println(summaryStatistics.getSum());
        System.out.println(summaryStatistics.getMax());
        System.out.println(summaryStatistics.getMin());
        System.out.println(summaryStatistics.getAverage());
    }

    public static void join(Stream<Videogame> stream){
        String stringJoin = stream
                .map(Videogame::toString)
                //.collect(Collectors.joining());
                .collect(Collectors.joining("\n"));

        System.out.println(stringJoin);
    }

}
