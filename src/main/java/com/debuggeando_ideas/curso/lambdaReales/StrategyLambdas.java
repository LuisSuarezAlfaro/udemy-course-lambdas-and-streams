package com.debuggeando_ideas.curso.lambdaReales;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;

public class StrategyLambdas {

    public static void main(String[] args) {

        var product1 = Product.builder().id(1L).name("Bear").price(150.0).userType("BASIC").build();
        var product2 = Product.builder().id(1L).name("Bear").price(150.0).userType("PLUS").build();
        var product3 = Product.builder().id(1L).name("Bear").price(150.0).userType("PRIME").build();

        var productos = List.of(product1,product2,product3);

        productos.forEach(p -> {
            switch (p.getUserType()){
                case "BASIC": p.setDisCountStretegy(Strategies.basicDiscount); break;
                case "PLUS": p.setDisCountStretegy(Strategies.plusDiscount); break;
                case "PRIME": p.setDisCountStretegy(Strategies.primeDiscount); break;
            }
        });

        productos.forEach(p -> {
            System.out.println("Price: " + p.getPrice() +
                    " User Type: " + p.getUserType() +
                    " Discount: " + p.getDisCountStretegy().get(p.getPrice()));
        });
    }
}

@FunctionalInterface
interface  ApplyDisCountStretegy{
    Double get(Double price);
}

class Strategies{
    static ApplyDisCountStretegy basicDiscount = p -> p * 0.02;
    static ApplyDisCountStretegy plusDiscount = p -> p * 0.05;
    static ApplyDisCountStretegy primeDiscount = p -> p * 0.08;
}

@Data
@ToString
@Builder
class Product{
    private Long id;
    private String userType;
    private String name;
    private Double price;
    private ApplyDisCountStretegy disCountStretegy;
}

