package ArrayPrograms;
import java.util.Scanner;
public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number of rows in first matrix");
        int rows1 = scan.nextInt();
        System.out.println("enter the columns in first matrix");
        int cols1 = scan.nextInt();
        int matrix1[][] = new int[rows1][cols1];
        for(int i=0;i<rows1;i++){
            for(int j=0;j<cols1;j++){
                matrix1[i][j] = scan.nextInt();
            }
        }
        System.out.println("enter the number of rows in second matrix");
        int rows2 = scan.nextInt();
        System.out.println("enter the columns in second matrix");
        int cols2 = scan.nextInt();
        int matrix2[][] = new int[rows2][cols2];
        for(int i=0;i<rows2;i++){
            for(int j=0;j<cols2;j++){
                matrix2[i][j] = scan.nextInt();
            }
        }
        int matrix3[][] = new int[rows1][cols2];

            System.out.print("Matrix multiplication");
            for(int i=0;i<rows1;i++){
                for(int j=0;j<cols2;j++){
                    matrix3[i][j] = 0 ;
                    for(int k=0;k<cols1;k++){
                        matrix3[i][j] += matrix1[i][k]* matrix2[k][j];
                        System.out.println(matrix2[k][j]);
                    }
                }
            }

        System.out.println("after matrix multiplication");
        for(int i=0;i<rows1;i++){
            for(int j=0;j<cols2;j++){
                System.out.print(matrix3[i][j]);
                System.out.print("\t");
            }
            System.out.print("\n");
        }

    }
}
