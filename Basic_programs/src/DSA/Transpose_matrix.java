package DSA;

import java.util.Scanner;

class MatrixTranspose {
    Scanner s = new Scanner(System.in);
    int m = 3;
    int n = 3;
    int arr1[][] = new int[m][n];
    int tran_matrix[][] = new int[m][n];

    public void input() {
        System.out.println("Enter matrix 1 of 3*3:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = s.nextInt();
            }
        }
    }

    void show1() {
        System.out.println("Original matrix is:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }

    void trans() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                tran_matrix[i][j] = arr1[j][i]; // Corrected assignment
            }
        }
    }

    void show() {
        System.out.println("Transpose matrix is:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(tran_matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Transpose_matrix{
    public static void main(String[] args) {
        MatrixTranspose obj = new MatrixTranspose();
        obj.input();
        obj.show1();
        obj.trans();
        obj.show();
    }
}
