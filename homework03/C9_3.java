package homework03;

import java.util.Date;

public class C9_3 {

    public static void main(String[] args) {
        Date testDate = new Date();
        long newTime;
        long increment = 10000;
        int count = 0;
        do {
            newTime = testDate.getTime() + increment;
            testDate.setTime(newTime);
            System.out.println("时间流逝" + increment + "毫秒后的日期为：" + testDate.toString());
            increment *= 10;
            count += 1;
        } while (count < 8);
    }
}
