/**
 * Created by yanxia on 3/7/16.
 */
public class PlaindromicSubString {

    public static String findLongestPlaindromicSubString(String input){

        if(input.isEmpty())
            return null;

        if(input.length() == 1)
            return input;

        String longest = input.substring(0, 1); //get first character;

        for(int i=0; i<input.length(); i++) {
            String tmp = helper(input, i, i);

            if (tmp.length() > longest.length()) {
                longest = tmp;
            }

            tmp = helper(input, i, i + 1);

            if (tmp.length() > longest.length()) {
                longest = tmp;
            }
        }

        return longest;
    }

    //get the longest palindrome subString from startIndex to both sides.
    public static String helper(String s, int leftPointer, int rightPointer){
//        int l_startIndex = startIndex;
//        int l_endIndex = endIndex;
        while(leftPointer>=0 && rightPointer<=s.length()-1 && s.charAt(leftPointer) == s.charAt(rightPointer)){
            leftPointer--;
            rightPointer++;
        }
        return s.substring(leftPointer+1, rightPointer);
    }

    public static boolean isPlaindromic(String s){
        int startIndex = (s.length()-1)/2;
        int endIndx = s.length()/2;
        while(startIndex>=0 && endIndx<=s.length()-1 && s.charAt(startIndex) == s.charAt(endIndx)){
            startIndex--;
            endIndx++;
        }
        return s.substring(startIndex+1, endIndx).equals(s);
    }
}
