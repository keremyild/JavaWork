package org.example;

import java.util.Arrays;
import java.util.HashMap;

public class findElement {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int target = 9;
        boolean found = false;
        for (int arr2 : arr) {
            if (arr2 == target) {
                found = true;
                break;
            }


        }
        System.out.println(found);

    }



}
