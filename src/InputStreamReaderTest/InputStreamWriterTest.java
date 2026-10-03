package InputStreamReaderTest;

import java.io.*;
import java.nio.charset.Charset;

public class InputStreamWriterTest {
    public static void main(String[] args) throws IOException {

        //方案1
//        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:/02/01.txt"),"GBK");
//
//        int ch;
//        while ((ch = isr.read()) != -1) {
//            System.out.print((char) ch);
//        }
//        isr.close();

        //方案2
        FileReader fr = new FileReader("src/InputStreamReaderTest/01.txt", Charset.forName("GBK"));
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }
        fr.close();

        FileWriter fw = new FileWriter("src/InputStreamReaderTest/01.txt", Charset.forName("GBK"), true);

        fw.write("邀请明月让回忆皎洁");
        fw.close();
    }
}