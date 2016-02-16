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
 * Created by yanxia on 2/9/16.
 */
@RunWith(Parameterized.class)
public class MainTest {

    private String input;
    private boolean expectedOutPut;

    public MainTest(String input, boolean expectedOutPut){
        this.input = input;
        this.expectedOutPut = expectedOutPut;
    }

    @Parameterized.Parameters(name= "{index}: findTwoSum({0})={1}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {"", true},
                {"a", true},
                {"aba", true},
                { "abcddcba" , true},
                {"Noel sees Leon.", true},
                {"Noel sees Leon..", true},
                {"Noel sees Leonn",false}
        });
    }

    @Test
    public void testIsPalindrome() throws Exception {
        Assert.assertEquals(expectedOutPut, Main.isPalindrome(input));

    }
}