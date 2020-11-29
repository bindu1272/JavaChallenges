package ArrayPrograms;
import java.util.Scanner;
public class MyStringDuplicates {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        String str = scan.nextLine();
        String arr[] = str.split(" ");
        int arr1[] = new int[arr.length];
        int size = arr.length;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++) {
                if (arr[i].equals(arr[j])) {
                    System.out.println(arr[j]);
                }
            }
        }

    }

}
