package com.programs.Challenges;
import static java.lang.String.valueOf;
import static org.codehaus.plexus.util.StringUtils.isNumeric;
//Write a function that adds two numbers. The catch, however, is that the numbers will be strings.
//        addStrNums("4", "5") ➞ "9"
//        addStrNums("abcdefg", "3") ➞ "-1"
//        addStrNums("1", "") ➞ "1"
//        addStrNums("1874682736267235927359283579235789257", "32652983572985729") ➞ "1874682736267235927391936562808774986"
//        note:
//        If there are any non-numerical characters, return "-1".
//        An empty parameter should be treated as "0".
//        Your function should be able to add any size number.
//        Your function doesn't have to add negative numbers.
//        Zeros at the beginning of the string should be trimmed.
//        Bonus: Don't use BigInteger or BigDecimal classes.
public class AddStringNumbers {
    public static void main(String[] args) {
//        String str = "abcdefg";
//        String str1 = "3";
//        String str = "4";
//        String str1 = "5";
//        String str = "1";
//        String str1 = "";
        String str = "1874682736267235927359283579235789257";
        String str1 = "32652983572985729";
        int c=0;
        try{
        if(isNumeric(str)==false || isNumeric(str1)==false){
            System.out.print("-1");
        }if(str.isEmpty()){
            str ="0";
        }if(str1.isEmpty()){
            str1 = "0";
        }
        if((isNumeric(str)==true)& (isNumeric(str)==true)){
            int num = Integer.parseInt(str);
            int num1 = Integer.parseInt(str1);
            System.out.print(num + num1);
        }
        }catch (Exception e){
            c = 1;
        }

        if(c==1){
            char ch[] = str.toCharArray();
            char ch1[] = new char[ch.length-str1.length()];
            int k=0;
            for(int i=0;i<ch.length-str1.length();i++){
                ch1[k++] = ch[i];
            }
            for(int i=0;i<ch1.length;i++){
                System.out.print(ch1[i]);
            }
            char ch2[] = new char[ch.length- ch1.length];
            int p=0;
            for(int i=ch.length-str1.length();i<ch.length;i++){
                ch2[p++] = ch[i];
            }
            String s = valueOf(ch2);
            long longNumber = Long.parseLong(s);
            long longNumber1 = Long.parseLong(str1);
            long longSum = longNumber+longNumber1;
            System.out.print(longSum);
        }
    }
}
