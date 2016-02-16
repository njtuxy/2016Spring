package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yanxia on 2/15/16.
 */
public class Chapter_5_1Test {

    @Test
    public void testFactorial() throws Exception {
        System.out.println(Chapter_5_1.factorial(-1));
        System.out.println(Chapter_5_1.factorial(0));
        System.out.println(Chapter_5_1.factorial(1));
        System.out.println(Chapter_5_1.factorial(2));
        System.out.println(Chapter_5_1.factorial(3));

    }
}