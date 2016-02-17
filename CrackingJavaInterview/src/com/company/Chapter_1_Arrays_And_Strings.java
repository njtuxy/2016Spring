package com.company;

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



}
