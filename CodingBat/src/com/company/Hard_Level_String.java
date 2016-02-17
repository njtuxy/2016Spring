package com.company;

import java.util.Stack;

/**
 * Created by yanxia on 2/16/16.
 */
public class Hard_Level_String {

    /*
    * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive).
    * We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it.
    * (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
    * //PASSED!!
    * */

    public static int countYZ(String str) {
        int counter = 0;
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<str.length(); i++){
            char t = str.charAt(i);
            System.out.println(t);
            if(Character.isLetter(t))
                stack.push(t);
            else{
                if(!stack.isEmpty()){
                    System.out.println(stack);
                    if(Character.toLowerCase(stack.peek()) == 'y' || Character.toLowerCase(stack.peek()) == 'z'){
                        counter++;
                    }
                }
                stack.push(t);
            }

        }

        int index = str.length()-1;
        if(Character.toLowerCase(str.charAt(index)) == 'y' || Character.toLowerCase(str.charAt(index)) == 'z')
            counter++;
        return counter;
    }

    /*
    * Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not".
    * The word "is" should not be immediately preceeded or followed by a letter --
     * so for example the "is" in "this" does not count. (Note: Character.isLetter(char) tests if a char is a letter.)
    */

    public static String notReplace(String str) {
//        char[] charArray = str.toCharArray();
//        String newString = "is";
//        for(int i=0; i<str.length()-2; i++){
//            String t = str.substring(i, i+2);
//            if(t.equals("is")){
//                if(i==0){
//                    str.replace()
//                }
//            }
//            System.out.println(t);
//        }
        return "xx";
    }







}
