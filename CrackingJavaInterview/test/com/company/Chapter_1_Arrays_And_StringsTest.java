package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yanxia on 2/17/16.
 */
public class Chapter_1_Arrays_And_StringsTest {

    @Test
    public void testReplaceStringWithSpecialChar() throws Exception {
        assertEquals("Mr%20John%20Smith", Chapter_1_Arrays_And_Strings.replaceStringWithSpecialChar("Mr John Smith"));
        assertEquals("%20", Chapter_1_Arrays_And_Strings.replaceStringWithSpecialChar(" "));
        assertEquals("%20Mr%20John%20Smith", Chapter_1_Arrays_And_Strings.replaceStringWithSpecialChar(" Mr John Smith"));
        assertEquals("%20Mr%20John%20Smith%20", Chapter_1_Arrays_And_Strings.replaceStringWithSpecialChar(" Mr John Smith "));
        assertEquals("", Chapter_1_Arrays_And_Strings.replaceStringWithSpecialChar(""));
        assertEquals("Mr%20John%20%20Smith", Chapter_1_Arrays_And_Strings.replaceStringWithSpecialChar("Mr John  Smith"));
    }

    @Test
    public void testCompressString() throws Exception {
//        assertEquals("a2c1d1", Chapter_1_Arrays_And_Strings.compressString("aacd"));
        assertEquals("a1b1c1d1", Chapter_1_Arrays_And_Strings.compressString("abcd"));

    }

    @Test
    public void TestSingleLinkedList() throws Exception{
        int[] input = {1,2,3};
        SingleLinkedList list = new SingleLinkedList(input);
        list.printLinkedList();
        list.removeValueFromList(2);
        list.printLinkedList();
        list.removeValueFromList(1);
        list.printLinkedList();
        list.removeValueFromList(3);
        list.printLinkedList();
    }
}