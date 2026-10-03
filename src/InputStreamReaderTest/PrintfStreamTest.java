package InputStreamReaderTest;

import java.io.*;

public class PrintfStreamTest {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        // 测试PrintfStream,PrintWriter
        //特有方法，实现数据原样输出
        //特有方法，实现数据同时打印，刷新，换行
        //构造方法
        //public PrintWriter(String fileName)
        //public PrintWriter(OutputStream out)
        //public PrintWriter(File file)
        //public PrintWriter(String fileName,String charsetName)
        //public  printStream(OutputStream out,boolean autoFlush,String charsetName)
        //成员方法
        //public void write(int b)
        //public void println()自动刷新换行
        //public void printf()
        //public void printf(String format,Object...args)
        PrintStream ps = new PrintStream(new FileOutputStream("src/InputStreamReaderTest/1.txt",true),true,"UTF-8");
        ps.println("3825");
        ps.printf("%s","芳草碧连天");
        ps.close();

        PrintWriter pw = new PrintWriter(new FileOutputStream("src/InputStreamReaderTest/2.txt",true),true);
        pw.printf("%s","晴天");
        pw.println("3825");
        pw.close();


    }
}
