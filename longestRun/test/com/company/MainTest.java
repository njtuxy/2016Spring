package com.company;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * Created by yanxia on 2/10/16.
 */
@RunWith(Parameterized.class)
public class MainTest {

    private String inputString;
    private int expectedResult;

    public MainTest(String inputString, int expectedResult){
        this.inputString = inputString;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters(name= "{index}: findTwoSum({0})={1}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { "a" , 0 },
                {"", 0},
                {" ", 0},
                {"ab", 0},
                {"abb", 1},
                { "abbcccddddcccbba" , 6 }
        });
    }

    @Test
    public void testIndexOfLongestRun() throws Exception {
        Assert.assertEquals(expectedResult, Main.indexOfLongestRun(inputString));

    }
}