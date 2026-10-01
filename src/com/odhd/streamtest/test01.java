package com.odhd.streamtest;

import java.util.ArrayList;

public class test01 {
    public static void main(String[] args) {
        /*
        流的使用：
         */
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("李果");
        list1.add("张香蕉");
        list1.add("李葡萄");
        list1.add("陈山楂");

        ArrayList<String> list2 = new ArrayList<>();
        for (String s : list1) {
            if (s.startsWith("李")) {
                list2.add(s);
            }
        }

        ArrayList<String> list3 = new ArrayList<>();
        for (String s : list2) {
            if (s.length() ==3 ) {
                list3.add(s);
            }
        }

        for (String s : list3) {
            System.out.println(s);
        }

        System.out.println("--------stream流--------");

        list1.stream().filter(s -> s.startsWith("李"))
                .filter(s -> s.length() ==3 )
                .forEach(System.out::println);

    }

}
