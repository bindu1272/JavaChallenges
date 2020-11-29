package Challenges;

public class BalancedWordSum {
    public static void main(String[] args) {
        String str = "byaz";
        char ch[] = str.toCharArray();
        int sum = 0;
        int start =0;
        int end = ch.length-1;
//         for(int i=0;i<ch.length/2;i++){
//            sum = sum + (int)ch[i];
//        }
         int count =0;
//         for(int i=ch.length-1;i>=ch.length/2;i--){
//             count = count + (int)ch[i];
//         }
        for(int i=0;i<ch.length;i++){
            if(i<ch.length/2){
                sum = sum + (int)ch[i];
            }else{
                count = count + (int)ch[i];
            }
        }
//        while(start < end){
//            count = count + ch[end];
//            end--;
//            sum = sum + ch[start];
//            start++;
//        }
         if(count == sum){
             System.out.print("balancedWord");
         }else{
             System.out.print("not balanced");
         }
    }
}
