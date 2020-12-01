package com.programs.Challenges;
public class LongestSmallestWord {
    String str = "hi hello welcome to javaWorld";
    public static void main(String[] args) {
        LongestSmallestWord longestSmallestWord = new LongestSmallestWord();
        int smallest = 9999 ,largest=0;
        int x=0 ;
        String string[] = longestSmallestWord.str.split(" ");
        for(int i=0;i<string.length;i++){
            if(string[i].length() <= smallest){
                smallest = string[i].length();
                x = i;
            }
        }
        for(int i=0;i<string.length;i++){
            if(x==i){
            System.out.println("largest Word is "+ string[i]);
            }
        }


    }

}
