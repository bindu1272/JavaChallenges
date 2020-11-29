package Strings;

import java.util.ArrayList;
import java.util.List;

public class KReverseChar {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        List<String> strings = new ArrayList<>();
        List<String> array = new ArrayList<>();
        while(str.length() > 3){
            strings.add(str.substring(0,3));
            str = str.substring(3);
        }
        List<String> arr = new ArrayList<>();
        int start ;
        int end ;
        for(int i=0;i<strings.size();i++){
            char temp[]= strings.get(i).toCharArray();
            start = 0;
            end = temp.length-1;
            char s;
            while(start < end){
                s = temp[start];
                temp[start] = temp[end];
                temp[end] = s;
                start++;
                end--;
            }
            String si = String.valueOf(temp);
            arr.add(si);
        }
        for(String i : arr) {
            System.out.print(i);
        }
        System.out.print(str);

    }
}
