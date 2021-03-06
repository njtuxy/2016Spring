package com.company;
import java.util.*;

public class Solution {
    public List<String> findItinerary(String[][] tickets) {
        Tickets originalTickets  = new Tickets(tickets);
        return ticketConverter(originalTickets);
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