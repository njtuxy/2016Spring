package com.company;

import java.util.Hashtable;
import java.util.LinkedList;

/**
 * Created by yanxia on 2/17/16.
 */
public class Chapter_1_Arrays_And_Strings {
    /*
    * Implement an algorithm to determine if a string has all unique characters.
    * What if you cannot use additional data structure?
    */

    public boolean isStringHasUniqueCharacters(String input){
        return false;
    }

    /*
    * Write a method to replace all spaces in a string with'%20'.
    * You may assume that the string has sufficient space at the end of the string to hold the additional characters,
     * and that you are given the "true" length of the string. (Note: if implementing in Java, please use a character array
      * so that you can perform this operation in place.)
      * EXAMPLE
      * Input: "Mr John Smith
       * Output: "Mr%20John%20Smith"
    */

    public static String replaceStringWithSpecialChar(String input){
        char[] chars = input.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i< chars.length; i++){
            if(chars[i] == ' '){
                sb.append("%20");
            }else{
                sb.append(chars[i]);
            }

        }

        return sb.toString();

    }

    public static Hashtable<Integer, String> buildMap(String[] strings){
        Hashtable<Integer, String > map = new Hashtable<Integer, String>();
        for(int i=0; i<strings.length; i++)
            map.put(i, strings[i]);
        return map;
        }


    /*
    * 1.5. One Away:
    */
    public static boolean oneAway(String inputA, String inputB){
        int al = inputA.length();
        int bl = inputB.length();

        if(al == bl){
            return tryReplace(inputA, inputB);
        }

        if(al>bl){
            if(al-bl>1){
                return false;
            }else{
                return tryAdd(inputA, inputB);
            }
        }

        if(al < bl){
            if(bl-al>1){
                return false;
            }else{
                return tryAdd(inputB, inputA);
            }
        }
        return false;

    }

    static boolean  tryReplace(String inputA, String inputB){
        boolean found = false;
        for(int i=0; i<inputA.length()-1; i++){
            if((inputA.charAt(i) != (inputB.charAt(i)))){
                if (found){
                    return false;
                }else{
                    found = true;
                }
            }
        }
        return true;
    }

    static boolean tryAdd(String inputA, String inputB){
        int index1 = 0;
        int index2 = 0;
        while(index1<inputA.length() && index2<inputB.length()){
            if(inputA.charAt(index1) == inputB.charAt(index2)){
                index1++;
                index2++;
            }else{
                index1++;
            }
        }

        return index1==index2 || (index1-index2==1);
    }


    /*
    * 1.6 String compression:
    */
    public static String compression(String input){
        int index1 = 0;
        int index2 = 0;
        int count = 1;
        StringBuilder sb = new StringBuilder();

        while(index1<input.length()){
            char current = input.charAt(index1);

            if((index1+1<input.length()) &&(current == input.charAt(index1+1))){ //Execute only when the current char is not the last one in the String.
                //Move index to next char in the string.
                index1++;
                //Found one, which is same as last one, add counter.
                count++;
            }else{
                sb.append(current);
                sb.append(count);
                index1++;
                count=1;
            }
        }

        if(sb.toString().length() > input.length())
            return input;
        else
            return sb.toString();
    }









}







