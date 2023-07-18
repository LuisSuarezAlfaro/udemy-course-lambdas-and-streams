package com.debuggeando_ideas.curso.collectors;

import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsPartitions {

    public static void main(String[] args) {
        Stream<Videogame> videogames = Database.videogames.stream();
        Map<Boolean, List<Videogame>> resutl = videogames.collect(Collectors.partitioningBy(
                v -> v.getPrice() > 15.0
        ));
        resutl.forEach((k,v) -> System.out.println(k + " = " + v));

    }
}
