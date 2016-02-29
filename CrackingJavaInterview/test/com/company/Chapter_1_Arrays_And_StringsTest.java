package com.company;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;

import static org.junit.Assert.*;

/**
 * Created by yanxia on 2/17/16.
 */
public class Chapter_1_Arrays_And_StringsTest {

    @Test
    public void testReplaceStringWithSpecialChar() throws Exception {
        assertEquals("Mr%20John%20Smith", Chapter_1_Arrays_And_Strings.replaceStringWithSpecialChar("Mr John Smith"));
        assertEquals("%20", Chapter_1_Arrays_And_Strings.replaceStringWithSpecialChar(" "));
        assertEquals("%20Mr%20John%20Smith", Chapter_1_Arrays_And_Strings.replaceStringWithSpecialChar(" Mr John Smith"));
        assertEquals("%20Mr%20John%20Smith%20", Chapter_1_Arrays_And_Strings.replaceStringWithSpecialChar(" Mr John Smith "));
        assertEquals("", Chapter_1_Arrays_And_Strings.replaceStringWithSpecialChar(""));
        assertEquals("Mr%20John%20%20Smith", Chapter_1_Arrays_And_Strings.replaceStringWithSpecialChar("Mr John  Smith"));
    }

    @Test
    public void testCompressString() throws Exception {
//        assertEquals("a2c1d1", Chapter_1_Arrays_And_Strings.compressString("aacd"));
//        assertEquals("a1b1c1d1", Chapter_1_Arrays_And_Strings.compressString("abcd"));
    }

    @Test
    public void TestSingleLinkedList() throws Exception{
        int[] input = {1,2,3};
        SingleLinkedList list = new SingleLinkedList(input);
        list.printLinkedList();
        list.removeValueFromList(2);
        list.printLinkedList();
        list.removeValueFromList(1);
        list.printLinkedList();
        list.removeValueFromList(3);
        list.printLinkedList();
    }

    @Test
    public void TestStack() throws Exception{
        StackDemo sd = new StackDemo();
        sd.push("A");
        sd.push("B");
        sd.push("C");
        System.out.println(sd.size());
        System.out.println(sd.pop());
        System.out.println(sd.pop());
        System.out.println(sd.pop());
    }

    @Test
    public void TestHashMap() throws  Exception{
        String[] input = new String[]{"A", "B", "C"};
        Hashtable a = Chapter_1_Arrays_And_Strings.buildMap(input);
        System.out.println(a.get(1));
    }

    @Test
    public void testOneAway() throws Exception{
        assertTrue(Chapter_1_Arrays_And_Strings.oneAway("abcd", "abc"));
        assertTrue(Chapter_1_Arrays_And_Strings.oneAway("abcd", "abcde"));
//        assertTrue(Chapter_1_Arrays_And_Strings.oneAway("abcd", "bc"));
    }

    @Test
    public void testCompression() throws Exception{
        assertEquals("a",Chapter_1_Arrays_And_Strings.compression("a"));
        assertEquals("ac",Chapter_1_Arrays_And_Strings.compression("ac"));
        assertEquals("acc",Chapter_1_Arrays_And_Strings.compression("acc"));
        assertEquals("a3b2c2",Chapter_1_Arrays_And_Strings.compression("aaabbcc"));
        assertEquals("a3b4c4d1",Chapter_1_Arrays_And_Strings.compression("aaabbbbccccd"));
//        assertEquals("a3b2c2",Chapter_1_Arrays_And_Strings.compression("aaabbcc"));
    }

    @Test
    public  void testBinaryTree() throws Exception{
        BinarySearchTree tree1 = new BinarySearchTree();
        BinarySearchTree tree2 = new BinarySearchTree();
        tree1.insert(10); tree1.insert(6);tree1.insert(11);
        tree1.insert(4);tree1.insert(7);tree1.insert(3);tree1.insert(5);
//        tree1.inOrderPrint();
        tree1.printColumnOfTree();
//        tree2.insert(1); tree2.insert(8);tree2.insert(5); tree2.insert(4); tree2.insert(9);
//        bst.mirror();
//        tree1.BFSPrint();
//        tree1.rotate();
//        tree1.BFSPrint();
//        tree2.BFSPrint();
//        System.out.println(BinarySearchTree.sameTree(tree1.getRoot(), tree2.getRoot()));
//        bst.inOrderPrint();
//        bst.printPath();
//       System.out.println( tree1.findMaxValueOfAllNodes());

    }

    @Test
    public void testInterview() throws Exception{
        int[] array = new int[]{0,0,1};
        int[] array1 = new int[]{1,0,1};
        int[] array2 = new int[]{1,0,1};
        System.out.println(Arrays.toString(Interview.arrayPlusNumber(array,4)));
        System.out.println(Arrays.toString(Interview.arrayPlusNumber(array2,1000)));
    }

    @Test
    public void testDoBinarySearch() throws Exception{
        int[] test = new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(BinarySearch.doBinarySearch(test, 0));
        System.out.println(BinarySearch.doBinarySearch(test, 1));
        System.out.println(BinarySearch.doBinarySearch(test, 2));
        System.out.println(BinarySearch.doBinarySearch(test, 3));
        System.out.println(BinarySearch.doBinarySearch(test, 4));
        System.out.println(BinarySearch.doBinarySearch(test, 5));
        System.out.println(BinarySearch.doBinarySearch(test, 6));
        System.out.println(BinarySearch.doBinarySearch(test, 7));
        System.out.println(BinarySearch.doBinarySearch(test, 8));
        System.out.println(BinarySearch.doBinarySearch(test, 9));
        System.out.println(BinarySearch.doBinarySearch(test, 10));
    }

    @Test
    public void testCollection() throws Exception{
//        CollectionDemos.hashSetDemo();
        CollectionDemos.linkedHashSetExample();
//        CollectionDemos.treeSetExample();
//        CollectionDemos.hashMapExample();
//        CollectionDemos.linkedHashMapExample();
//        CollectionDemos.treeMapExample();
//        CollectionDemos.arrayListExampe();
    }

}