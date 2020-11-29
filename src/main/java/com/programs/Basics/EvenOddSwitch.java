package Basics;
import java.util.Scanner;
public class EvenOddSwitch{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        switch (num%2){
            case 0 :
                System.out.println("even");
                break;
            case 1 :
                System.out.println("odd");
                break;
            default:
                System.out.println("neither even nor odd Number");
        }
    }
}