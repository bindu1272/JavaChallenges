package Challenges;

public class DigitsRecursive {
    static  int digitsRecursion(long n){
         int count =0;
        if(n==0){
            return count;
        }
        else{
            count = 1;
           return count + digitsRecursion(n/10);
        }
    }
    public static void main(String[] args) {
        long num = 12345;
        int count =1;
        if(num ==0){
            System.out.print(count);
        }else {
            System.out.print(digitsRecursion(num));
        }
    }
}
