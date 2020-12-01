package com.programs.Challenges;
import java.io.CharArrayReader;
import java.util.ArrayList;
import  java.util.Scanner;
//A pandigital number contains all digits (0-9) at least once. Write a function that takes an integer,
//        returning true if the integer is pandigital, and false otherwise.
public class PandigitalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int number = sc.nextInt();
            int array[] = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            int x, y, p = 0;
            ArrayList<Integer> arr = new ArrayList<>();
            while (number > 0) {
                x = number % 10;
                y = number / 10;
                number = y;
                arr.add(x);
            }
            for (int i = 0; i < array.length; i++) {
                p = 1;
                for (int j = 0; j < arr.size(); j++) {
                    if (array[i] == arr.get(j)) {
                        p = 0;
                        break;
                    }
                }
                if (p == 0) {
                    array[i] = -1;
                }
            }
            int count = 0;
            for (Integer q : array) {
                if (q == -1) {
                    count++;
                }
            }
            if (count == 9) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }catch (Exception e){
            System.out.println(" Entered Integer can be out of Max Number ");
        }
    }
}
