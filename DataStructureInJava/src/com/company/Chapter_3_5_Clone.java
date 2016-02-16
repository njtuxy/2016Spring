package com.company;

/**
 *  Demos for chapter 3.5 Array and List clone
 *  @author Yan Xia
 *  Created on 2/15/16.
 */

public class Chapter_3_5_Clone {

    /**
     *  Function to deep clone an array to another.
     *  @param original the original 2d integer array
     *  @return the array clone
     */
    public static int[][]  deepArrayClone(int[][] original){
        int[][] output = new int[original.length][];        //Create a new 2d array to store the clone values

        for(int i=0; i<original.length; i++){                  //Iterate over the original array, and clone it value to the output array one element by another.
            output[i] = original[i].clone();
        }

        return output;
    }

    public static String fontTimes(String input, int n){
        StringBuffer sb = new StringBuffer();
        if(input.length()<3){
            for(int i=0; i<n; i++){
                sb.append(input);
            }
        }else{
            String t = input.substring(0,3);
            System.out.println(t);
            for(int i=0; i<n; i++){
                sb.append(t);
            }
        }
        return sb.toString();
    }


}
