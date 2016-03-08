import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yanxia on 3/7/16.
 */
public class ReversePolishNotationTest {
    private static final double DELTA = 1e-15;

    @Test
    public void testReverserPolishNotationValue() throws Exception {
        assertEquals(10.0, ReversePolishNotation.reverserPolishNotationValue(new String[]{"4", "1", "+", "2", "*"}), DELTA);
        assertEquals(7.0, ReversePolishNotation.reverserPolishNotationValue(new String[]{"5", "80", "40", "/", "+"}), DELTA);
//        assertEquals(new IllegalArgumentException(), ReversePolishNotation.reverserP4olishNotationValue(new String[]{"5", "0", "/"}));
    }


}