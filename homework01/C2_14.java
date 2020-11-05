package homework01;

import java.util.Scanner;

//计算BMI
public class C2_14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double wPounds = s.nextDouble();
        System.out.print("Enter height in inches: ");
        double hInches = s.nextDouble();
        double wKg = 0.45359237 * wPounds;
        double hM = 0.0254 * hInches;
        double BMI = wKg / Math.pow(hM, 2);
        System.out.print("BMI is ");
        System.out.printf("%.4f", BMI);
    }
}
