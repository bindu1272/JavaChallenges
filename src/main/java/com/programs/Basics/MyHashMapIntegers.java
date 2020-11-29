package Basics;
import java.util.HashMap;
public class MyHashMapIntegers {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("bindu",21);
        hashMap.put("jyothi",18);
        hashMap.put("padma",35);
        hashMap.put("anjaiah",49);
        System.out.println(hashMap);
        for(String i : hashMap.keySet()){
            System.out.println("key: "+i+"values :" +hashMap.get(i));
        }
        HashMap<Integer,Integer> hashMap1 = new HashMap<Integer, Integer>();
        hashMap1.put(1,10001);
        hashMap1.put(2,10002);
        hashMap1.put(3,10003);
        hashMap1.put(4,10004);
        System.out.println(hashMap1);
        for (Integer i : hashMap1.keySet()){
            System.out.println("key : "+i+" values:"+hashMap1.get(i));
        }

    }
}
