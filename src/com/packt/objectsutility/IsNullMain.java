package com.packt.objectsutility;

import java.util.Objects;

public class IsNullMain {

    public static void main(String[] args) {
        String obj = null;

        System.out.println(obj == null); //true
        System.out.println(Objects.isNull(obj)); // true
        obj = "";
        System.out.println(obj == null); //false
        System.out.println(Objects.isNull(obj)); // false


        obj = null;
        System.out.println(obj!= null); //true
        System.out.println(Objects.nonNull(obj)); // true
        obj = "";
        System.out.println(obj != null); //false
        System.out.println(Objects.nonNull(obj)); // false




    }
}
