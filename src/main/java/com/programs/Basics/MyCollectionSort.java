package Basics;
import java.util.ArrayList;
import java.util.Collections;
public class MyCollectionSort {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("apple");
        arr.add("potato");
        arr.add("brinjal");
        arr.add("guava");
        arr.add("seeds");
        Collections.sort(arr);
        for(String i : arr){
            System.out.println(i);
        }
    }
}
