package ArrayPrograms;
public class EvenPositionedArray {
    public static void main(String[] args) {
        char arr[] = new char[]{'a', 'b', 'c', 'd', 'e', 'f'};
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
