package com.company;

import java.util.Arrays;

/**
 * Created by yanxia on 2/26/16.
 */
public class Interview {

    public static int[] arrayPlusNumber(int[] array, int num){
        //convert array to a number:
        int arrayNumber = convertArrayToNumber(array);
        return convertNumberToArray(num + arrayNumber, array.length);
    }

    public static int convertArrayToNumber(int[] array){
        int result;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i< array.length; i++){
            sb.append(array[i]);
        }
        return Integer.parseInt(sb.toString());
    }

    public static int[] convertNumberToArray(int number, int arrayLength){
        String temp = String.valueOf(number);
        int[] result = null;
        if(arrayLength > temp.length()){
            result = new int[arrayLength];
            for(int i=temp.length()-1; i>=0; i--){
                int index = arrayLength-1;
                result[index] = Integer.parseInt(String.valueOf(temp.charAt(i)));
                index--;
            }
        }else{
            result = new int[temp.length()];
            for(int i=0; i<result.length; i++){
                result[i] = Integer.parseInt(String.valueOf(temp.charAt(i)));
            }

        }


        return result;
    }


}
