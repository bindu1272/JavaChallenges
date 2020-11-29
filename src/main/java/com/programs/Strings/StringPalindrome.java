package Strings;
import java.util.ArrayList;
public class StringPalindrome {
        public static void main(String[] args) {
            String str = "maddbam";
            int p = 0;
            char arr[] = str.toCharArray();
            ArrayList<Character> array = new ArrayList<>();
            ArrayList<Character> array1 = new ArrayList<>();
            for(char ch : arr){
                array.add(ch);
            }
            for(int i=array.size()-1;i>=0;i--){
                array1.add(array.get(i));
            }
            for(int i=0;i<array.size()/2;i++){
                p=0;
                for(int j=0;j<=i;j++){
                    if(array.get(i) == array1.get(j)){
                        p = 1;
                    }
                }
            }
            if(p==1){
                System.out.println("palindrome");
            }else{
                System.out.println("not a palindrome");
            }

        }
    }

