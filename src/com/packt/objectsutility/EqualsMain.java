package com.packt.objectsutility;

import java.util.Objects;

public class EqualsMain {

    public static void main(String[] args) {
        String o1 = "o";
        String o2 = "o";

        System.out.println(Objects.equals(o1, o2)); // true
        System.out.println(Objects.equals(null, null)); //true

        Integer[] ints1 = {1, 2, 3, 4};
        Integer[] ints2 = {1, 2, 3, 4};
        System.out.println(Objects.equals(ints1,ints2)); // false


        System.out.println(Objects.deepEquals(ints1,ints2)); // true

        Integer[][] iints1 = {{1,2,3}, {4,5,6}};
        Integer[][] iints2 = {{1,2,3}, {4,5,6}};
        Integer[][] iints3 = {{1,2,3}, {5,4,6}};

        System.out.println(Objects.equals(iints1, iints2)); //false
        System.out.println(Objects.deepEquals(iints1, iints2)); // true
        System.out.println(Objects.deepEquals(iints1, iints3)); // true











    }
}
