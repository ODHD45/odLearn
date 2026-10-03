package InputStreamReaderTest;

import java.io.*;

public class ObjectInputSreamTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //序列化流和反序列化流的使用

        Student s = new Student("张三", 18);
        Student s2 = new Student("李四", 18);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/InputStreamReaderTest/02.txt"));
        oos.writeObject(s);
        oos.writeObject(s2);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/InputStreamReaderTest/02.txt"));

        Student s1 = (Student) ois.readObject();
        Student s3 = (Student) ois.readObject();
        ois.close();
        System.out.println(s1);
        System.out.println(s3);
    }
}
