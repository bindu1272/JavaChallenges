package com.programs.Challenges;
//Create a function that takes an array arr and a number n and returns an array of two integers from arr whose product is that of the number n.
//        twoProduct([1, 2, -1, 4, 5], 20) ➞ [4, 5]
//        twoProduct([1, 2, 3, 4, 5], 10) ➞ [2, 5]
//        twoProduct([100, 12, 4, 1, 2], 15) ➞ []
//        Note:
//        There will be no duplicates.
//        Return an empty array if no match is found.
//        The array can have multiple solutions, so return the first full match that's found
import java.util.ArrayList;
import java.util.List;
public class TwoProductEqualsNumber {
    public static void main(String[] args) {
//        int arr[] = new int[]{1, 2, -1, 4, 5};
        int arr[] = new int[]{1, 2, 3, 4, 5};
//        int arr[] = new int[]{100, 12, 4, 1, 2};
        int num = 10;
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    li.add(arr[j]);
                }
            }
        }
        if(li.size()==0) {
            System.out.print("[");
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] * arr[j] == num) {
                        System.out.print(arr[i] + "," + arr[j]);
                        break;
                    }
                }
            }
            System.out.print("]");
        }else{
            System.out.print("List Have Duplicates");
        }

    }
}
