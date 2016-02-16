package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yanxia on 2/15/16.
 */
public class Medium_Level_StringTest {

    @Test
    public void testCatDog() throws Exception {
        assertTrue(Medium_Level_String.catDog("catdog"));
        assertFalse(Medium_Level_String.catDog("catcat"));

    }

    @Test
    public void testEndOther() throws Exception {
        assertTrue(Medium_Level_String.endOther("", ""));
        assertTrue(Medium_Level_String.endOther("a", ""));
        assertTrue(Medium_Level_String.endOther("", "a"));
        assertTrue(Medium_Level_String.endOther("a", "a"));
        assertTrue(Medium_Level_String.endOther("abc", "ddabc"));
        assertTrue(Medium_Level_String.endOther("abcdef", "def"));
        assertTrue(Medium_Level_String.endOther("def", "abcdef"));
        assertTrue(Medium_Level_String.endOther("abcdef", "abcdef"));
    }

    @Test
    public void testXyzThere() throws Exception {
//        assertFalse(Medium_Level_String.xyzThere("yz"));
//        assertTrue(Medium_Level_String.xyzThere("xyz"));
//        assertTrue(Medium_Level_String.xyzThere("xyzaa"));
//        assertTrue(Medium_Level_String.xyzThere("abcxyz"));
//        assertTrue(Medium_Level_String.xyzThere("xyz.abc"));
//        assertFalse(Medium_Level_String.xyzThere("abc.xyz"));
//        assertFalse(Medium_Level_String.xyzThere("abc.xyz"));
//        assertTrue(Medium_Level_String.xyzThere("abcxyz"));
        assertTrue(Medium_Level_String.xyzThere("xyz.abc"));
    }

    @Test
    public void testXyBalance() throws Exception {
        assertTrue(Medium_Level_String.xyBalance("aaxbby"));
    }
}