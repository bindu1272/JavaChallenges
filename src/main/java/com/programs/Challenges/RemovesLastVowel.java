package com.programs.Challenges;
import java.util.ArrayList;
import java.util.List;

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
            for (int j = 0; j < ch.length; j++) {
                if (ch[j] == 'a' || ch[j] == 'e' || ch[j] == 'i' || ch[j] == 'o' || ch[j] == 'u') {
                    if(ch[j]==0) {
                        ch[j] = '*';
                        x = 1;
                    }
                }
                System.out.print(ch[j]);
            }
            System.out.print(" ");
        }

    }
}
