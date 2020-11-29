package Basics;
import java.util.Scanner;
public class SumRecursive {
    static int sumRecursive(int num){
        if(num>=1){
            return  num + sumRecursive(num-1);
        }else{
            return 0;
        }
    }
    public static void main(String args[]){
        System.out.println("enter the number to sum of numbers");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result = sumRecursive(n);
        System.out.println(result);
    }
}
