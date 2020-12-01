package com.programs.Challenges;
//Create a function that will recursively count the number of digits of a number.
// Conversion of the number to a string is not allowed, thus, the approach is recursive.
//        digitsCount(0) ➞ 1
//
//        digitsCount(12345) ➞ 5
//
//        digitsCount(1289396387328L) ➞ 13

public class DigitsRecursive {
    static  int digitsRecursion(long n){
         int count =0;
        if(n==0){
            return count;
        }
        else{
            count = 1;
           return count + digitsRecursion(n/10);
        }
    }
    public static void main(String[] args) {
        long num = 12345;
        int count =1;
        if(num ==0){
            System.out.print(count);
        }else {
            System.out.print(digitsRecursion(num));
        }
    }
}
