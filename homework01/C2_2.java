package homework01;

import java.math.BigDecimal;
import java.util.Scanner;

public class C2_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length of the sides and height of the Equilateral triangle: ");
        double lenSides = s.nextDouble();
        double height = s.nextDouble();
        double area = Math.sqrt(3) / 4 * Math.pow(lenSides, 2);
        double volume = area * height;
        String sArea = String.valueOf(area);
        String sVolume = String.valueOf(volume);
        System.out.println("The area is " + sArea.substring(0, sArea.indexOf(".") + 3));
        System.out.println("the volume of the Triangular prism is " + sVolume.substring(0, sVolume.indexOf(".") + 3));
    }
}
