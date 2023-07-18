package com.debuggeando_ideas.curso;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Nosubir {

    public static void main(String[] args) {

        int[] A = {-6, -91, 1011, -100, 84, -22, 0, 1, 473};

        int maxInt = 0;
        for (int a: A){
            if(a >= 0 && a < 10 ){
                if(maxInt < a){
                    maxInt = a;
                }
            }
        }

        //System.out.println(maxInt);

        List<Integer> integerList = Arrays.asList(-6, -91, 1011, -100, 84, -22, 0, 1, 473);

        Stream<Integer> listInt = integerList.stream().filter(v -> v >= 0 && v < 10);

        int r = integerList.stream().filter(v -> v >= 0 && v < 10).mapToInt(Integer::intValue).max().getAsInt();


        listInt.forEach(System.out::println);

        System.out.println(r);
    }



}
