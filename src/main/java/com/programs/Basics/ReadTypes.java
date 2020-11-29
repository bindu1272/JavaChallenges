package Basics;
import java.util.Scanner;
public class ReadTypes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double d = scan.nextDouble();
        String  s = scan.next();
        System.out.println("String is:"+s+",");
        System.out.println("Double :"+ d +",");
        System.out.println("Int:"+n);
    }
}
