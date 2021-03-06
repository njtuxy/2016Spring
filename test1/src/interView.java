import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.*;

/**
 * Created by yanxia on 2/5/16.
 */



public class interView {

    public static void main(String[] args){
        System.out.println("I am using java");
    }


    public static List<String> ticketConverter2(Tickets inputTickets){
        TreeSet<Ticket> orderdTickets = new TreeSet<Ticket>(new TicketComparator());

        for(int i=0; i< inputTickets.tickets.length; i++){
            orderdTickets.add(inputTickets.tickets[i]);
        }

//        for(Ticket t:orderdTickets){
//            if(t.fromCity=="JFK"){
//                System.out.println(t.stringValue());
//            }
//        }


        Ticket t1 = inputTickets.tickets[0];
        Ticket t2 = inputTickets.tickets[1];
//        SortedSet<Ticket>  ticketSet = orderdTickets.subSet(t1, t2);
//        System.out.println(ticketSet);


        return null;
    }

    public static List<String> ticketConverter(Tickets inputTickets){
        List<Ticket> outputTickets = new ArrayList<Ticket>();

        for(int i=0; i< inputTickets.tickets.length; i++){
            Ticket t;
            if(outputTickets.size() == 0){
                t = getSmallestLexicalTicketsThatBeginsWith("JFK", inputTickets);
                if(t == null){
                    break;
                }else{
                    outputTickets.add(t);
                }

            }else{
                t=getSmallestLexicalTicketsThatBeginsWith(outputTickets.get(outputTickets.size()-1).toCity, inputTickets);
                if(t==null){
                    break;
                }else{
                    outputTickets.add(t);
                }
            }
        }

        String[] outputString = new String[outputTickets.size()+1];
        List<String> outPutListString = new ArrayList<String>();

        System.out.println(outputTickets.size());

        for(int i=0; i<outputTickets.size(); i++){
            outPutListString.add(outputTickets.get(i).fromCity);

        }
        if(outputTickets.size() > 0){
            outPutListString.add(outputTickets.get(outputTickets.size()-1).toCity);
        }

        for(int i = 0; i<outPutListString.size(); i++){
            System.out.println(outPutListString.get(i));
        }

        return outPutListString;
    }


    public static Ticket getSmallestLexicalTicketsThatBeginsWith(String fromCity, Tickets originalTickets){

        Ticket output = null;
        Integer indexOfSmallestTicket = -1;


        for(int i=0; i< originalTickets.tickets.length; i++){
            Ticket t = originalTickets.tickets[i];

            if(!t.getSelectedStatus()){

                if(t.fromCity.equals(fromCity)){
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

        }

        //Set selected status of the smallest ticket:
//        System.out.println(indexOfSmallestTicket);
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
        this.selected = false;
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

    public void ticketSelectedStatus(){
        for(int i=0; i<tickets.length; i++){
            System.out.print(tickets[i].getSelectedStatus() + " ");
        }
        System.out.println();

    }
}

class TicketComparator implements Comparator<Ticket>{

    @Override
    public int compare(Ticket t1, Ticket t2){
        if(t1.toCity.compareTo(t2.toCity) > 0){
            return 1;
        }else{
            return -1;
        }
    }

}
