package com.company;

import java.util.TreeMap;
import java.util.SortedMap;

public class Main {

    public static int[] findTwoSum(int[] list, int sum) {

        int[] output = null;

        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();

        for(int i = 0; i< list.length; i++) {
            treeMap.put(list[i], i);
        }

        for(int i=0; i<list.length; i++){
            int temp = list[i];
            SortedMap sortedMap = treeMap.subMap(sum-temp, sum-temp+1);
            if(sortedMap.size() > 0){
                output = new int[2];
                output[0] = i;
                output[1] = treeMap.get(sum-temp);
                break;
            }
        }

        if(output != null){
            return output;
        }else{
            return null;
        }
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 1, 3, 5, 7, 9 }, 12);
        System.out.println(indices[0] + " " + indices[1]);
    }

    public static void debug(int input){
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(input);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    }

}
