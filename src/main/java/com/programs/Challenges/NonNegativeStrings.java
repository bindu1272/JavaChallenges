package com.programs.Challenges;
import java.util.ArrayList;
import java.util.List;
//Create a function that takes an array of non-negative integers and strings and return a new array without the strings.
//
//        filterArray([1, 2, "a", "b"]) ➞ [1, 2]
//
//        filterArray([1, "a", "b", 0, 15]) ➞ [1, 0, 15]
//
//        filterArray([1, 2, "aasf", "1", "123", 123]) ➞ [1, 2, 123]
public class NonNegativeStrings {
    public static void main(String[] args) {
        String str[] = new String[]{"1", "abc", "bb", "0", "15"};
        boolean temp = false;
        List<Integer> array = new ArrayList<>();
        for(int i=0;i<str.length;i++) {
            temp = false;
            char ch[] =str[i].toCharArray();
            for(int j=0;j< ch.length;j++){
                if(!(ch[j]>='0' && ch[j]<='9')){
                    temp = true;
                    break;
                }
            }
            if(!temp){
                array.add(Integer.parseInt(str[i]));
            }
        }
        System.out.println(array);
    }
}
