package com.programs.Challenges;

import java.util.ArrayList;
//It's time to send and receive secret messages.
//
//        Create two functions that take a string and an array and returns a coded or decoded message.
//
//        The first letter of the string, or the first element of the array represents the Character Code of that letter. The next elements are the differences between the characters: e.g. A + 3 --> C or z -1 --> y.
//
//        encrypt("Hello") ➞ [72, 29, 7, 0, 3]
// H = 72, the difference between the H and e is 29 (upper- and lowercase).
// The difference between the two l's is obviously 0.
//        decrypt([ 72, 33, -73, 84, -12, -3, 13, -13, -68 ]) ➞ "Hi there!"
//        encrypt("Sunshine") ➞ [83, 34, -7, 5, -11, 1, 5, -9]
public class SecretEncryptDecrypt {
    static  ArrayList encryption(String st){
        char ch[] = st.toCharArray();
        ArrayList<Integer> arr = new ArrayList<>();
        int first = ch[0];
        int second;
        System.out.print(first+" ");
        for(int i=0;i< ch.length-1;i++){
            first = ch[i];
            second = ch[i+1];
            arr.add(second-first);
        }
    return arr;
    }
    static void decryption(int arr[]) {
        char ch[] = new char[arr.length];
        ArrayList<Character> cha = new ArrayList<>();
        char first = (char) arr[0];
        int first1;
        int second;
        int sum;
        System.out.print("\n"+first);
        first1 = arr[0];
        second = arr[1];
        sum = first1+second;
        System.out.print((char)sum);
        for (int i = 2; i < arr.length; i++) {
            sum = sum +arr[i];
            System.out.print((char)sum);
        }
    }
    public static void main(String[] args) {
        String str = "Hello";
//        decrypt([ 72, 33, -73, 84, -12, -3, 13, -13, -68 ]) ➞ "Hi there!" 72,105,32,116,104,101,104,101,33
        ArrayList<Integer> array = encryption(str);
        for(Integer i : array){
            System.out.print(i+" ");
        }
        int arr[] = new int[]{72, 33, -73, 84, -12, -3, 13, -13, -68};
        decryption(arr);
    }
}
