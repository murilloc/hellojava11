package com.packt.objectsutility;

import java.util.List;
import java.util.Objects;

public class CheckIndexMain {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);


        try{
            Objects.checkIndex(5, list.size());
        } catch (IndexOutOfBoundsException ex){
            System.out.println("Check index: Indice fora da faixa");
        }

        try{
            Objects.checkFromIndexSize(1,5, list.size());
        } catch (IndexOutOfBoundsException ex){
            System.out.println("From index size: Indice fora da faixa");
        }

        try{
            Objects.checkFromToIndex(1,5, list.size());
        } catch (IndexOutOfBoundsException ex){
            System.out.println("From to index: Indice fora da faixa");
        }



    }
}
