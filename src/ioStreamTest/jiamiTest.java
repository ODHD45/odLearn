package ioStreamTest;

import java.io.*;
public class jiamiTest {
    public static void main(String[] args) {
        // 加密文件
        //异或
        //数据 ^ 密钥 = 加密后的数据
        //加密后的数据 ^ 密钥 = 原始数据
        int key = 10000;
        File src = new File("src/ioStreamTest/one.txt");
        File dest = new File("src/ioStreamTest/tow.txt.");
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(src);
            fos = new FileOutputStream(dest);

            byte[] bytes = new byte[1024];
            int len;
            while ((len = fis.read(bytes)) != -1) {
                for (int i = 0; i < len; i++) {
                    bytes[i] = (byte) (bytes[i] ^ key);
                }
                fos.write(bytes, 0, len);
            }
            fos.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
