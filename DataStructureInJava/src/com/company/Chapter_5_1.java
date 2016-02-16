package com.company;

/**
 * Created by yanxia on 2/15/16.
 */
public class Chapter_5_1 {
    /**
     * Basic recursion:
     */

    public static int factorial(int n) throws IllegalArgumentException{
        if(n<0)
            throw new IllegalArgumentException("input value must be bigger than 0");
        else if(n==0)
            return 1;
        else
            return n*factorial(n-1);
    }

    /**
     * Binary search:
     * Returns true if the target value is found in the indicated portion of the data array.
     * This search only considers the array portion from data[low] to data[high] inclusive.
     */

    public static boolean binarySearch(int[] data, int target, int low, int high){
        if (low>high)
                return false;
        else{
            int mid = (low+high)/2;
            if(target == data[mid])
                return true;                                                    //found a match
            else if(target > data[mid]){
                binarySearch(data, target, mid+1, high);        //recur left of the middle
            }else{
                binarySearch(data, target, low, mid-1);            //recur right of the middle
            }
        }

        return false;
    }

}
