package ArrayPrograms;
public class ArraySorted {
    public static void main(String[] args) {
        int arr[] = new int[]{5,5,4,4,2,1,3};
        int temp;
        int i,j;
        System.out.println("elements in an array is :");
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("sort the element in an array:");
        for(i=0;i<arr.length-1;i++){
            for(j=i+1;j<arr.length;j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
