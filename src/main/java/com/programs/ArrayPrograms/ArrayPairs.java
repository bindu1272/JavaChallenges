package ArrayPrograms;
public class ArrayPairs {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6};
        int k=5;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i]+arr[j] ==k) || ((arr[i]+arr[j])%k==0)){
                    System.out.println("("+arr[i]+","+arr[j]+")");
                }
            }
        }
    }
}
