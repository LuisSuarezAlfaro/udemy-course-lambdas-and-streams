package com.debuggeando_ideas.curso.utilFunction;

import lombok.ToString;

import java.io.*;
import java.util.Arrays;
import java.util.function.Function;

public class ExampleFunction2 {

    static Function<Persona, ByteArrayOutputStream> serializer = p -> {
        ByteArrayOutputStream inMemoryBytes = new ByteArrayOutputStream();
        try(ObjectOutputStream outputStream = new ObjectOutputStream(inMemoryBytes)){
            outputStream.writeObject(p);
            outputStream.flush();
        }catch (IOException ioe){
            System.out.println(ioe.getMessage());
        }
        return inMemoryBytes;
    };

    static Function<ByteArrayInputStream, Persona> deserializer = bais -> {
        try(ObjectInputStream objectInputStream = new ObjectInputStream(bais)){
            return (Persona) objectInputStream.readObject();
        }catch (IOException | ClassNotFoundException e){
            throw new RuntimeException(e.getMessage());
        }
    };

    public static void main(String[] args) {
        ByteArrayOutputStream objectSerializable = serializer.apply(new Persona("Luis", 25));
        System.out.println(Arrays.toString(objectSerializable.toByteArray()));

        Persona objectoDeserializado = deserializer.apply(new ByteArrayInputStream(objectSerializable.toByteArray()));
        System.out.println(objectoDeserializado);
    }

}

@ToString
class Persona implements Serializable{

    private String name;
    private Integer age;

    public  Persona(String name, Integer age){
        this.name = name;
        this.age = age;
    }

}
