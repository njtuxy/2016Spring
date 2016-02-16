package com.company;

/**
 * Created by yanxia on 2/11/16.
 */
public class Main {
    public static void main(String[] args) {
        Path path = new Path("/a/b/c");
        path.cd("../../x");

    }

    public static void debug(String input){
        System.out.println(input);
    }

    public static void debug(char input){
        System.out.println(input);
    }


}
