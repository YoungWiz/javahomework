package homework01;

import java.util.Scanner;

//计算六个月后账户上的钱数
public class C2_13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double monSaving = s.nextDouble();
        double annRate = 0.0375;
        double monRate = annRate / 12;
        int month = 6;
        double result = 0;
        for (int i = 0; i < month; i++) {
            result = (result + monSaving) * (1 + monRate);
        }
        System.out.print("after the sixth month, the account value is $" + result);
    }
}
