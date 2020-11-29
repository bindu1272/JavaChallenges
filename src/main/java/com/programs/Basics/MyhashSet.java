package Basics;
import  java.util.HashSet;
public class MyhashSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("bindu");
        hashSet.add("jyothi");
        hashSet.add("vankayalapati");
        hashSet.add("padma");
        hashSet.add("bindu");
        System.out.println(hashSet);
        for(String i : hashSet){
            System.out.println(i);
        }
    }
}
