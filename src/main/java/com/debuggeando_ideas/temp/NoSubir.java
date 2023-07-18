package com.debuggeando_ideas.temp;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class NoSubir {

    public static void main(String[] args) {

        range();
        metodosReferencia();
        constructorMetodosReferencia();
        arbitraryMetodosReferencia();



    }

    private static void range(){
        List<Integer> numbers = new ArrayList<>(10);
        IntStream repeat = IntStream.range(1, 11);
        //repeat.forEach(i -> numbers.add(i));
        repeat.forEach(numbers::add);
        System.out.println(numbers);
    }

    private static void metodosReferencia(){
        //System.out.println(UUID.randomUUID().toString());
        //Supplier<UUID> getToken = () -> UUID.randomUUID();
        Supplier<UUID> getToken = UUID::randomUUID;
        System.out.println(getToken.get());

    }

    private static void constructorMetodosReferencia(){
        //Supplier<MyObject> myObjectSupplier = () -> new MyObject();
        Supplier<MyObject> myObjectSupplier = MyObject::new;
        System.out.println(myObjectSupplier.get());
    }

    private static void arbitraryMetodosReferencia(){
        //BiPredicate<String, String> equals = (s1, s2) -> s1.equals(s2);
        BiPredicate<String, String> equals = String::equals;
        boolean isEquals = equals.test("a", "a");
        System.out.println(isEquals);
    }

}

@ToString

class MyObject{
    private String string;
    private Integer num;

    MyObject(){
        this.string = UUID.randomUUID().toString();
        this.num = new Random().nextInt(1000);
    }

}
