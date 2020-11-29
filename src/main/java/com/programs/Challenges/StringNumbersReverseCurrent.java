package Challenges;
public class StringNumbersReverseCurrent {
    static void reverse(String string){
        char arr[] = string.toCharArray();
        char temp;
        int length = arr.length-1;
        int start =0;
        while (start<length){
            if(arr[length]>=48 && arr[length]<=57){
                length--;
            }else if(arr[start]>=48 && arr[start]<=57){
                start++;
            }else {
                temp = arr[length];
                arr[length] = arr[start];
                arr[start] = temp;
                start++;
                length--;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        String str = "jkl5mn923o";
        reverse(str);
    }
}
