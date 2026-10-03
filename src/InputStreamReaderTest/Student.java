package InputStreamReaderTest;

import java.io.Serializable;

public class Student implements Serializable {

    //实现Serializable接口，则该类可以被序列化，标记为可序列化类


    //如果该类的序列化版本号与反序列化时的版本号不一致，则会抛出ClassNotFoundException异常
    //如果该类的序列化版本号与反序列化时的版本号一致，则不会抛出异常
    //serialVersionUID是一个静态常量，用于标识该类的序列化版本号,固定版本号
    private static final long serialVersionUID = 202308241000000000L;
    private String name;
    private int grade;

    //transient关键字用于标识该字段不参与序列化，即不被写入到序列化流中

    private transient int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student( String name, int grade, int age) {

        this.name = name;
        this.grade = grade;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", grade = " + grade + ", age = " + age + "}";
    }

    /**
     * 获取
     * @return grade
     */
    public int getGrade() {
        return grade;
    }

    /**
     * 设置
     * @param grade
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }
}