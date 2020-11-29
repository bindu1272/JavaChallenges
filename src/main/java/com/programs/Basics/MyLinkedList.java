package Basics;
import java.util.LinkedList;
public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("apple");
        list.add("banana");
        list.add("lemon");
        list.add("oranges");
        System.out.println(list);
        list.addFirst("vegetables");
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.addLast("drumsticks");
        System.out.println(list);
        System.out.println(list.getFirst());
    }
}
