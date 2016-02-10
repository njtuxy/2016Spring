package com.company;

import org.junit.Test;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;



/**
 * Created by yanxia on 2/9/16.
 */
@RunWith(Parameterized.class)
public class MainTest {

    public String input;
    public String input2;
    public boolean expectedResult;

    public MainTest(String input, String input2, Boolean expectedResult){
        this.input = input;
        this.input2 = input2;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters(name= "{index}: areAnagrams({0}, {1})={2}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { "abc", "cba", true },
                { "abc", "cb", false },
                { "", "cb", false },
                { "", "", false },
                { "worldOfChampions", "ChampionsOfWOrld", false },
        });
    }

    @Test
    public void testAreAnagrams() throws Exception {
        assertEquals(expectedResult, Main.areAnagrams(input, input2));
    }
}