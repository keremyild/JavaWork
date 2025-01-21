package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListReverse {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println( "Orjinal liste "+ list);

        Collections.reverse(list);

        System.out.println("Tersine Çevrilmiş " +list );
    }
}
