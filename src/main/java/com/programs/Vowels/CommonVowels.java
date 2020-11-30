package com.programs.Vowels;

public class CommonVowels {
    static void removeLetters(char array[],String st){
        char arr[] = st.toCharArray();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<array.length;j++){
                if(arr[i]==array[j]){
                    array[j] = '*';
                    break;
                }
            }
        }
        System.out.print("[");
        for(int i=0;i<array.length;i++){
            if(array[i]!='*'){
                System.out.print("'"+array[i]+"' ");

            }
        }
        System.out.print(']');

    }
    public static void main(String[] args) {
        char ch[] = new char[]{'d','b','t','e','a','i'};
//        'b','b','l','l','g','n','o','a','w'ballon
        String str = "edabit";
        removeLetters(ch,str);
    }
}
