package com.odhd.streamtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class test02 {
    public static void main(String[] args) {

        /*
        获取steam流：
        单列集合
        多列集合
        数组
        其他零散数据
        */

        System.out.println("--------单列集合--------");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("李果");
        list1.add("张香蕉");
        list1.add("李葡萄");
        list1.add("陈山楂");

        Stream<String> stream1 = list1.stream();

        stream1.filter(s->s.startsWith("李")).forEach(s->System.out.println(s));


        System.out.println("-------多列集合---------");

        HashMap<String, String> map1 = new HashMap<>();
        map1.put("李果", "45");
        map1.put("张香蕉", "67");
        map1.put("李葡萄", "89");

        map1.keySet().stream().forEach(s->System.out.println(s));

        map1.entrySet().stream().forEach(s->System.out.println(s));

        System.out.println("-------数组---------");

        int[] arr1 = {1,2,3,4,5};
        String[] arr2 = {"李果","张香蕉","李葡萄","陈山楂"};

        Arrays.stream(arr1).forEach(s->System.out.println(s));

        Arrays.stream(arr2).forEach(s->System.out.println(s));

        System.out.println("-------其他---------");

        Stream.of(1,2,3,5,7).forEach(s->System.out.println(s));
    }
}
