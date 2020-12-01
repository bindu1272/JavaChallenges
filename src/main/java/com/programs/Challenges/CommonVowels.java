package com.programs.Challenges;
//Create a function that takes an array and string. The function should remove the letters in the string from the array, and return the array.
//
//        removeLetters(["s", "t", "r", "i", "n", "g", "w"], "string") ➞ ["w"]
//
//        removeLetters(["b", "b", "l", "l", "g", "n", "o", "a", "w"], "balloon") ➞ ["b", "g", "w"]
//
//        removeLetters(["d", "b", "t", "e", "a", "i"], "edabit") ➞ []
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
        char ch[] = new char[]{'b','b','l','l','g','n','o','a','w'};
//        'b','b','l','l','g','n','o','a','w'ballon
        String str = "ballon";
        removeLetters(ch,str);
    }
}
