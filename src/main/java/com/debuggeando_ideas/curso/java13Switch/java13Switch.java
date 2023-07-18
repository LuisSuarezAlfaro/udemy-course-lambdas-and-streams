package com.debuggeando_ideas.curso.java13Switch;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers;

public class java13Switch {

    public static void main(String[] args) {

        var r = switch("UNO"){
            case "UNO" -> 1;
            case "DOS" -> 2;
            case "TRES" -> 3;
            default -> 0;
        };
        System.out.println(r);

    }

}
