package com.programs.Challenges;
import java.util.Scanner;
//Write a function that inserts a white space between every instance of a lower character followed
//        immediately by an upper character.
//        BinduIsAGoodGirl -> Bindu Is A Good Girl
public class UpperCaseCharacter {
    public void upperConvertion(String str){
        char arr[] = str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(i!=0 && Character.isUpperCase(arr[i])){
//            if(i!=0 && arr[i]>='A' && arr[i]<='Z'){
//            if(i!=0 && arr[i]>=65 && arr[i]<=90){
                    System.out.print(" ");
            }
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "BinduIsAGoodGirl";
        UpperCaseCharacter upperCaseCharacter = new UpperCaseCharacter();
        upperCaseCharacter.upperConvertion(str);
    }
}
