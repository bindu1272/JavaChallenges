package com.programs.Challenges;
import java.util.ArrayList;
import java.util.List;
//Create a function that takes an integer argument and returns an array of prime numbers found in the decimal representation of that number.
//        The array should be in acending order. If a prime number appears more than once, every occurance should be listed. If no prime numbers are found, return an empty array.
//        extractPrimes(1) ➞ []
//        extractPrimes(7) ➞ [7]
//        extractPrimes(73) ➞ [3, 7, 73]
//        extractPrimes(1313) ➞ [3, 3, 13, 13, 31, 131, 313]
public class RetrievePrimeInNumber {
    public static void main(String[] args) {
        int number = 73;
        List<String> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        String st = Integer.toString(number);
        for(int i=0;i<st.length();i++){
            for(int j=i;j<st.length();j++){
                list.add(st.substring(i,j+1));
            }
        }
        for(String i : list){
            li.add(Integer.parseInt(i));
        }
        for(Integer i : li) {
            int count = 0;
            if (i == 1) {
                count = count + 1;
            }
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    count = count + 1;
                }
            }
            if (count == 0) {
                list1.add(i);
            }
        }
        int temp;
            for(int i=0;i<list1.size();i++){
                for(int j=i+1;j<list1.size();j++){
                    if(list1.get(i)>list1.get(j)){
                        temp = list1.get(i);
                        list1.set(i,list1.get(j));
                        list1.set(j,temp);
                    }
                }
            }
            System.out.print("[");
            for(Integer i : list1){
                System.out.print(i+" ");
            }
            System.out.print("]");
    }
}
