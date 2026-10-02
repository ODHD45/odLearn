package ioStreamTest;

import java.io.*;

public class copytest {
    public static void main(String[] args) throws IOException {
        // 复制文件
        File src = new File("D:/01");
        File dest = new File("D:/02");
        copyFile(src,dest);

    }
    static void copyFile(File src, File dest) throws IOException {
        File[] files = src.listFiles();
        dest.mkdirs();
        for (File file : files){
            if (file.isFile()){
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(dest,file.getName()));

                byte [] bytes = new byte[1024];
                int len;
                while ((len = fis.read(bytes))!=-1){
                    fos.write(bytes,0,len);
                }
                fos.close();
                fis.close();
            }else{
                copyFile(file,new File(dest,file.getName()));
            }
        }
    }
}
