package Basics;
import java.util.ArrayList;
public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("bindu");
        arr.add("jyothi");
        arr.add("padma");
        System.out.println(arr);
        System.out.println(arr.get(0));
        arr.set(2,"vankayalapati");
        System.out.println(arr);
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
        for(String i : arr){
            System.out.println(i);
        }
    }
}
