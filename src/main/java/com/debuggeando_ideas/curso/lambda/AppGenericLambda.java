package com.debuggeando_ideas.curso.lambda;

import com.debuggeando_ideas.curso.fundamentos.generica.Employee;
import com.debuggeando_ideas.curso.fundamentos.generica.Product;

public class AppGenericLambda {

    public static void main(String[] args) {

        Imprimir<String> imprimirString = string -> System.out.println(string);
        imprimirString.imprimiendo("Hola Mundo");

        Imprimir<Product> imprimirProducto = product -> System.out.println(product);
        Product myProduct = new Product();
        myProduct.setId(1l);
        myProduct.setPrice(100.0);
        myProduct.setName("SmartPhone");
        imprimirProducto.imprimiendo(myProduct);

        Imprimir<Employee> imprimirEmployee = employee -> System.out.println(employee);
        imprimirEmployee.imprimiendo(new Employee());

    }
}
