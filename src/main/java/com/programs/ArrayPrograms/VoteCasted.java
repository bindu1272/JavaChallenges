package ArrayPrograms;
public class VoteCasted {
    public static void main(String[] args) {
        char arr[] = new char[]{'A','B','C'};
        char arr1[] = new char[]{'A','F','A','B','A','B','A','C','E'};
        char arr2[] = new char[arr1.length];
        int freq[] = new int[arr2.length];
        int k=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr[i]==arr1[j]){
                     arr2[k++] = arr1[j];
                }
            }
        }
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
        for(int i=0;i<arr1.length;i++){
             count =0;
            for(int j=0;j<arr.length;j++){
                if(arr1[i]!=arr[j]){
                    count ++;
                }
            }
        }
        System.out.println("invalid votes ="+count);


    }
}
