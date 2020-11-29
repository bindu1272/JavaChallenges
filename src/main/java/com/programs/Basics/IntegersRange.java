package Basics;
import org.w3c.dom.ranges.RangeException;

import java.util.Scanner;
public class IntegersRange {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long array[] = new long[n];
        try{
            int x = 10/0;
            for(int i=0;i<n;i++) {
                array[i] = scan.nextLong();
            }
            for(int i=0;i<n;i++){
                System.out.println(array[i] + "can be fitted in");
                if(array[i] <= Byte.MAX_VALUE && array[i] >= Byte.MIN_VALUE){
                    System.out.println("* byte");
                }
                if (array[i] <= Short.MAX_VALUE && array[i] >= Short.MIN_VALUE){
                    System.out.println("* short");
                }
                if (array[i] <= Integer.MAX_VALUE && array[i] >= Integer.MIN_VALUE){
                    System.out.println("* int");
                }
                if (array[i] <= Long.MAX_VALUE && array[i] >= Long.MIN_VALUE){
                    System.out.println("* long");
                }
            }
        }catch (RangeException a){
            System.out.println("range Exception");
        }catch(ArithmeticException ex){
            System.out.println("It can't be stored in long "+ ex );
        }catch (Exception e) {
            System.out.println("array out of range");
        }finally{
            System.out.println("done");
        }
    }
}
