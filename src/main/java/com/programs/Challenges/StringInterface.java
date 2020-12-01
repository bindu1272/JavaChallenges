package com.programs.Challenges;
import java.util.ArrayList;
import java.lang.String;
//Create a function that takes an array of strings and returns an array
//        with only the strings that have numbers in them.
//        If there are no strings containing numbers, return an empty array.
class StringNumbers{
    public void myMethod(ArrayList<String> array) {
        int x = 0;
        for (int i = 0; i < array.size(); i++) {
            x = 0;
            String string = array.get(i);
            char str[] = string.toCharArray();
            for(int j=0;j<str.length;j++) {
                if(str[j]>='0'&& str[j]<='9'){
                    x = 1;
                    break;
                }
            }
            if(x==1){
                System.out.println(string);
            }
        }
    }
}
public class StringInterface {
    public static void main(String[] args) {
        StringNumbers stringNumbers = new StringNumbers();
        ArrayList<String> arr = new ArrayList<>();
        arr.add("bindu");
        arr.add("hello");
        arr.add("bindu21");
        arr.add("jyothi3");
        arr.add("hi");
        stringNumbers.myMethod(arr);
    }
}
