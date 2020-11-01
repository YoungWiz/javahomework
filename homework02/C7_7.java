package homework02;

public class C7_7 {
    public static void main(String[] args) {
        int[] counts = new int[10];
        int rand;
        for (int i = 0; i < 100; i++) {
            rand = (int) (10 * Math.random());
            counts[rand] += 1;
        }
        for (int j = 0; j < counts.length; j++) {
            System.out.println("生成的" + j + "的个数为" + counts[j]);
        }
    }
}
