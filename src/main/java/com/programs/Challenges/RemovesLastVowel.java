package Challenges;
import java.util.ArrayList;
import java.util.List;

public class RemovesLastVowel {
    public static void main(String[] args) {
        String str = "Those who dare to fail miserably can achieve greatly.";
        String string[] = str.split(" ");
        String temp = "";
        int k=0;
        for(int i=0;i< string.length;i++){
            temp = string[i];
            char ch[] = temp.toCharArray();
            for(int j=ch.length-1;j>=0;j--){
                k=0;
                if(ch[j]=='a'||ch[j]=='e'||ch[j]=='i'|| ch[j]=='o' || ch[j]=='u'){
                    k = j;
                    System.out.print(k);
                    break;
                }
                System.out.print(k);
//                if(k!=j){
//                    System.out.print(ch[j]);
//                }else{
//                    continue;
//                }
            }
        }


    }
}
