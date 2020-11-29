package Strings;

import java.util.Scanner;

public class MyStringBuilder {
    public static void main(String[] args) {
        String str = "bindu";
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder s = new StringBuilder(str);
        s = s.reverse();
        System.out.println(s);
        stringBuilder.replace(0,4,"aaaaa");
        System.out.print(stringBuilder);
        int n=4;
        StringBuilder arr[] = new StringBuilder[n];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i< arr.length;i++){
            arr[i] = new StringBuilder(sc.next());
        }
        for(int i=0;i< arr.length;i++){
            if(arr[i].equals("hi")){
                System.out.println("true");
            }
            System.out.println(arr[i]);
        }


    }
}
