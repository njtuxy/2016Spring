package com.company;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created by yanxia on 3/1/16.
 */
public class StringDemos {

    /**
     *  isomorphic
     */

    public static boolean isIosmorphic(String  s, String t){
        if(s.length() != t.length())
            return false;

        HashMap<Character, Character> sTable = new HashMap<Character, Character>();
        HashMap<Character, Character> tTable = new HashMap<Character, Character>();

        for(int i=0; i<s.length(); i++){
            char char1 = s.charAt(i);
            char char2 = t.charAt(i);

            if(sTable.get(char1) == null && tTable.get(char2) == null){
                System.out.println("DEBUG1:      " + char1);
                sTable.put(char1, char2);
                tTable.put(char2, char1);
            }else {

                System.out.println("DEBUG2:      " + char1 + "  " + char2);
                System.out.println(sTable.toString());
                System.out.println(tTable.toString());

                if(sTable.get(char1) == null){
                    System.out.println("DEBUG 2.1:      " + char1 + "  " + char2);
                    return tTable.get(char2) == char1;
                }

                if(tTable.get(char2) == null){
                    System.out.println("DEBUG 2.2:      " + char1  + "  " + char2);
                    return sTable.get(char1) == char2;
                }

                System.out.println("DEBUG 2.3:      " + char1 + "  " + char2);
                System.out.println("DEBUG 2.3.1:      " + sTable.get(char1) + "  " + tTable.get(char2));
                if (sTable.get(char1) == char2 && tTable.get(char2) == char1){
                    continue;
                }
            }
        }
        return true;
    }
}
