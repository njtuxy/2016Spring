package com.company;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;
import java.util.Map.Entry;

/**
 * Created by yanxia on 2/29/16.
 */
public class Matrix {

    /**
     * Interview question: https://careercup.com/question?id=5174694727647232
     */

    public int[][] sortedMatrix(int[][] input){

        TreeSet<Integer> treeSet = new TreeSet<Integer>();

        //Read all values into a treeSet, to order them.
        for(int i=0; i<input.length; i++){
            for(int j=0; j<input[i].length; j++){
                treeSet.add(input[i][j]);
            }
        }

        int[][] result = new int[input.length][input[0].length];

        Iterator<Integer> iterator = treeSet.iterator();
        int i=0;
        int j=0;

        while(iterator.hasNext()){
            result[i][j] = iterator.next();
            i++;
            j++;

        }



                return  null;

    }
}
