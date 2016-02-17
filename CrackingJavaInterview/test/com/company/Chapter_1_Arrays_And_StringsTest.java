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
}