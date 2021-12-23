package Matrix;
import java.util.Scanner;


public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows;
        int columns;
        System.out.println("Enter size of first matrix: ");
        rows = sc.nextInt();
        columns = sc.nextInt();
        System.out.println("Enter matrix: ");
        int[][] mat1 = fillMatrix(rows,columns);

        System.out.println("Enter size of second matrix: ");
        rows = sc.nextInt();
        columns = sc.nextInt();

        System.out.println("Enter second matrix: ");
        int[][] mat2 = fillMatrix(rows,columns);

        System.out.println("The result is: ");

        sumUpMatrix(mat1,mat2,rows,columns);
    }

    public static void sumUpMatrix(int[][] firstMatrix,int[][] secondMatrix,int rows, int columns) {

        int[][] sum = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        printMatrix(sum);
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
