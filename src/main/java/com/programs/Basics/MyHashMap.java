package Basics;
import java.util.HashMap;
public class MyHashMap {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<String, String>();
        hashMap.put("name","bindu");
        hashMap.put("age","adult");
        hashMap.put("village","karamchedu");
        System.out.println(hashMap);
        System.out.println(hashMap.size());
        hashMap.remove("name");
        System.out.println(hashMap);
        hashMap.put("fruit","apple");
        hashMap.put("vegetables","potato");
        System.out.println(hashMap);
//        for(String i : hashMap.keySet()){
//            System.out.println(i);
//        }
//        for(String i : hashMap.values()){
//            System.out.println(i);
//        }
        for(String i : hashMap.keySet()){
            System.out.println("key :" + i + "value :" + hashMap.get(i) );
        }

    }
}
