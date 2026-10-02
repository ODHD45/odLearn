package ioBufferedStream;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BufferedTest02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src\\ioBufferedStream\\3.txt"));

        String line;
        ArrayList<String> list = new ArrayList<String>();
        while ((line = br.readLine()) != null) {
            list.add(line);
        }
        br.close();

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int num1 = Integer.parseInt(o1.split("[^0-9]")[0]);
                int num2 = Integer.parseInt(o2.split("[^0-9]")[0]);
                return num1 - num2;
            }
        });

        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\ioBufferedStream\\3.txt"));
        for (String s : list) {

            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }
}