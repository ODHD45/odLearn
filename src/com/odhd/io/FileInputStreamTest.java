package com.odhd.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        //读取文件内容
        FileInputStream fis = new FileInputStream("testtow.txt");
        int b = fis.read();
        System.out.println((char) (b));

        //读取文件内容，直到读取到文件末尾
        while ((b=fis.read())!=-1){
            System.out.print((char) (b));
        }
        fis.close();

        //复制文件

        FileInputStream fis2 = new FileInputStream("testone.txt");
        FileOutputStream fos = new FileOutputStream("testthree.txt");
        int b2 = fis2.read();
        while ((b2=fis2.read())!=-1){
            fos.write(b2);
        }
        fos.close();
        fis2.close();

    }
}
