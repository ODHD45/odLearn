package ioBufferedStream;

import java.io.*;

public class BufferedStreamTest {
    public static void main(String[] args) throws IOException {
        //缓冲流复制文件
        //8192字节缓冲区
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src\\ioBufferedStream\\1.txt"));
        BufferedInputStream bis2 = new BufferedInputStream(new FileInputStream("src\\ioBufferedStream\\1.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src\\ioBufferedStream\\2.txt", true));
        BufferedOutputStream bos2 = new BufferedOutputStream(new FileOutputStream("src\\ioBufferedStream\\3.txt", true),8192);
        int b;
        while ((b = bis.read())!=-1){
            bos.write(b);
        }


        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis2.read(bytes)) != -1) {
            bos2.write(bytes,0,len);
        }
        bos.close();
        bos2.close();
        bis.close();




    }

}
