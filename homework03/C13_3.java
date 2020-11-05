package homework03;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class C13_3 {
    public static void sort(ArrayList<Number> list) {
        if (list.isEmpty() || list == null) {
            System.out.println("Arraylist为空。");
            return;
        }

        //冒泡排序法进行排序
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j).doubleValue() > list.get(j + 1).doubleValue()) {
                    Number temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    //测试方法
    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(4.5);
        numbers.add(10);
        numbers.add(5.3);
        numbers.add(-3);
        numbers.add(2);
        sort(numbers);
        System.out.println(numbers.toString());
    }
}
