package com.company;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by yanxia on 2/15/16.
 */
public class Chapter_3_5_CloneTest {

    @Test
    public void testDeepArrayClone() throws Exception {
        int[][] test = new int[2][2];
        test[0][0] = 1;
        test[0][1] =2;
        test[1][0] = 3;
        test[1][1] =4;
        assertTrue(Arrays.deepEquals(test, Chapter_3_5_Clone.deepArrayClone(test)));
    }

    @Test
    public void testFontTimes() throws Exception {
        System.out.println(Chapter_3_5_Clone.fontTimes("Chocolate",2));

    }
}