package Basics;
import  java.util.Scanner;
public class ConvertString {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String str = Integer.toString(num);
        if(num == Integer.parseInt(str)){
            System.out.println("Good Job");
        }else {
            System.out.println("wrong answer");
        }

    }

}
