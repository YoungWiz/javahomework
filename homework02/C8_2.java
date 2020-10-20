package homework02;

import java.util.Scanner;

public class C8_2 {
    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        for (int i = 0; i < 4; i++) {
            sum = sum + m[i][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        double[][] matrix = new double[4][4];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = s.nextDouble();
            }
        }
        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(matrix));
    }
}
