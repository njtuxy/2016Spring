package com.company;

import org.junit.Test;

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
        tree1.insert(10); //tree1.insert(8);tree1.insert(5); tree1.insert(4);
        tree2.insert(1); //tree2.insert(8);tree2.insert(5); tree2.insert(4); tree2.insert(9);
//        bst.mirror();
//        tree1.BFSPrint();
//        tree2.BFSPrint();
        System.out.println(BinarySearchTree.sameTree(tree1.getRoot(), tree2.getRoot()));
//        bst.inOrderPrint();
//        bst.printPath();
    }

}