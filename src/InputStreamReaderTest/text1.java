package InputStreamReaderTest;

import java.io.*;
import java.util.ArrayList;

public class text1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s1 = new Student("张三",5, 18);
        Student s2 = new Student("李四",5, 18);
        Student s3 = new Student("王五",5, 18);

       ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/InputStreamReaderTest/student.txt"));
       ArrayList<Student> students = new ArrayList<>();
       students.add(s1);
       students.add(s2);
       students.add(s3);
       oos.writeObject(students);
//        oos.writeObject(s1);
//        oos.writeObject(s2);
//        oos.writeObject(s3);
        oos.close();
       ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/InputStreamReaderTest/student.txt"));
//        Student s;
//        try {
//            while (true) {
//                s = (Student) ois.readObject();
//                System.out.println(s);
//            }
//        } catch (EOFException e) {
//            // 读到流末尾，正常结束
//        }
//        ois.close();

        ArrayList<Student> students1 = (ArrayList<Student>) ois.readObject();
        for (Student a :students1) {
            System.out.println(a);
        }
        ois.close();

    }
}