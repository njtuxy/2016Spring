import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.*;

/**
 * Created by yanxia on 2/5/16.
 */
public class interView {

    public static void main(String[] args){
        System.out.println("I am using java");
    }


    /*
    public static String[] ticketConverter(String[][] inputTickets){

        Ticket firstTicket = getSmallestLexicalTicketsThatBeginsWith("JFK", inputTickets);
        String[][] local = inputTickets;
        String firstDesintation = firstTicket.toCity;
        System.out.println(firstTicket.stringValue());

        Ticket secondTicket = getSmallestLexicalTicketsThatBeginsWith(firstDesintation, local);
        String secondDestination = secondTicket[1];
        System.out.println(Arrays.toString(secondTicket));

        System.out.println(secondDestination);
        System.out.println(Arrays.deepToString(inputTickets));
        String[] thirdTicket = getSmallestLexicalTicketsThatBeginsWith(secondDestination, local);
        System.out.println(Arrays.toString(thirdTicket));

        return null;
    }
    */

    public static Ticket getSmallestLexicalTicketsThatBeginsWith(String fromCity, Tickets originalTickets){

        Ticket output = null;
        Integer indexOfSmallestTicket = -1;


        for(int i=0; i< originalTickets.tickets.length; i++){
            Ticket t = originalTickets.tickets[i];
            if(t.fromCity ==  fromCity){
                if(output == null){
                    output = t;
                    indexOfSmallestTicket = i;
                }
                else{
                    if(output.toCity.compareTo(t.toCity) > 0){
                        output = t;
                        indexOfSmallestTicket = i;
                    }
                }
            }


        }

        //Set selected status of the smallest ticket:
        System.out.println(indexOfSmallestTicket);
        if(indexOfSmallestTicket != -1){
            originalTickets.tickets[indexOfSmallestTicket].selected = true;
        }

        //Returns an empty String[] if no tickets matches.
        if(output == null){
            return null;
        }else{
            //Return the smallest ticket if found
            return output;
        }
    }


}

//User local struct/class to store the ticket:
class Ticket{
    public String fromCity, toCity;
    public Boolean selected;


    public Ticket(String fromCity, String toCity){
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.selected = false;
    }

    public Ticket(String[] rawTicket){
        this.fromCity = rawTicket[0];
        this.toCity = rawTicket[1];
    }

    public String stringValue(){
        return("["+ this.fromCity + " , "+ this.toCity+"]");
    }

    public Boolean getSelectedStatus(){
        return this.selected;
    }

    public void setSelected(){
        this.selected = true;
    }


}

class Tickets{
    public Ticket[] tickets;

    public Tickets(String[][] rawTickets){

        Ticket[] t = new Ticket[rawTickets.length];

        for(int i=0; i< rawTickets.length; i++){
//              System.out.println(Arrays.deepToString(rawTickets[i]));
            t[i] = new Ticket(rawTickets[i]);
        }
        this.tickets = t;
    }

    public void ticketsValue(){
        for(int i=0; i<tickets.length; i++){
            System.out.print(tickets[i].stringValue() + " ");
        }
        System.out.println();
    }
}
