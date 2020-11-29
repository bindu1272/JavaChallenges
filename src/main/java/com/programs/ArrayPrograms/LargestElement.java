package ArrayPrograms;
public class LargestElement {
        static int smallestNumber(int[] array){
            int min = array[0];
            for(int i=0;i<array.length;i++){
                if(min>array[i]){
                    min = array[i];
                }
            }
            return min;
        }
        public int largestNumber(int[] array){
            int max = 0;
            for(int i=0;i<array.length;i++){
                if(array[i]>max) {
                    max = array[i];
                }
            }
            return max;
        }
        public static void main(String[] args) {
            int i;
            int arr[] = new int[]{1,2,4,8,3,6};
            LargestElement largestElement = new LargestElement();
            int max = largestElement.largestNumber(arr);
            int small = smallestNumber(arr);
            System.out.println("Smallest Number is "+ small);
            System.out.println("largest element is :"+max);
        }
}
