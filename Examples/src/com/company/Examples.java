package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Created by yanxia on 2/12/16.
 */
public  class Examples {
    //--------METHODS:
    public static void binarySearchExample(){
        // initializing unsorted int array
        int intArr[] = {30,20,5,12,55};
        Arrays.sort(intArr);

        //Print all elements in intArr:
        for(int e:intArr){
//            System.out.println(e);
        }
        int searchVal = 12;
        int val = Arrays.binarySearch( intArr, searchVal);
        System.out.print("the index of the value to be found is: " + val);
    }

    public static void arrayListAddAllExample(){
        List list = Arrays.asList(new String[] {"a", "b", "c", "d", "e"});
        List list1 = Arrays.asList(new String[]{"xx", "yy", "zz"});
        list.addAll(list1);

//        for( Object e:list){
//            System.out.println(e.toString());
//        }
//
//        for( Object e:list){
//            System.out.println(e.toString());
//        }
    }

    public static String stringTimes(String str, int n) {
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<n; i++){
            sb.append(str);
        }
        return sb.toString();
    }

    public String doubleChar(String str) {
        char[] ch = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<ch.length; i++){
            sb.append(ch[i]).append(ch[i]);
        }

        return sb.toString();
    }

    public int countHi(String str) {
        int count = 0;
        for(int i=0; i<str.length()-1; i++){
            if(str.substring(i,i+2).equals("hi")){
                count++;
            }
        }
        return count;
    }

    public static boolean catDog(String str) {
        int dogCount = 0;
        int catCount = 0;
        for(int i=0; i<str.length()-3; i++){
            if (str.substring(i, i + 3).equals("cat")) {
                catCount ++;
            }
            if (str.substring(i, i + 3).equals("dog")) {
                dogCount++;
            }
        }

        return dogCount==catCount;
    }





}
