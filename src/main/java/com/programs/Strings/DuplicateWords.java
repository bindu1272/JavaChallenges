package Strings;
public class DuplicateWords {
    public static void main(String[] args) {
        String str = "Big black bug bit a big black dog on his big black nose";
        String word = "";
        String array[] = new String[13];
        int k=0;
        str = str + " ";
        for(int i=0;i<str.length();i++) {
            if (str.charAt(i) != ' ') {
                word = word + str.charAt(i);

            }else{
                array[k] = word;
                k++;
                word = "";
            }
        }
//        for(int i=0;i<array.length;i++){
//            System.out.println(array[i]);
//        }
        int p=0,j;
        String x = " ";
        for(int i=0;i< array.length;i++) {
            p = 1;
            for (j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    p++;
                    array[j] = "0";
                }
            }
            if (p > 1 && array[i] != "0") {
                System.out.println(array[i]);
            }
        }


    }

}
