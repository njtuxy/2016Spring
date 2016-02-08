import junit.framework.Assert;
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
//        assertEquals(expected, interView.ticketConverter(inputTickets));

//        System.out.println("here is the array: " + Arrays.toString(expected));
//        System.out.println("here is the array: " + Arrays.toString(inputTickets));
    }

    public void testGetSmallestLexicalTicketsThatBeginsWith() throws Exception {

        String[][] inputTickets;

        Ticket expected;
        Ticket current;

        inputTickets =  new String[][]{{"JFK","SFO"},{"JFK","ATL"},{"SFO","ATL"},{"ATL","SFO"}, {"ATL","JFK"},};

        //Read the raw tickets and store them with Ticket class
        Tickets originalTickets  = new Tickets(inputTickets);

        expected =new Ticket("JFK", "ATL") ;
        current= interView.getSmallestLexicalTicketsThatBeginsWith("JFK", originalTickets);
        Assert.assertEquals(expected.stringValue(), current.stringValue());


        expected = new Ticket("ATL", "JFK");
        current = interView.getSmallestLexicalTicketsThatBeginsWith("ATL", originalTickets);
        Assert.assertEquals(expected.stringValue(), current.stringValue());

        expected = null;
        current = interView.getSmallestLexicalTicketsThatBeginsWith("OKC", originalTickets);
        Assert.assertEquals(expected, current);

        inputTickets =  new String[][]{{"JFK","SFO"}};
        Tickets originalTickets1  = new Tickets(inputTickets);
        expected = new Ticket("JFK","SFO");
        current = interView.getSmallestLexicalTicketsThatBeginsWith("JFK", originalTickets1);
        Assert.assertEquals(expected.stringValue(), current.stringValue());

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