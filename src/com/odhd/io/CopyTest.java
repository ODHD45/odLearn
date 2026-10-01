package com.odhd.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTest {
    public static void main(String[] args) throws IOException {
        //复制文件
        FileInputStream fis = new FileInputStream("testone.txt");
        FileOutputStream fos = new FileOutputStream("testtow.txt");
        // 读取文件内容，直到读取到文件末尾,每次读取1024*1024*5字节
        // 读取到的字节数为len
        byte[] bytes = new byte[1024*1024*5];
        int len;
        while ((len = fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
    }
}
