package Challenges;
import java.util.ArrayList;
public class AlphaNumeric {
    public static void main(String[] args) {
        String str = "aabbcde";
        char array[] = str.toCharArray();
        ArrayList<Character>  ch = new ArrayList<Character>();
        int count = 0;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]!='0') {
                    if (array[i] == array[j]) {
                        ch.add(array[j]);
                        array[j] = '0';
                    }
                }
            }
        }
            for(int i=0;i<ch.size();i++){
                for(int j=i+1;j<ch.size();j++){
                    if(ch.get(i) == ch.get(j)){
                        ch.set(j,'0');
                    }
                }
            }
            count = 0;
                for(int i=0;i<ch.size();i++){
                    if(ch.get(i)!='0') {
                        count = count + 1;
                    }
                }
        System.out.println(count);

    }
}
