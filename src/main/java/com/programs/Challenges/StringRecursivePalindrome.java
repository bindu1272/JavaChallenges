package Challenges;
import java.util.ArrayList;
public class StringRecursivePalindrome {
    public boolean stringRecursive(String string){
        if(string.length()==0 || string.length()==1){
            return true;
        }
        if(string.charAt(0) == string.charAt(string.length()-1)){
             return stringRecursive(string.substring(1,string.length()-1));
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "maddam";
        StringRecursivePalindrome stringRecursivePalindrome = new StringRecursivePalindrome();
        System.out.println(stringRecursivePalindrome.stringRecursive(str));

    }
}
