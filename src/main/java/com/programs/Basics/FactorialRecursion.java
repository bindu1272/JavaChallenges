package Basics;
import java.util.Scanner;
public class FactorialRecursion {
    int factorialRecursion(int num){
        if(num>0){
            return  num * factorialRecursion(num-1);
        }else {
            return 1;
        }
    }
     public static void main(String[] args) {
        System.out.println("enter the number for factorial");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int result = factorialRecursion.factorialRecursion(n);
        System.out.println(result);
    }
}
