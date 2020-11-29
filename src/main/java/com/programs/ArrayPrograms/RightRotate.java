package ArrayPrograms;
public class RightRotate {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5};
        int n= 4;
        int last;
        for(int j=1;j<n;j++) {
            last = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
