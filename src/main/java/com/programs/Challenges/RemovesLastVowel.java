package com.programs.Challenges;
import java.util.ArrayList;
import java.util.List;
//Write a function that removes the last vowel in each word in a sentence.
//        removeLastVowel("Those who dare to fail miserably can achieve greatly.")
//        ➞ "Thos wh dar t fal miserbly cn achiev gretly."
public class RemovesLastVowel {
    public static void main(String[] args) {
        String str = "Those who dare to fail miserably can achieve greatly";
        String string[] = str.split(" ");
        String temp = "";
        int k=0;
        for(int i=0;i< string.length;i++) {
            temp = string[i];
            char ch[] = temp.toCharArray();
            int x = 0;
            for (int j=ch.length-1;j>=0; j--) {
                if (ch[j] == 'a' || ch[j] == 'e' || ch[j] == 'i' || ch[j] == 'o' || ch[j] == 'u') {
                        ch[j] = '*';
                        break;
                }
            }
            for(char y : ch){
                if(y!='*')
                    System.out.print(y);
            }
            System.out.print(" ");
        }
    }
}
