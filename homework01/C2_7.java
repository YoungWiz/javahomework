package homework01;

import java.util.Scanner;

public class C2_7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        long num = s.nextLong();
        int daysOfYear = 365;
        long days = num / 1440;
        long years = days / daysOfYear;
        days = days % 365;
        System.out.println(num + " minutes is approximately " + years + " years and " + days + " days");
    }
}
