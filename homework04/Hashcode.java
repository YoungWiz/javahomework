package homework04;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;

public class Hashcode {
    // 计算文件的hash值，并更新传入的MessageDigest对象
    private static void CheckSum(InputStream input, MessageDigest md) throws Exception {
        // 文件缓冲区
        byte[] buffer = new byte[1024];
        int numRead = 0;
        do {
            // 从输入流中读出numRead字节到buffer中
            numRead = input.read(buffer);
            // 当读出的字节数大于零时，根据读出的字节更新MessageDigest对象
            if (numRead > 0) {
                md.update(buffer, 0, numRead);
            }
        } while (numRead != -1);
        // 关闭输入流
        input.close();
    }

    // 文件夹深度优先遍历，并计算文件的hash值
    private static void Hash(String filepath, MessageDigest md) throws Exception {
        File dir = new File(filepath);
        File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++) {
            // 若该对象为文件，则计算该文件的hash值，更新md
            if (files[i].isFile()) {
                CheckSum(new FileInputStream(files[i]), md);
            }
            // 若该对象为文件夹，则递归遍历
            if (files[i].isDirectory()) {
                Hash(filepath + File.separator + files[i].getName(), md);
            }
        }
    }

    // 计算文件夹hash值的helper method
    public static String GetHashCode(String filepath) throws Exception {
        // 设定hash算法为SHA-256
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        Hash(filepath, messageDigest);
        // 返回messageDigest对象的hash值
        byte[] sha256 = messageDigest.digest();
        // 将hash值转换为字符串
        String result = "";
        for (int i = 0; i < sha256.length; i++) {
            result += Integer.toString(sha256[i] & 0xFF, 16);
        }
        return result;
    }

    public static void main(String[] args) {
        String filepath = "D:\\作业\\数据结构";
        String result = "";
        try {
            result = GetHashCode(filepath);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }
}

