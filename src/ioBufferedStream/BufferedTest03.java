package ioBufferedStream;

import java.io.BufferedReader;
import java.io.*;

public class BufferedTest03 {
    public static void main (String[] arge) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src\\ioBufferedStream\\4.txt"));
        int line;

        if ( ((line = Integer.parseInt(br.readLine()))<=5)){
            line++;
            BufferedWriter bw = new BufferedWriter(new FileWriter("src\\ioBufferedStream\\4.txt"));
            bw.write(line+"");
            bw.close();
        }
        br.close();
    }

}
