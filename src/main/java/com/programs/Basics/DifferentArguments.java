package Basics;
import java.util.Scanner;
import java.util.zip.DeflaterInputStream;

public class DifferentArguments {
//    static int addition(int ...num){
//        int sum=0;
//        for(int i :num) {
//            sum = sum + i;
//        }
//        return sum;
//    }
    DifferentArguments(){

    }
    DifferentArguments(int num,int num1){
        int sum=0;
        sum  = num + num1;
        System.out.println(sum);
    }
    DifferentArguments(int num,int num1,int num2){
        int sum=0;
        sum  = num + num1;
        sum = sum + num2;
        System.out.println(sum);
    }
    public static  void  main(String args[]){
        System.out.println("enter the Numbers to add");
        DifferentArguments differentArguments = new DifferentArguments();
        DifferentArguments differentArguments1 = new DifferentArguments(10,20);
        DifferentArguments differentArguments2 = new DifferentArguments(10,20,30);

//        int result1 = addition(10,20,30);
//        int result2 = addition(10,20,30,40);
//        System.out.println(result +"\n"+result1+"\n"+result2);
    }
}
