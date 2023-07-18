package com.debuggeando_ideas.curso.lambdaReales;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambdas {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4,3,6,8,7,5,8,10);
        numbers.sort((a,b) -> a - b);
        System.out.println(numbers);

        List<String> names = Arrays.asList("Max", "Alex", "Opal");
        //names.sort((a, b) -> a.compareTo(b));
        names.sort(String::compareTo);
        System.out.println(names);

        names.sort(Comparator.reverseOrder());
        System.out.println(names);

        List<Persona> personas = Arrays.asList(
                new Persona("Monica", 35),
                new Persona("Luis", 33),
                new Persona("Fanny", 60),
                new Persona("Johana", 35)
        );
        personas.sort(Comparator.comparingInt(Persona::getAge));
        System.out.println(personas);

        personas.sort(Comparator.comparingInt(Persona::getAge)
                .thenComparing(Persona::getName));
        System.out.println(personas);

    }

}

@Data
@AllArgsConstructor
class Persona{
    private String name;
    private Integer age;
}
