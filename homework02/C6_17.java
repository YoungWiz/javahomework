package homework02;

import java.util.Scanner;

public class C6_17 {
    public static void printMatrix(int n) {
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print((int) (10 * Math.random() % 2) + " ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = s.nextInt();
        printMatrix(n);
    }
}
