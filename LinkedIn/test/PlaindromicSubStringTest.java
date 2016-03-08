import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yanxia on 3/7/16.
 */
public class PlaindromicSubStringTest {

    @Test
    public void testHelper() throws Exception {
//        System.out.println(PlaindromicSubString.isPlaindromic("abba"));
//        System.out.println(PlaindromicSubString.isPlaindromic("abba"));
//        System.out.println(PlaindromicSubString.isPlaindromic("abcba"));
//        System.out.println(PlaindromicSubString.isPlaindromic("abccba"));
//        System.out.println(PlaindromicSubString.isPlaindromic("abcdba"));

//        System.out.println(PlaindromicSubString.helper("abba", 1,2 ));
//        System.out.println(PlaindromicSubString.helper("aba", 1,1 ));

        System.out.println(PlaindromicSubString.findLongestPlaindromicSubString("abccbxx"));
        System.out.println(PlaindromicSubString.findLongestPlaindromicSubString("bccb"));
        System.out.println(PlaindromicSubString.findLongestPlaindromicSubString("bccbxd"));
    }
}