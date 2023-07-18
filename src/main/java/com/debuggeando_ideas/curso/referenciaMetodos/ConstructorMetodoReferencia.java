package com.debuggeando_ideas.curso.referenciaMetodos;

import lombok.ToString;

import java.util.Random;
import java.util.UUID;
import java.util.function.Supplier;

public class ConstructorMetodoReferencia {

    public static void main(String[] args) {

        Supplier<MyObject> myObjectSupplier = () -> new MyObject();
        System.out.println(myObjectSupplier.get());

        Supplier<MyObject> myObjectSupplier2 = MyObject::new;
        System.out.println(myObjectSupplier2.get());

    }
}

@ToString
class MyObject{

    private String string;
    private Integer num;

    public MyObject() {
        this.string = UUID.randomUUID().toString();
        this.num = new Random().nextInt(1000);
    }
}
