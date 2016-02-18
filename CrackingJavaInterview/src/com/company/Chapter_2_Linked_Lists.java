package com.company;

/**
 * Created by yanxia on 2/18/16.
 */
public class Chapter_2_Linked_Lists {
}

class Node{
    int value;
    Node next;

    public Node(int value, Node next){
        this.value = value;
        this.next = next;
    }

    public void setNext(Node next){
        this.next = next;
    }
}

class SingleLinkedList{
    Node head;
    Node tail;
    Node temp;

    //Constructor for Integer array to linked list
    public SingleLinkedList(int[] input){

        //Read data and save in nodes.
        for(int e:input){
            Node node = new Node(e, null);
            if(this.temp!=null){
                this.temp.next = node;
                this.temp = node;
            }else{
                //Set the head
               this. head=node;
                this.temp = node;
            }
        }
    }

    public void printLinkedList(){
        //Set a temp pointer to head
        temp = head;
        //Iterate over the node until the pointer is null
        while (temp!=null){
            temp = temp.next;
        }
    }

}