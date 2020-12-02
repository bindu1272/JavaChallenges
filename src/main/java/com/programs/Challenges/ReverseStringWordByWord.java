package com.programs.Challenges;
import java.util.ArrayList;
import java.util.List;
//Given an input string, reverse the string word by word.
//        reverseWords("the sky is blue") ➞ "blue is sky the"
//        reverseWords("  hello world!  ") ➞ "world! hello"
//        reverseWords("a good   example") ➞ "example good a"
public class ReverseStringWordByWord {
    public static void main(String[] args) {
//        String str = "the sky is blue";
        String str = "hello world!";
//        String str = "a good   example";
        List<String> list = new ArrayList<>();
        String st[] = str.split(" ");
        for(int i=st.length-1;i>=0;i--){
                list.add(st[i]);
        }
        for(String i : list){
            System.out.print(i+" ");
        }
    }
}
