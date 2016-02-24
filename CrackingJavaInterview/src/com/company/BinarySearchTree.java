package com.company;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by yanxia on 2/24/16.
 */
public class BinarySearchTree {
    private static class Node{
         Node left;
         Node right;
         int data;

        /**
         * Node constructor
         */
        Node(int newData){
            data = newData;
            left = null;
            right = null;
        }
    }

    private Node root;

    BinarySearchTree(){
        root = null;
    }

    public boolean lookUp(int data){
        return lookUp(root, data);
    }

    /**
     * Look up method
      */
    private boolean lookUp(Node node, int data){
        if(node==null){
            return false;
        }

        if(data == node.data){
            return  true;
        }
        else{
            if(data < node.data){
                return lookUp(node.left, data);
            }
            else{
                return lookUp(node.right, data);
            }
        }
    }

    public void insert(int data){
        root = insert(root, data);
    }

    /*
    * insert data to current tree.
    */
    public Node insert(Node node, int data){
        if(node == null){
            node = new Node(data);
        }else{
            if(data <= node.data){
                node.left = insert(node.left, data);
            }else{
                node.right = insert(node.right, data);
            }
        }
        return node;
    }

    public void BFSPrint(){
        BFSPrint(root);
    }

    /**
     * print all values in the tree, with BFS - implementation with Queue
     */

    private void BFSPrint(Node node){
        LinkedList<Node>  queue = new LinkedList<Node>();
        Node temp;
        if(node!=null){
            queue.addLast(node);
        }else{
            System.out.println("tree has no nodes!!");
        }
        while (!queue.isEmpty()){
            temp = queue.poll();
            System.out.println(temp.data);
            if(temp.left !=null){
                queue.add(temp.left);
            }
            if(temp.right!=null){
                queue.add(temp.right);
            }
        }
    }

    //Return the number of the nodes int the tree:
    public int sizeWithRecursion(){
        return sizeWithRecursion(root);
    }

    public int sizeWithQueue(){
        return sizeWithQueue(root);
    }

    private int sizeWithRecursion(Node node){
        if(node == null){
            return 0;
        }else{
            return sizeWithRecursion(node.left) + 1 + sizeWithRecursion(node.right);
        }
    }

    private int sizeWithQueue(Node node){
        Queue<Node> queue = new LinkedList<Node>();
        Node temp;
        int count = 0;
        if(node != null){
            queue.add(node);
        }
        while(!queue.isEmpty()){
            count++;
            temp = queue.poll();
            if(temp.left!=null)
                queue.add((temp.left));
            if(temp.right!=null)
                queue.add(temp.right);
        }
        return count;
    }

    /**
     *  Get the max depth of the tree
     */
    public int getMaxDepth(){
        return getMaxDepth(root);
    }

    private int getMaxDepth(Node node){
        if(node==null)
            return 0;
        if(node.left ==null && node.right==null)
            return 1;
        else
            return Math.max(getMaxDepth(node.left), getMaxDepth(node.right))+1;


    }


}
