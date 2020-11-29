package Basics;
import java.util.Scanner;
public class Condition {
    public static void  main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num%2 == 0){
            if (num <= 5 && num >= 2 || num >= 20) {
                System.out.println("not Weird");
            }
        }
        if(num%2 == 1 || (num >= 6 && num < 20)){
            System.out.println("Weird");
        }
    }
}
