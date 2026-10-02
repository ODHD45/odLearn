package com.odhd.ioStream;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharCodeTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // 字符转字节编码
        //public byte[] getBytes()
        //public byte[] getBytes(String charsetName)

        // 字节转字符解码
        //String(byte[] bytes)
        //String(byte[] bytes, int off, int len)
        //String(byte[] bytes, int off, int len, String charsetName)

        //GBK编码（1-2字节）
        //UTF-8编码（1-4字节）
            //英文符号     ASCII 0*******
            //拉丁希腊符号  11000000 10000000
            //中文符号     11100000 10000000

        String str = "你好";
        byte[] bytes = str.getBytes("UTF-8");
        byte[] bytes2 = str.getBytes("GBK");
        System.out.println(Arrays.toString(bytes));
        System.out.println(Arrays.toString(bytes2));

        String str2 = new String(bytes, "UTF-8");
        String str3 = new String(bytes2, "GBK");
        System.out.println(str2);
        System.out.println(str3);
    }
}
