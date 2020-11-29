package Challenges;
import java.util.*;
public class ParseCode {
    private Dictionary parseCode(String string){
        String str[] = string.split("0+");
        Dictionary dict = new Hashtable();
        List<String> str1 = new ArrayList<>();
        String s = "";
        for(String i : str) {
            if(i=="0"&& i=="" && i==" ") {
                continue;
            }
            str1.add(i);
        }
        dict.put("FirstName",str1.get(0));
        dict.put("SecondName",str1.get(1));
        dict.put("Id",str1.get(2));
        return dict;
    }
    public static void main(String[] args) {
        ParseCode parse = new ParseCode();
        String str = "kevin0smith004331";
        Dictionary dict = parse.parseCode(str);
//        System.out.print(dict);
        System.out.println("{");
        for (Enumeration<String> keys = dict.keys(); keys.hasMoreElements(); ) {
            String keyVal = keys.nextElement();
            System.out.print('"'+keyVal+"\"=\""+dict.get(keyVal)+"\"");
            if(keys.hasMoreElements()){
                System.out.println(",");
            }else {
                System.out.println();
            }
        }
        System.out.print("}");
    }
}
