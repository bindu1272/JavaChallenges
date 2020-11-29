package ArrayPrograms;
public class MyArrayDuplicates {
        public  static int[] rem(int[] array){
            int visited = -1;
            for(int i=0;i< array.length;i++){
                for(int j=i+1;j< array.length;j++){
                    if(array[i] == array[j]){
                        array[j] = visited;
                    }
                }
            }
//            int j=0;
//            for(int i=0;i< array.length;i++) {
//                if (array[i]!=-1){
//                    array1[j++] = array[i];
//                }
//            }
            return  array;
        }
        public static void main(String[] args) {
            int arr[] = new int[]{1, 2,2, 3,3, 4, 5};
//            int arr1[] = new int[arr.length];
            int arr2[] = rem(arr);
            for(int i=0;i<arr2.length;i++){
                if(arr2[i]!=-1) {
                    System.out.println(arr2[i]);
                }
            }
        }
    }

