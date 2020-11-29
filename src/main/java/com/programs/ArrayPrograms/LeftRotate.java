package ArrayPrograms;
public class LeftRotate {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5};
        int i,j,n=3;
        for(j=0;j<n;j++){
            int first = arr[0];
            for (i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = first;
        }
            for (i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);

            }
    }
}
