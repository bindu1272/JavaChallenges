package Basics;
import  java.util.Scanner;
public class StdinStdout {
    public static void  main(String args[]){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int num = scan.nextInt();
        System.out.println("myString is :" + str);
        System.out.println("myInt is :"+ num);
    }
}
