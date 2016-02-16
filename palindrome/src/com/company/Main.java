package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean isPalindrome(String str) {
        Boolean output = null;

        if(str.length() ==0 || str.length() == 1){
            return output = true;
        }

        String clean = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String head = null, tail= null;
        int length = clean.length();
        if(length %2  == 0){
             head = clean.substring(length/2);
             tail = clean.substring(0, length/2);
        }else{
             head   = clean.substring((length+1)/2);
             tail = clean.substring(0, (length-1)/2);
        }

        if(new StringBuilder(head).reverse().toString().equals(tail) ){
            return true;
        }else{
            return false;
        }
    }


}
