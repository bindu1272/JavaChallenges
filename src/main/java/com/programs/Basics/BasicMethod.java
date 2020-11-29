package Basics;

public class BasicMethod {
    static int sumNumbers(int start,int end1) {
        if(start<end1){
            return end1 + sumNumbers(start,end1-1);
        }else{
            return start;
        }
    }
    public static  void  main(String args[]){
        System.out.println(sumNumbers(5,10));
    }
}
