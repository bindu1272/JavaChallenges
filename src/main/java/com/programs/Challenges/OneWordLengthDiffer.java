package com.programs.Challenges;
//Write a function that returns true if exactly one word in the array differs in length from the rest. Return false in all other cases.
//        oddOneOut(["silly", "mom", "let", "the"]) ➞ true
//        oddOneOut(["swanky", "rhino", "moment"]) ➞ true
//        oddOneOut(["the", "them", "theme"]) ➞ false
//        oddOneOut(["very", "to", "an", "some"]) ➞ false
import java.util.ArrayList;
import java.util.List;
public class OneWordLengthDiffer {
    public static void main(String[] args) {
        String str[] = new String[]{"silly", "mom", "let", "the"};
//        String str[] = new String[]{"swanky", "rhino", "moment"};
//        String str[] = new String[]{"the", "them", "theme"};
//        String str[] = new String[]{"very", "to", "an", "some"};
        int arr[] = new int[str.length];
        List<String> list1 = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i< str.length;i++){
            arr[i] = str[i].length();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    list.add(arr[j]);
                }
            }
        }
        for(int i=0;i<list.size();i++){
            for(int j=0;j<str.length;j++){
                if(list.get(i)== str[j].length()){
                    str[j] = "*";
                }
            }
        }
        for(String i : str){
            if(i!="*"){
                list1.add(i);
            }
        }
        if(list1.size()==1){
            System.out.print("true");
        }else{
            System.out.print("false");
        }
    }
}
