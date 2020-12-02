package com.programs.Challenges;
//Write a function that returns the longest non-repeating substring for a string input.
//        longestNonrepeatingSubstring("abcabcbb") ➞ "abc"
//        longestNonrepeatingSubstring("aaaaaa") ➞ "a"
//        longestNonrepeatingSubstring("abcde") ➞ "abcde"
//        longestNonrepeatingSubstring("abcda") ➞ "abcd"
//        Notes
//        If multiple substrings tie in length, return the one which occurs first.
public class LongestNonRepeating {
    public static void main(String[] args) {
//        String str = "abcabcbb";
//        String str = "aaaaaa";
//        String str = "abcde";
        String str = "abcda";
        char ch[] = str.toCharArray();
        int x =0;
        for(int i=0;i<ch.length;i++){
            for(int j=1;j< ch.length;j++){
                if(ch[i]==ch[j]){
                    x = j;
                    break;
                }
            }
            break;
        }
        for(int i=0;i<ch.length;i++){
            if(i<x){
                System.out.print(ch[i]);
            }if(x==0){
                System.out.print(ch[i]);
            }
        }
    }
}
