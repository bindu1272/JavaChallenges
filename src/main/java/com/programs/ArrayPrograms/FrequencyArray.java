package ArrayPrograms;
public class FrequencyArray {
    public static void main(String[] args) {
        int arr[] = new int[]{5,5,4,4,2,1,3};
        int visited = -1;
        int count,i,j;
        int frequency[] = new int[arr.length];
        System.out.println("elements in an array is :");
        for(i=0;i<arr.length;i++){
            count = 1;
            for(j=i+1;j<arr.length;j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    frequency[j] = visited;
                }
            }
            if(frequency[i]!= visited){
                frequency[i] = count;
            }
        }
        System.out.println("final elements are:");
        for(i=0;i<frequency.length;i++){
            if(frequency[i]!= visited){
                System.out.println(arr[i]+" "+frequency[i]);
            }
        }
    }
}
