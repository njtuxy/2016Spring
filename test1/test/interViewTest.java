import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yanxia on 2/5/16.
 */

public class interViewTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {

    }

    public void testTicketConverter() throws Exception {
//        tickets = [["MUC", "LHR"], ["JFK", "MUC"], ["SFO", "SJC"], ["LHR", "SFO"]]
        String[][] inputTickets;

        inputTickets =  new String[][]{{"JFK","SFO"},{"JFK","ATL"},{"SFO","ATL"},{"ATL","JFK"},{"ATL","SFO"}};
        String[] expected = {"JFK", "MUC", "LHR", "SFO", "SJC"};
        assertEquals(expected, interView.ticketConverter(inputTickets));

//        System.out.println("here is the array: " + Arrays.toString(expected));
//        System.out.println("here is the array: " + Arrays.toString(inputTickets));
    }

    public void testGetSmallestLexicalTicketsThatBeginsWith() throws Exception {

        String[][] inputTickets;
        String[] expected;
        String[] current;

        inputTickets =  new String[][]{{"JFK","SFO"},{"JFK","ATL"},{"SFO","ATL"},{"ATL","JFK"},{"ATL","SFO"}};

        expected =new String[] {"JFK", "ATL"};
        current= interView.getSmallestLexicalTicketsThatBeginsWith("JFK", inputTickets);
        System.out.println(Arrays.deepToString(inputTickets));
        assertTrue("  EXPECTED is: " + Arrays.toString(expected) + "  CURRENT  is:   " + Arrays.toString(current)   , Arrays.equals(expected, current));

        expected = new String[]{"ATL", "JFK"};
        System.out.println(Arrays.deepToString(inputTickets));
        current = interView.getSmallestLexicalTicketsThatBeginsWith("ATL", inputTickets);
        assertTrue("  EXPECTED is: " + Arrays.toString(expected) + "  CURRENT  is:   " + Arrays.toString(current)   , Arrays.equals(expected, current));



        expected = new String[]{};
        current = interView.getSmallestLexicalTicketsThatBeginsWith("OKC", inputTickets);
        assertTrue("  EXPECTED is: " + Arrays.toString(expected) + "  CURRENT  is:   " + Arrays.toString(current)   , Arrays.equals(expected, current));

        inputTickets =  new String[][]{{"JFK","SFO"}};
        expected = new String[]{"JFK","SFO"};
        current = interView.getSmallestLexicalTicketsThatBeginsWith("JFK", inputTickets);
        assertTrue("  EXPECTED is: " + Arrays.toString(expected) + "  CURRENT  is:   " + Arrays.toString(current)   , Arrays.equals(expected, current));
    }




}

//    String[][] inputTickets = {{"MUC", "LHR"}, {"JFK", "MUC"}, {"SFO", "SJC"}, {"LHR", "SFO"}};
//    String[] expected = {"JFK", "MUC"};
//
//    String[][] inputTickets1 = {{"JFK","SFO"},{"JFK","ATL"},{"SFO","ATL"},{"ATL","JFK"},{"ATL","SFO"}};
//    String[] expected1 = {"JFK", "ATL"};

/*
        Example 1:
        tickets = [["MUC", "LHR"], ["JFK", "MUC"], ["SFO", "SJC"], ["LHR", "SFO"]]
        Return ["JFK", "MUC", "LHR", "SFO", "SJC"].

        Example 2:
        tickets = [["JFK","SFO"],["JFK","ATL"],["SFO","ATL"],["ATL","JFK"],["ATL","SFO"]]
        Return ["JFK","ATL","JFK","SFO","ATL","SFO"].
*/