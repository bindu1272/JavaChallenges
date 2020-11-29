package Basics;
import java.util.ArrayList;
import java.util.Collections;
public class MyCollectionSortNumerical {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(12);
        arr.add(20);
        arr.add(5);
        Collections.sort(arr);
        for(Integer i : arr){
            System.out.println(i);
        }
    }
}
