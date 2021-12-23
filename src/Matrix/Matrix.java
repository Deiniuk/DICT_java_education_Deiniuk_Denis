package Matrix;
import java.util.Scanner;


public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows;
        int columns;
        System.out.println("Enter size of the matrix: ");
        rows = sc.nextInt();
        columns = sc.nextInt();

        System.out.println("Enter matrix: ");

        int[][] matMultiply = fillMatrix(rows,columns);

        System.out.println("Enter constonant: ");

        int n = sc.nextInt();

        System.out.println("The result is: ");

        multiplyMatrix(matMultiply,rows,columns,n);
    }

    public static void multiplyMatrix(int[][] firstMatrix,int rows, int columns,int c) {
        int[][] pr = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                pr[i][j] = firstMatrix[i][j] * c;
            }
        }

        printMatrix(pr);
    }
    public static int[][] fillMatrix(int rows, int columns) {
        Scanner sc = new Scanner(System.in);

        int[][] firstMatrix = new int[rows][columns];

        for(int row=0;row<rows;row++){
            for(int col=0;col<columns;col++){
                firstMatrix[row][col]=sc.nextInt();
            }
        }

        return firstMatrix;
    }
    public static void printMatrix(int[][] pr) {
        for(int[] row : pr) {
            for (int column : row) {
                System.out.print(column);
            }
            System.out.println();
        }
    }

}
