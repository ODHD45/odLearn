package ioBufferedStream;

import java.io.*;

public class BufferedRraderTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src\\ioBufferedStream\\1.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\ioBufferedStream\\2.txt"));

        String line;

//        line = br.readLine();
//        System.out.println(line);

        while ((line = br.readLine())!=null){
            bw.write(line+"\n");
            bw.newLine();
        }

        bw.close();
        br.close();
    }
}
