package com.debuggeando_ideas.curso.utilFunction;

import lombok.ToString;

import java.util.Random;
import java.util.function.Supplier;

public class ExampleSupplier {

    static Supplier<Integer> ramdomInt = () -> new Random().nextInt(100);

    static Supplier<MyProduct> productSupplier = () -> new MyProduct(100,"Smartphone");

    public static void main(String[] args) {
        System.out.println(ramdomInt.get());
        System.out.println(ramdomInt.get());
        System.out.println(ramdomInt.get());

        System.out.println(productSupplier.get());
    }
}

@ToString
class MyProduct{
    Integer precio;
    String nombre;

    public MyProduct(Integer precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }
}
