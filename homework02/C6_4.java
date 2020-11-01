package homework02;

import java.util.Scanner;

public class C6_4 {
    public static void reverse(int number) {
        int temp = number;
        int result = 0;
        while (temp != 0) {
            result = result * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println(number + "的反向数为" + result);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int input = s.nextInt();
        reverse(input);
    }
}
