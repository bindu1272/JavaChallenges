package com.programs.Challenges;
import java.util.ArrayList;
//Create a function that finds each number in the given array that is greater than every number that comes after it. Your solution should return an array of the numbers
//
//        leader([2, 3, 20, 15, 8, 3]) ➞ [20, 15, 8, 3]
//
//        leader([2, 3, 20, 15, 8, 25, 3]) ➞ [25, 3]
public class LargestArray {
    public ArrayList<Integer> largeArray(int array[]){
        ArrayList<Integer> array1 = new ArrayList<>();
        int max = 0,x=0;
//        for(int i=0;i<array.length;i++){
//            if(array[i]>max){
//                max = array[i];
//                x = i;
//            }
//        }
//        for(int i=0;i<array.length;i++){
//            if(i>=x){
//                array1.add(array[i]);
//            }
//        }
        for(int i=0;i<array.length;i++){
            x = 0;
            for(int j=i+1;j<array.length;j++) {
                if (array[i] < array[j]) {
                    x = 1;
                    break;
                }
            }
            if (x == 0) {
                array1.add(array[i]);
            }
        }
        return array1;
    }
    public static void main(String[] args) {
        LargestArray largestArray = new LargestArray();
        int arr[] = new int[]{2,3,20,15,8,25,3};
        ArrayList<Integer> arr2 = largestArray.largeArray(arr);
        for(Integer y : arr2){
            System.out.print(y+" ");
        }
    }
}
