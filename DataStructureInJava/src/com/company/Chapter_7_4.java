package com.company;

import java.util.*;

/**
 * Created by yanxia on 2/17/16.
 */

public class Chapter_7_4 {
    public static void tryArrayIteratorRemove(){
        Double[] dt = new Double[]{2.0, 3.0, 4.0};
        String[] st = new String[]{"Jim", "Lucy", "Mike"};
        ArrayList<Double> double_data = new ArrayList<Double>(Arrays.asList(dt));
        ArrayList<String> string_data = new ArrayList<String>(Arrays.asList(st));

        System.out.println(string_data);

        Iterator<String> walker = string_data.iterator();
        while(walker.hasNext()){
            if(walker.next().equals("Jim"))
                walker.remove();
        }

        System.out.println(string_data.toArray());
    }

}
