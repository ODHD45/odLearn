package com.odhd.streamtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class test04 {
    public static void main(String[] args) {
        /*
        流的终端操作：
        forEach
        collect
        count
        toArray
         */
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "李果-52", "张香蕉-34", "李葡萄-52", "陈山楂-12","李葡-53");

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "宋桃子-45", "王山楂-34");

        System.out.println("--------forEach---------");
        list.stream().forEach(s->System.out.println(s));

        System.out.println("--------collect--------");
        System.out.println("-Collectors.toList()-");
        list.stream()
                .filter(s->s.startsWith("李"))
                .collect(Collectors.toList())
                .forEach(s->System.out.println(s));

        System.out.println("-Collectors.toSet()-");

        list.stream()
                .filter(s->s.split("-")[1].equals("52"))
                .collect(Collectors.toSet())
                .forEach(s->System.out.println(s));

        System.out.println("-Collectors.toMap()-");

        list.stream()
                .filter(s->s.startsWith("李"))
                .collect(Collectors.toMap(s->s.split("-")[0],s->Integer.parseInt(s.split("-")[1])))
                .forEach((k,v)->System.out.println(k+"-"+v));

        System.out.println("--------count---------");

        System.out.println(list.stream().count());

        System.out.println("-------toArray---------");

        String [] arr = list.stream()
               .toArray(value ->new String[value]);
        System.out.println(Arrays.toString(arr));


    }
}
