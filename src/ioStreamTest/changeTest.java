package ioStreamTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class changeTest {
    public static void main(String[] args) throws IOException {
        //读取文件内容
        File src = new File("src/ioStreamTest/one.txt");
        FileInputStream fis =null;
        String s = "";
        try {

            fis = new FileInputStream(src);
            byte [] bytes = new byte[1024];
            int len;
            while ((len = fis.read(bytes))!=-1){
                s += new String(bytes,0,len);
            }

            fis.close();

            Integer[] arr = Arrays.stream(s.split("-"))
                    .map(String::trim)
                    .map(Integer::parseInt)
                    .sorted()
                    .toArray(Integer[]::new);
            System.out.println(Arrays.toString(arr));



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}