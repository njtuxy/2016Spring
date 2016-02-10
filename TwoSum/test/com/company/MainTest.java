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
public class MainTest extends TestCase {

    private int[]  inputList;
    private int inputSum;
    private int[] expectedOutPutList;

    public MainTest(int[] inputList, int inputSum, int[] expectedOutPutList){
        this.inputList = inputList;
        this.inputSum = inputSum;
        this.expectedOutPutList = expectedOutPutList;
    }

    @Parameterized.Parameters(name= "{index}: findTwoSum({0}, {1})={2}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { new int[]{1,3,5,7,9} , 12, new int[]{1,4} },
                { new int[]{1,3,5,7,9} , 1000, null },
                { new int[]{} , 0, null },
                { new int[]{0,0} , 0, new int[]{0,1} },
                { new int[]{-1, 0, 1, 2}, -1, new int[]{0,1}},
                { new int[]{0,1,2,3}, 5, new int[]{2,3}},
                { new int[]{1}, 5, null}
        });
    }


    @Test
    public void testFindTwoSum() throws Exception {
        Assert.assertArrayEquals(expectedOutPutList, Main.findTwoSum(inputList, inputSum));
    }
}