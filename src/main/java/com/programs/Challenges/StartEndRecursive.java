package com.programs.Challenges;
//with Recursion
//        Write a function that, given the start startNum and end endNum values, return an array containing all the numbers inclusive to that range
//        inclusiveArray(1, 5) ➞ [1, 2, 3, 4, 5]
//        inclusiveArray(2, 8) ➞ [2, 3, 4, 5, 6, 7, 8]
//        inclusiveArray(10, 20) ➞ [10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
//        inclusiveArray(17, 5) ➞ [17]
public class StartEndRecursive {
    static void startEnd(int start,int end){
        if(start==0){
            System.out.print(0);
        }if(start>=end){
            System.out.print(start+" ");
        }if(start<end){
            System.out.print(start+" ");
            startEnd(start+1,end);
        }

    }
    public static void main(String[] args) {
        int start = 17;
        int end = 5;
        startEnd(start,end);
    }
}
