package com.programs.Challenges;
//Julius Caesar protected his confidential information by encrypting it using a cipher. Caesar's cipher (check Resources tab for more info) shifts each letter by a number of letters. If the shift takes you past the end of the alphabet, just rotate back to the front of the alphabet. In the case of a rotation by 3, w, x, y and z would map to z, a, b and c.
//
//        Create a function that takes a string s (text to be encrypted) and an integer k (the rotation factor). It should return an encrypted string.
//        caesarCipher("middle-Outz", 2) ➞ "okffng-Qwvb"
//        caesarCipher("Always-Look-on-the-Bright-Side-of-Life", 5)
//        ➞ "Fqbfdx-Qttp-ts-ymj-Gwnlmy-Xnij-tk-Qnkj"
//
//        caesarCipher("A friend in need is a friend indeed", 20)
//        ➞ "U zlcyhx ch hyyx cm u zlcyhx chxyyx"
public class CaesarCipher {
    public static void main(String[] args) {
//        String str = "middle-Outz";
        String str = "Always-Look-on-the-Bright-Side-of-Life";
        char st[] = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int num  =5,x=0;;
        char st1[] = new char[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char ch[] = str.toCharArray();
        for(int i=0;i<ch.length;i++){
            for(int j=0;j< st.length;j++){
                if(ch[i] == st[j]){
                    x = (j + num) % 26;
                    System.out.print(st[x]);
                }if(ch[i]==st1[j]){
                    x = (j+num) % 26;
                    System.out.print(st1[x]);
                }if(ch[i]=='-'){
                    System.out.print(ch[i]);
                    break;
                }
            }
        }
    }
}
