package com.programs.Challenges;
import java.util.ArrayList;
import java.util.List;
//Write a function that selects all words that have all the same vowels (in any order and/or number) as the first word, including the first word.
//        sameVowelGroup(["toe", "ocelot", "maniac"]) ➞ ["toe", "ocelot"]
//
//        sameVowelGroup(["many", "carriage", "emit", "apricot", "animal"]) ➞ ["many"]
//
//        sameVowelGroup(["hoops", "chuff", "bot", "bottom"]) ➞ ["hoops", "bot", "bottom"]
public class SameVowelGroup {
    public static void main(String[] args) {
        String arr[] = new String[]{"many", "carriage", "emit", "apricot", "animal"};
//        String arr[] = new String[]{"toe", "ocelot", "maniac"};
//        String arr[] = new String[]{"hoops", "chuff", "bot", "bottom"};
        int min = Integer.MAX_VALUE;
        List<String> list2 = new ArrayList<>();
        List<String> li = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        String st[] = new String[arr.length];
        int array[] = new int[st.length];
        String sample="";
        for(int i=0;i<arr.length;i++){
            char ch[] = arr[i].toCharArray();
            String temp="";
            for(int j=0;j< ch.length;j++){
                if(ch[j]=='a'||ch[j]=='e'||ch[j]=='i'||ch[j]=='o'||ch[j]=='u')
                     temp  += ch[j];
            }
            st[i] = temp;
        }
        for(int i=0;i<st.length;i++)
            array[i] = st[i].length();
        int x;
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min = array[i];
                x = i;
            }
        }
        for(int i=0;i< st.length;i++){
            if(st[i].length() == min)
                sample = st[i];
        }
        char ch[] = sample.toCharArray();
        for(int j=0;j<st.length;j++){
            String temp = st[j];
            char character[] = temp.toCharArray();
            for(int k=0;k<character.length;k++) {
                for (int i = 0; i < ch.length; i++) {
                    if(character[k]==ch[i])
                        character[k] = '*';
                }
                if(character[k]!='*'){
                    li.add(temp);
                    break;
                }
            }
        }
        for(int i=0;i<st.length;i++){
            for(int j=0;j<li.size();j++) {
                if (st[i].equals(li.get(j)))
                     list.add(i);
            }
        }
        List<String> list1 = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<list.size();j++){
                if(i==list.get(j))
                    list1.add(arr[i]);
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<list1.size();j++){
                if(arr[i].equals(list1.get(j)))
                    arr[i] = "*";
            }
            if(arr[i]!="*")
                list2.add(arr[i]);
        }
        for(String i : list2)
            System.out.print(i+" ");
    }
}
