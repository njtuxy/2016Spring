package com.company;

/**
 * Created by yanxia on 2/25/16.
 */
public class BinaryTree {
    private class Node{
        Node right;
        Node left;
        int data;

        Node(int newData){
            data = newData;
            right=null;
            left=null;
        }
    }

    private Node root;


}
