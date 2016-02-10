package com.company;

import java.util.Arrays;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static Boolean areAnagrams(String input, String input2){

        Boolean output = null;

        TreeSet<Character> t1 = new TreeSet<Character>();
        TreeSet<Character> t2 = new TreeSet<Character>();

        if(input.length() != input2.length()){
            output = false;
            return false;
        }

        if(input.length() == 0){
            return false;
        };

        for(int i=0; i<input.length(); i++){
            t1.add(input.charAt(i));
            t2.add(input2.charAt(i));
        }

        return Arrays.equals( t1.toArray(), t2.toArray());
    }
}
