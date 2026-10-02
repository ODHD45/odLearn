package ioBufferedStream;

import  java.io.*;

public class BufferedTest01 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        method4();
        long end = System.currentTimeMillis();
        System.out.println(end-start);




    }
    //基本字节流复制文件
    public static void method1() throws IOException {
        FileInputStream fis = new FileInputStream("src\\ioBufferedStream\\1.txt");
        FileOutputStream fos = new FileOutputStream("src\\ioBufferedStream\\2.txt");
        int b;
        while ((b = fis.read())!=-1){
            fos.write(b);
        }
        fos.close();
        fis.close();
    }

    public static void method2() throws IOException {
        FileInputStream fis = new FileInputStream("src\\ioBufferedStream\\1.txt");
        FileOutputStream fos = new FileOutputStream("src\\ioBufferedStream\\2.txt",true);
        byte [] b = new byte[1024];
        int len;
        while ((len = fis.read(b))!=-1){
            fos.write(b,0,len);
        }
        fos.close();
        fis.close();
    }

    //字符流复制文件
    public static void method3() throws IOException {
        FileReader fr = new FileReader("src\\ioBufferedStream\\2.txt");
        FileWriter fw = new FileWriter("src\\ioBufferedStream\\1.txt",true);
        int b;
        while ((b = fr.read())!=-1){
            fw.write(b);
        }
        fw.close();
        fr.close();
    }
    //缓冲流复制文件
    public static void method4() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src\\ioBufferedStream\\2.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src\\ioBufferedStream\\1.txt",true));
        int b;
        while ((b = bis.read())!=-1){
            bos.write(b);
        }
        bos.close();
        bis.close();
    }



}
