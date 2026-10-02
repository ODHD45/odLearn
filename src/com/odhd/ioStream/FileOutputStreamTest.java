package com.odhd.ioStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args) throws IOException {

        /*
        换行写 \n，\r,\r\n
        追加写 FileOutputStream(String, boolean)第二个参数为true时，追加写入

         */


        // 写入字节
        FileOutputStream fos = new FileOutputStream("testone.txt");
        fos.write(97);

        // 写入字符串
        String str = "hello world";
        byte[] bytes = new byte[str.length()];
        bytes = str.getBytes();
        fos.write(bytes);

        // 写入指定字节数组
        fos.write("\n".getBytes());
        fos.write(bytes,6,5);

        // 写入换行符
        fos.write("\n".getBytes());
        String str2 = "success";
        fos.write(str2.getBytes());
        fos.close();

        // 追加写入
        fos = new FileOutputStream("testone.txt", true);
        fos.write("hello world".getBytes());
        fos.close();
    }
}
