package ArrayPrograms;
public class CountRepetition {
    public static void main(String[] args) {
        String str = "I am so amazed by the sheer excellence of this boy. iam so so so grateful for this";
        String arr[] = str.split(" ");
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
        String str1 = "so";
        int count=0;
        for(int i=0;i<arr.length;i++) {
            if (str1.equals(arr[i])) {
                count++;
            }
        }
        System.out.println(count);
//        for(int i=0;i< arr.length;i++){
//            System.out.println(arr[i]);
//        }

    }
}
