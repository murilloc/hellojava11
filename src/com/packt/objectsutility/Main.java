package com.packt.objectsutility;

import java.util.Comparator;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        int result = Objects.compare("a", "c", Comparator.naturalOrder());
        System.out.printf("Comparando a e c usando natural order: %s%n", result);

        result = Objects.compare("a", "a", Comparator.naturalOrder());
        System.out.printf("Comparando a e a usando natural order: %s%n", result);

        result = Objects.compare("c", "a", Comparator.naturalOrder());
        System.out.printf("Comparando c e a usando natural order: %s%n", result);

        result = Objects.compare("c", "a", Comparator.reverseOrder());
        System.out.printf("Comparando c e a usando reverse order: %s%n", result);

        result = Objects.compare(3, 5, Comparator.naturalOrder());
        System.out.printf("Comparando inteiros 3  e 5 usando natural order: %s%n", result);

        result = Objects.compare(3, 5, Comparator.reverseOrder());
        System.out.printf("Comparando inteiros 3  e 5 usando reverse order: %s%n", result);

        result = Objects.compare(3, 3, Comparator.reverseOrder());
        System.out.printf("Comparando inteiros 3  e 3 usando reverse order: %s%n", result);

        result = Objects.compare(null, null, Comparator.reverseOrder());
        System.out.printf("Comparando null usando reverse order: %s%n", result);


        //result = Objects.compare(5, null, Comparator.reverseOrder());
        //System.out.printf("Comparando 5 e null usando reverse order: %s%n", result);  return error




    }
}
