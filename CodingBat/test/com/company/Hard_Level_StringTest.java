package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yanxia on 2/16/16.
 */
public class Hard_Level_StringTest {

    @Test
    public void testCountYZ() throws Exception {
        assertEquals(2, Hard_Level_String.countYZ("fez day"));
    }

    @Test
    public void testNotReplace() throws Exception {
        Hard_Level_String.notReplace("abc def");
    }

}