package homework04;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;

public class Hashcode {
    public static MessageDigest SHA256CheckSum(InputStream input, MessageDigest md) throws Exception {
        byte[] buffer = new byte[1024];
        int numRead = 0;
        do {
            numRead = input.read(buffer);
            if (numRead > 0) {
                md.update(buffer, 0, numRead);
            }

        } while (numRead != -1);

        input.close();
        return md;

    }

    public static String GetHashCode(String filepath) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        File dir = new File(filepath);
        File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++) {
            //若该对象为文件，则计算该文件的hash值，并保存到缓冲区
            if (files[i].isFile()) {
                md = Hashcode.SHA256CheckSum(new FileInputStream(files[i]), md);
            }
            if (files[i].isDirectory()) {
                GetHashCode(filepath + File.pathSeparator + files[i].getName());
            }
        }
        byte[] sha256 = md.digest();
        String result = "";
        for (int i = 0; i < sha256.length; i++) {
            result += Integer.toString(sha256[i] & 0xFF, 16);
        }
        return result;
    }

    public static void main(String[] args) {
        String result = "";
        try {
            result = Hashcode.GetHashCode("D:\\作业\\Java\\javahomework\\homework03");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(result);

    }
}

