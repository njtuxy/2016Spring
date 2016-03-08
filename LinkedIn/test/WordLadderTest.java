import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

/**
 * Created by yanxia on 3/8/16.
 */
public class WordLadderTest {

    @Test
    public void testLengthOfShortestTransformation() throws Exception {
        HashSet<String> dict = new HashSet<String>();
        dict.add("hot"); dict.add("dot"); dict.add("dog"); dict.add("lot"); dict.add("log");
        System.out.println(WordLadder.lengthOfShortestTransformation("hit", "log", dict ));
    }

}