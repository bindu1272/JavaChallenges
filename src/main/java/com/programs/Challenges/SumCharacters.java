package com.programs.Challenges;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
//getLength([1, [2, 3]]) -> 3
//
//        getLength([1, [2, [3, 4]]]) -> 4
//
//        getLength([1, [2, [3, [4, [5, 6]]]]]) > 6
//
//        getLength([1, [2], 1, [2], 1]) -> 5
//
//        getLength(1) -> 1
public class SumCharacters {
     static int length =0;
    private static void getLength(List array) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getClass().getSimpleName().equals("ArrayList")) {
                System.out.print(array.get(i));
                getLength((List) array.get(i));
            } else {
                length++;
            }
        }
    }
    public static void main(String[] args) {
        List arr = new ArrayList();
        arr.add(1);
        arr.add(Arrays.asList(2,Arrays.asList(3,Arrays.asList(4,5,6))));
        arr.add(7);
        arr.add(Arrays.asList(8,9));
        System.out.println(arr);
        getLength(arr);
        System.out.print(length);
    }
}
