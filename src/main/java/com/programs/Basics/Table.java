package Basics;
import  java.util.Scanner;
public class Table {
    public  static  void main(String args[]){
        System.out.println("Enter the number for Multiplication");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num + "*" + i + "="+ num*i);
        }
    }
}
