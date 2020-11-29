package Challenges;

public class PandigitalNumberCharacter {
    public static void main(String[] args) {
        int number = 12345;
        String str = Integer.toString(number);
        char array[] = str.toCharArray();
        char array2[] = new char[]{'1','2','3','4','5','6','7','8','9'};

        for(int i=0;i< array2.length;i++){
            for(int j=0;j<array.length;j++){
                if(array2[i] == array[j]){
                    array2[i] = '0';
                }
            }
        }
        int count = 0;
        for(int i=0;i<array2.length;i++){
            if(array2[i]=='0'){
                count++;
            }
        }
        if(count == 8){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
