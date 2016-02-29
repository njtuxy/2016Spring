package com.company;

/**
 * Created by yanxia on 2/29/16.
 */
public class BinarySearch{


    public static void main(String arg[]) {

    }

    public static boolean doBinarySearch(int[] input, int findMe){
        int right = input.length-1;
        int left = 0;

        while (left <= right){
            int mid = (right+left)/2;
            if(findMe == input[mid]){
                return true;
            }

            if(findMe < input[mid]) {
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return false;
    }



}
