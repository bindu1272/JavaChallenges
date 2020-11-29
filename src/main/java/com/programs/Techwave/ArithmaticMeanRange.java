package Techwave;
public class ArithmaticMeanRange {
    public int solution(int array[],int s){
        int sum,count=0;
            for(int i=0;i<array.length;i++){
                for(int j=i;j<array.length;j++){
                    sum = 0;
                    for(int k=i;k<=j;k++){
                        System.out.println(j+" "+k);
                        sum = sum + array[k];
                    }
                    if(sum % s == 0 ){
                        count++;
                    }
                    System.out.println("\n");
                }
            }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{2,1,4};
        int n = 3;
        ArithmaticMeanRange mean = new ArithmaticMeanRange();
        System.out.println(mean.solution(arr,n));
    }
}
