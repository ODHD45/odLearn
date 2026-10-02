package com.odhd.ioStream;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        // 创建对象
        // 读取文件内容
        //public int read()
        //public int read(char[] c)
        // 关闭流

        System.out.println("--------一次读取一个字符--------");
        FileReader fr = null;
        try {
            fr = new FileReader("testone.txt");
            int b;
            while ((b = fr.read()) != -1) {
                System.out.print((char) (b));
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        fr.close();

        System.out.println("\n" + "--------一次读取字符数组内容--------");
        FileReader fr2 = null;
        char[] c = new char[10];
        int len;
        try{
            fr2 = new FileReader("testtow.txt");
            while ((len = fr2.read(c)) != -1) {
                System.out.print(new String(c, 0, len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        fr2.close();

    }
}
