package com.packt.objectsutility;

import java.util.Objects;

public class HashCodeMain {
    public static void main(String[] args) {
        System.out.println(Objects.hashCode(null));
        System.out.println(Objects.hashCode("abcd"));
        System.out.println(Objects.hash("abcd"));


        String[] arr = {"def", "abc",};
        System.out.println(Objects.hash(arr));

        String[] arr2 = {"abc", "def"};
        System.out.println(Objects.hash(arr2));

        Object[] objects = {"a", 42, "Letra C", 'd'};
        System.out.println(Objects.hash(objects));
        System.out.println(Objects.hash("a", 42, "Letra C", 'd'));



    }

}
