package Strings;
import java.util.HashMap;
import java.util.Map;
public class MaxMinOcurChar {
    public static void main(String[] args) {
    String str = "grass is greener on the other side";
    char arr[] = str.toCharArray();
    HashMap<Character,Integer> map = new HashMap<Character, Integer>();
    for(char ch : arr){
        if(ch != ' ') {
            Integer count = map.get(ch);
            if (count == null) {
                count = 0;
            }
            map.put(ch, count + 1);
        }
    }
    for(Map.Entry<Character,Integer> i : map.entrySet()){
            System.out.println(i.getKey() + " " + i.getValue());
    }
    Map.Entry<Character,Integer> max = null,min = null;
    for(Map.Entry<Character,Integer> entry : map.entrySet()){
        if(max == null || entry.getValue().compareTo(max.getValue())>0){
            max = entry;
        }
        if(min == null || entry.getValue().compareTo(min.getValue())<0){
            min = entry;
        }

    }
        System.out.println(max.getKey());
        System.out.println(min.getKey());


    }

}
