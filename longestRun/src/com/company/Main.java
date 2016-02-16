package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int indexOfLongestRun(String str) {

        if(str.length() == 0 || str.length() == 1){
            return 0;
        }

        char[] charArray = str.toCharArray();

        char lastOne = charArray[0];
        int count = 1;
        int longestRun = 1;
        int index = 0;

        for(int i=1; i<charArray.length; i++){
            if(charArray[i] == lastOne){
                count ++;
                if (count > longestRun) {
                    longestRun = count;
                    index = i;
                }
            }else{
                lastOne = charArray[i];
                count = 1;
            }
        }

        return index-longestRun+1;

    }

    public static void debug(String input){
        System.out.println(input);
    }

    public static void debug(int input){
        System.out.println(input);
    }


}

