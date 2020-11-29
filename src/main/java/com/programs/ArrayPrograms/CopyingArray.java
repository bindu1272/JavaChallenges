package ArrayPrograms;
import java.util.Scanner;
public class CopyingArray {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
        int arr[] = new int[]{1,2,3,4,5};
        int i;
//        System.out.println("enter the elements");
//        for(i=0;i<arr.length;i++){
//            arr[i] = scan.nextInt();
//        }
        System.out.println("Array Elements are:");
        for(i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
        int arr1[] = new int[arr.length];
        for(i=0;i<arr.length;i++){
            arr1[i] = arr[i];
        }
        System.out.println("Second array elements");
        for(i=0;i<arr.length;i++){
            System.out.println(arr1[i]);
        }
    }
}
