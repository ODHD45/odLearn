package com.odhd.streamtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Stream;

public class test03 {
    public static void main(String[] args) {
        /*
        流的中间操作：
        filter
        limit
        skip
        distinct
        map
        concat
         */
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "李果-52", "张香蕉-34", "李葡萄-23", "陈山楂-12","李葡萄-52");

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "宋桃子-45", "王山楂-34");

        System.out.println("--------filter---------");

        list.stream().filter(s->s.startsWith("李")).forEach(s->System.out.println(s));

        System.out.println("--------limit---------");

        list.stream().limit(2).forEach(s->System.out.println(s));

        System.out.println("--------skip---------");

        list.stream().skip(2).forEach(s->System.out.println(s));

        list.stream().skip(1).limit(2).forEach(s->System.out.println(s));

        System.out.println("-------distinct---------");

        list.stream().distinct().forEach(s->System.out.println(s));

        System.out.println("--------map---------");

        list.stream().map(new Function<String, Integer>() {
                              @Override
                              public Integer apply(String s) {
                                  String[] arr = s.split("-");
                                  return Integer.parseInt(arr[1]);
                              }
                          }

        );
        list.stream().map(s-> Integer.parseInt(s.split("-")[1])).forEach(s->System.out.println(s));

        System.out.println("--------concat---------");

        Stream.concat(list.stream(), list2.stream()).forEach(s->System.out.println(s));


    }
}
