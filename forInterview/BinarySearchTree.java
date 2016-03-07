package com.company;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;

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

    public Node getRoot(){
        return root;
    }

    BinarySearchTree(){
        root = null;
    }

    public boolean lookUp(int data){
        return lookUp(root, data);
    }

    /**
     * Look up method
     * Assert a value can be found in a tree:
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
            System.out.print(temp.data + " ");
            if(temp.left !=null){
                queue.add(temp.left);
            }
            if(temp.right!=null){
                queue.add(temp.right);
            }
        }
        System.out.println();
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

    /**
     *  Get the min value in the tree
     */
    public int getMinValue(){
        return getMinValue(root);
    }

    //Min value is in the left-most leaf
    private int getMinValue(Node node){
        Node current = node;
        while(current.left !=null)
            current = current.left;
        return current.data;
    }

    /**
     *  Get the max value in the tree
     */
    public int getMaxValue(){
        return getMaxValue(root);
    }

    //Min value is in the left-most leaf
    private int getMaxValue(Node node){
        Node current = node;
        while(current.right !=null)
            current = current.right;
        return current.data;
    }

    /**
     *  Print the node value in the "inorder" order:
     */
    public void inOrderPrint(){
        inOrderPrint(root);
    }

    private void inOrderPrint(Node node) {
        if (node == null) return;
        System.out.print(node.data + "  ");
        inOrderPrint(node.left);
        inOrderPrint(node.right);
    }

    public void printPath(){
        int[] path = new int[1000];
        printPath(root, path, 0);
    }

    private void printPath(Node node, int[] path, int endIndex){
        if(node==null)
            return;

        path[endIndex] = node.data; //if node is not null, save its value to path array
        endIndex++;                           //add endIndex by 1

        if(node.left == null && node.right == null) {       //reach a leaf
            printArray(path, endIndex);                             //print this leaf's path which is in the path array.
        }else{
            printPath(node.left, path, endIndex);
            printPath(node.right, path, endIndex);
        }
    }

    private void printArray(int[] array, int endIndx){
        for(int i=0; i<endIndx; i++){
            System.out.print(array[i] + "  ");
        }
        System.out.println();

    }


/**
 * Create a mirror of a tree:
 */

    public void mirror(){
        root = mirror(root);
    }

    private Node mirror(Node node){
        if(node != null){
            if(node.left!=null && node.right!=null){
                Node temp = node.left;
                node.left = node.right;
                node.right = temp;
            }

            if(node.left != null){
                mirror(node.left);
            }
            if(node.right!=null){
                mirror(node.right);
            }
        }
        return node;
    }

    /*
    *   Double a tree:
    */

    public void doubleTree(){
        root = doubleTree(root);
    }

    private Node doubleTree(Node node){
        if(node!=null){
            doubleTree(node.left);
            doubleTree(node.right);

            //double the node
            Node temp = node.left;
            node.left = new Node(node.data);
            node.left.left = temp;
        }
        return node;
    }


    /*
    *   Asssert 2 trees are same:
    *
    */

    
    public static boolean sameTree(Node node1, Node node2){

        if(node1 == null && node2 == null){
            return true;
        }else{
            if(node1==null || node2 == null)
                return false;
        }

        if(node1.data == node2.data ){
                return sameTree(node1.left, node2.left) && sameTree(node1.right, node2.right);
        }

        return false;
    }

    public boolean isBinarySearchTree(Node node){
        //Print with order, then
        return true;
    }

    public int findMaxValueOfAllNodes(){
        return findMaxValueOfAllNodes(root);
    }

    //find max value of all nodes.
    private int findMaxValueOfAllNodes(Node node) {
        if(node==null)
            return 0;
        if(node.left == null && node.right == null)   //reach a leaf node
            return node.data;
        if(node.left == null && node.right != null)
            return Math.max(node.data, node.right.data);
        if(node.left != null && node.right == null)
            return Math.max(node.data, node.left.data);
        return  Math.max(Math.max(node.data, node.left.data), node.right.data);
    }



    public void  rotate(){
       root =  rotate(root, null, null);
    }

    private Node rotate(Node node, Node left, Node right){

        if(node.left==null){
            node.left = left;
            node.right = right;
        }else{
            Node temp = new Node(node.left.data);
            //rotate the tree
            temp.left= node.right;
            temp.right = node;
            node.right = null;

            Node temp2 = node;
            node = node.left;
            temp2.left = left;
            temp2.right = right;

            node = rotate(node, temp.left, temp.right);
        }

        return node;
    }


    //Interview question for facebook:https://careercup.com/question?id=5749533368647680
    //Calculate the weight of each node on each level:
        
    TreeMap<Integer, ArrayList<Integer>> treeMap = new TreeMap<Integer, ArrayList<Integer>>();
    StringBuilder sb = new StringBuilder();
    public void printColumnOfTree(){
        printColumnOfTree(root, 0);
        for(Entry<Integer, ArrayList<Integer>> e: treeMap.entrySet()){
            for(Integer entry:e.getValue()){
                sb.append(""+ entry);
            }
        }

        System.out.println(sb.toString());
    }

    private void printColumnOfTree(Node node, int weight){
        if(node== null)
            return;

        int localRootWight = weight;
//        System.out.print(node.data + "  " + " weight: " + weight + "    ");
        if( treeMap.get(weight) == null){   //need to insert a new node to treeMap
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            arrayList.add(node.data);
            treeMap.put(weight, arrayList);
        }else{
            treeMap.get(weight).add(node.data);  //update existing treeMap value
        }
        printColumnOfTree(node.left, localRootWight-1);
        printColumnOfTree(node.right,localRootWight+1);
    }













}
