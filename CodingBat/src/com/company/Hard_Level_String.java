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

}
