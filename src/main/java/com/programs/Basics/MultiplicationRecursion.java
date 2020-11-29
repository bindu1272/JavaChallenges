package Basics;
import java.util.Scanner;
public class MultiplicationRecursion {
    static int multiplicationRecursive(int num){
        if(num>=1){
            return num * multiplicationRecursive(num-1);
        }else{
            return 1;
        }
    }
    public static void main(String args[]){
        System.out.println("enter the number to Multiply it should be positive number");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result = multiplicationRecursive(n);
        System.out.println(result);
    }
}
