package homework02;

import java.util.Scanner;

public class C7_10 {
    public static int indexOfSmallestElement(double[] array) {
        int index = 0;
        double min = Double.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        double[] set = new double[10];
        Scanner s = new Scanner(System.in);
        System.out.print("请输入十个整数：");
        for (int i = 0; i < 10; i++) {
            set[i] = s.nextDouble();
        }
        System.out.println("最小元素的下标为" + indexOfSmallestElement(set));
    }
}
