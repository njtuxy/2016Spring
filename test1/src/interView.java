import java.util.*;

/**
 * Created by yanxia on 2/5/16.
 */
public class interView {

    public static void main(String[] args){
        System.out.println("I am using java");
    }


    public static String[] ticketConverter(String[][] inputTickets){

        String[] firstTicket = getSmallestLexicalTicketsThatBeginsWith("JFK", inputTickets);
        String[][] local = inputTickets;
        String firstDesintation = firstTicket[1];
        System.out.println(Arrays.toString(firstTicket));

        String[] secondTicket = getSmallestLexicalTicketsThatBeginsWith(firstDesintation, local);
        String secondDestination = secondTicket[1];
        System.out.println(Arrays.toString(secondTicket));

        System.out.println(secondDestination);
        System.out.println(Arrays.deepToString(inputTickets));
        String[] thirdTicket = getSmallestLexicalTicketsThatBeginsWith(secondDestination, local);
        System.out.println(Arrays.toString(thirdTicket));

        return null;
    }

    public static String[] getSmallestLexicalTicketsThatBeginsWith(String fromCity, String[][]  inputTickets){

        Ticket output = null;

        //Read the raw tickets and store them with Ticket class
        Tickets origionalTickets  = new Tickets(inputTickets);

        for(int i=0; i< origionalTickets.tickets.length; i++){
            Ticket t = origionalTickets.tickets[i];
//            System.out.print("FROM: " + t.fromCity + " TO: ");
//            System.out.println(t.toCity);


            if(t.fromCity ==  fromCity){
                if(output == null){
                    output = t;
                }
                else{
                    if(output.toCity.compareTo(t.toCity) > 0){
                        output = t;
                    }
                }
            }


        }

        //Returns an empty String[] if no tickets matches.
        if(output == null){
            return new String[]{};
        }else{
            //Return the smallest ticket if found
            return new String[]{output.fromCity, output.toCity};
        }
    }

    //User local struct/class to store the ticket:
    private static class Ticket{
        public String fromCity, toCity;

        public Ticket(String fromCity, String toCity){
            this.fromCity = fromCity;
            this.toCity = toCity;
        }

        public Ticket(String[] rawTicket){
            this.fromCity = rawTicket[0];
            this.toCity = rawTicket[1];
        }
    }

    private static class Tickets{
        public Ticket[] tickets;

        public Tickets(String[][] rawTickets){

            Ticket[] t = new Ticket[rawTickets.length];

            for(int i=0; i< rawTickets.length; i++){
//                System.out.println(Arrays.deepToString(rawTickets[i]));
                t[i] = new Ticket(rawTickets[i]);
            }
            this.tickets = t;
        }
    }


}

//        LinkedList<String[]> output = new LinkedList<String[]>();


//    List<String[]> resultList = new ArrayList<String[]>();


//Iterate over the input tickets, store the tickets that matches fromCity:
//for(int i=0; i<inputTickets.length; i++){
//        if(inputTickets[i] != null){
//        if(inputTickets[i][0] == fromCity){
//        resultList.add(inputTickets[i]);
//        inputTickets[i] = null;
//
//        }
//        }
//        }
//
//        //Prepare the output String array, which contains only one element, which is ["JFK", "SOMEVALUE"]
//        String[] output = {fromCity, null};
//
//        //Loop through the tickets, and find the smallest lexical ticket
//        String temp = null;
//        for(int i=0; i<resultList.size(); i++){
//        if(temp==null){
//        temp = resultList.get(i)[1];
//        continue;
//        }
//        if(temp.compareTo(resultList.get(i)[1]) > 0){
////                System.out.println(temp+" is greater than " + resultList.get(i)[1]);
//        temp = resultList.get(i)[1];
//        }else{
////                System.out.println(temp+" is equal or smaller than " + resultList.get(i)[1]);
//        }
//        }
//
//        //Construct the array that with the smallest lexical value
//        if(temp == null){
//        return new String[]{};
//        }
//
//        output[1] = temp;