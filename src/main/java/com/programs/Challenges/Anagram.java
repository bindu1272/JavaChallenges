package Challenges;
import java.util.ArrayList;
import java.util.List;
public class Anagram {
    public static void main(String[] args) {
        String str1 = "grab";
        String str2 = "bag";
        int x=0;
        String temp;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char ch2[] = str2.toCharArray();
        ArrayList<String> array = new ArrayList<String>();
        ArrayList<Character> ch = new ArrayList<Character>();
        for(int i=0;i<str1.length();i++){
            for(int j=i;j<str1.length();j++){
                array.add(str1.substring(i,j+1));
            }
        }
        System.out.println(array);
        for(int i=0;i<array.size();i++){
            temp = array.get(i);
            char ch1[] = temp.toCharArray();
            if(ch2.length==ch1.length){
                System.out.println(temp);
                x =0;
                for(int k=0;k < ch2.length;k++) {
                    char key = ch2[k];
                    for (int j = 0; j < ch1.length; j++) {
                        if(key == ch1[j]) {
                            ch1[j] = '*';
                        }
                    }
                }
                System.out.println(ch1);
                for(Character y: ch1){
                    if(y!='*'){
                        break;
                    }
                    x++;
                }
                if(x==ch1.length){
                    x = 1;
                    break;
                }
            }
        }
        if(x==1){
            System.out.println("Anagrams");
        }else{
            System.out.println("not anagrams");
        }
    }
}
