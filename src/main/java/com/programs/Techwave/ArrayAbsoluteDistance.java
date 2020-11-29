package Techwave;
public class ArrayAbsoluteDistance{
    public  int solution(int array[]){
        int min =Integer.MAX_VALUE;
        int i,j,x=0,y=0;
        for(i=0;i<array.length;i++){
            for(j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    continue;
                }
                if(Math.abs(array[i]-array[j]) < min){
                    min = Math.abs(array[i]-array[j]);
                    x = i;
                    y = j;
                }
            }
        }
        return Math.abs(x-y);
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1,4,7,3,3,5};
        ArrayAbsoluteDistance distance = new ArrayAbsoluteDistance();
        System.out.println(distance.solution(arr));
    }
}


