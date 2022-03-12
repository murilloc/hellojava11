package com.packt.objectsutility;

import java.util.Objects;
import java.util.function.Supplier;

public class RequireNonNullMain {

    public static void main(String[] args) {

        String obj = null;

        try {
            Objects.requireNonNull(obj);

        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            Objects.requireNonNull(obj, "Parameter object is null");
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }


        Supplier<String> supplier = () -> "Message";
        try{
            Objects.requireNonNull(obj,supplier);
        }catch (NullPointerException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println(Objects.requireNonNullElse(obj, "Default value"));

        Supplier<Integer> integerSupplier = () -> 42;
        try{
            System.out.println(Objects.requireNonNullElseGet(obj, integerSupplier));
        }catch (NullPointerException ex){
            System.out.println(ex.getMessage());
        }






    }


}
