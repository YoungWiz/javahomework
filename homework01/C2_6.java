package homework01;

import java.util.Scanner;

//读取一个0到1000之间的整数，输出各位数字之积
public class C2_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int result = 1;
        System.out.print("Enter a number between 0 and 1000: ");
        int num = s.nextInt();
        Boolean flag = true;
        //判断输入的数是否符合要求，如不符合则重新输入
        while (flag) {
            if (num < 1000 && num > 0) {
                flag = false;
            } else {
                System.out.print("Enter a number between 0 and 1000: ");
                num = s.nextInt();
            }
        }
        while (num != 0) {
            result = result * (num % 10);
            num /= 10;
        }
        System.out.print("The multiplication of all digits is " + result);
    }
}
