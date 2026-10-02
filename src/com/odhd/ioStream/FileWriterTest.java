package com.odhd.ioStream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) throws IOException {
        // 创建对象
        // 写入文件内容
        //public void write(int c)
        //public void write(String str)
        //public void write(char[] c, int off, int len)
        // 关闭流

        FileWriter fw = null;
        try {
            fw = new FileWriter("testone.txt", true);
            fw.write(97);
            fw.write("hello world");

            String str = "success";
            fw.write(str,0,3);
        } catch (IOException e) {
            e.printStackTrace();
        }
        fw.close();
    }
}
