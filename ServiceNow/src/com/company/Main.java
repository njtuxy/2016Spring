package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        boolean[] char_set = new boolean[128];
//        int[] char_set2 = new int[128];
//        "ab".length();
//
//
//
//
//
//        char_set['a'] = true;
//        char_set['c'] = true;
//
//        int a  = Character.getNumericValue('a');
//        int z  = Character.getNumericValue('z');
//
//
//
//        System.out.println(Arrays.toString(char_set));
//        System.out.println(Arrays.toString(char_set2));


        String s = "A very long string containing " +
                "many many words and characters. " +
                "Newlines will be entered at spaces.";

        StringBuilder sb = new StringBuilder(s);

        int i = 0;
        while ((i = sb.indexOf(" ", i + 30)) != -1) {
            sb.replace(i, i + 1, "\n");
        }

        System.out.println(sb.toString());

    }

//
//    public static boolean sameCharCount(String a, String b){
//
//        if(a.length() != b.length())
//            return false;
//
//        int[] counter = new int[128];
//
//        for(int i=0; i<a.length(); i++){
//            counter[a.charAt(i)]++;
//        }
//
//        for(int i=0; i<b.length(); i++){
//            int temp = (int)b.charAt(i);
//            counter[temp]--;
//            if(counter[temp] < 0){
//                return false;
//            }
//        }
//
//        return true;
//    }
//
//    public static int countXYZ(String input){
////        String t = input.toLowerCase();
//        int i=0;
//        input.indexOf();
//        int counter=0;
//        while(i<=input.length()-1){
//            char t =input.charAt(i);
//            boolean b = Character.isLetter(input.charAt(i));
//            if(t=='z' || t=='y'){
//                if(i==input.length()-1 ||  b){
//                    counter++;
//                }
//            }
//
//        }
//
//        return counter;
//
//    }
//
//}
