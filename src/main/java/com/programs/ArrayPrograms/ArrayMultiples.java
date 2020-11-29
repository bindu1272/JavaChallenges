package com.programs.ArrayPrograms;

import java.util.ArrayList;

public class ArrayMultiples {
    public static void arrayMultiples(int arr,int number){
        ArrayList<Integer> li = new ArrayList<Integer>();
            for(int i=1;i<=number;i++){
                li.add(arr*i);
            }
            System.out.println(li);
    }
    public static void main(String[] args) {
        int n = 12;
        arrayMultiples(n,5);
    }
}
