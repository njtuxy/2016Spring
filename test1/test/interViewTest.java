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
        String[][] inputTickets;
        inputTickets =  new String[][]{{"JFK","SFO"},{"JFK","ATL"},{"SFO","ATL"},{"ATL","JFK"},{"ATL","SFO"}};
        String[] expected = {"JFK", "MUC", "LHR", "SFO", "SJC"};
        Tickets originalTickets  = new Tickets(inputTickets);
        interView.ticketConverter(originalTickets);
    }

    public void testTicketConverter2() throws Exception {
        String[][] inputTickets1 = new String[][]{{"MUC", "LHR"}, {"JFK", "MUC"}, {"SFO", "SJC"}, {"LHR", "SFO"}};
        Tickets originalTickets1  = new Tickets(inputTickets1);
        interView.ticketConverter(originalTickets1);
    }

    public void testTicketConverter3() throws Exception {
        String[][] inputTickets1 = new String[][]{{"MUC", "LHR"}};
        Tickets originalTickets1  = new Tickets(inputTickets1);
        interView.ticketConverter(originalTickets1);
    }

    public void testTicketConverter4() throws Exception {
        String[][] inputTickets1 = new String[][]{};
        Tickets originalTickets1  = new Tickets(inputTickets1);
        interView.ticketConverter(originalTickets1);
    }


    public void testGetSmallestLexicalTicketsThatBeginsWith() throws Exception {

        String[][] inputTickets;

        Ticket expected;
        Ticket current;

        /*
        inputTickets =  new String[][]{{"JFK","SFO"},{"JFK","ATL"},{"SFO","ATL"},{"ATL","SFO"}, {"ATL","JFK"},};

        //Read the raw tickets and store them with Ticket class
        Tickets originalTickets  = new Tickets(inputTickets);

        expected =new Ticket("JFK", "ATL") ;
        current= interView.getSmallestLexicalTicketsThatBeginsWith("JFK", originalTickets);
        originalTickets.ticketSelectedStatus();
        Assert.assertEquals(expected.stringValue(), current.stringValue());


        expected = new Ticket("ATL", "JFK");
        current = interView.getSmallestLexicalTicketsThatBeginsWith("ATL", originalTickets);
        originalTickets.ticketSelectedStatus();
        Assert.assertEquals(expected.stringValue(), current.stringValue());

        expected = null;
        current = interView.getSmallestLexicalTicketsThatBeginsWith("OKC", originalTickets);
        originalTickets.ticketSelectedStatus();
        Assert.assertEquals(expected, current);

        inputTickets =  new String[][]{{"JFK","SFO"}};
        Tickets originalTickets1  = new Tickets(inputTickets);
        expected = new Ticket("JFK","SFO");
        current = interView.getSmallestLexicalTicketsThatBeginsWith("JFK", originalTickets1);
        originalTickets1.ticketSelectedStatus();
        Assert.assertEquals(expected.stringValue(), current.stringValue());

        */

        inputTickets =  new String[][]{};
        Tickets originalTickets2  = new Tickets(inputTickets);
//        expected = new Ticket("JFK","SFO");
//        current = interView.getSmallestLexicalTicketsThatBeginsWith("JFK", originalTickets1);
//        originalTickets1.ticketSelectedStatus();
//        Assert.assertEquals(expected.stringValue(), current.stringValue());

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