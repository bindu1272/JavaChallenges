package ArrayPrograms;
import java.util.Scanner;
public class RangePerfect {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the range :");
        try {
            int range = scan.nextInt();
            for (int i = 2; i < range; i++) {
                int sum = 0;
                for (int j = 1; j < i; j++) {
                    if (i % j == 0) {
                        sum = sum + j;
                    }
                }
                if (sum == i) {
                    System.out.println("Perfect numbers are :" + i);
                }

            }
        }catch (Exception e){
            System.out.print("please enter the number with in int range");
        }

    }
}
