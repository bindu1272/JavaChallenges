package Basics;
import java.util.Scanner;
public class Parallelogram {
//    public void area(int length,int breadth){
//        if(length<100 && breadth <100){
//            int area = length * breadth;
//            System.out.println("Area of parallelogram is "+area);
//        }else{
//            System.out.println("Length and Breadth must be positive");
//        }
//    }
    static int h,b,area;
    static {
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        b = sc.nextInt();
        if(h<=100 && b<=100 && (h>0 && b>0)){
            area = 1;
        }else {
            System.out.println("hjkkjhj");
        }
    }
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the length of a parallelogram");
//        int num = scan.nextInt();
//        System.out.println("enter the breadth of a parallelogram");
//        int num1 = scan.nextInt();
//        Parallelogram para = new Parallelogram();
//        para.area(num,num1);
        if(area==1){
            System.out.println(h*b);
        }

    }
}
