package com.company;

/**
 * Created by yanxia on 2/15/16.
 */

public class Medium_Level_String {

    /**
     * Return true if the string 'cat' and 'dog' appear the same number of times in the given string
     * PASSED!
     */

    public static boolean catDog(String str){
        int catCount = 0;
        int dogCount = 0;
        for(int i=0; i<str.length()-2; i++){                                   //iterate over the string, step 3 characters every time.
            String temp = str.substring(i, i+3);                              //store the substring in a temporary variable.
            if(temp.equals("cat"))                                                  //add cat count if 'cat' found
                catCount ++;
            else if(temp.equals("dog"))                                        //add dog count if 'dog' found
                dogCount++;
        }
        return catCount == dogCount;                                      //return true if dog count equals cat count, otherwise returns false
    }

    /*
    *Given two strings, return true if either of the strings appears at the very end of the other string,
     *  ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
     *  Note: str.toLowerCase() returns the lowercase version of a string.
     *  * PASSED!
     */
    public static boolean endOther(String a, String b) {
        if (a.equals("")  || b.equals(""))
            return true;
        else{
            int alen = a.length();
            int blen = b.length();
            if(alen < blen){
                //Try to find a at the end of b
                return b.substring(blen-alen, blen).toLowerCase().equals(a.toLowerCase());
            }else{
                return a.substring(alen-blen, alen).toLowerCase().equals(b.toLowerCase());
            }
        }
    }

    /*
    * Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.).
    * So "xxyz" counts but "x.xyz" does not.
    * NOT PASSING!
    **/
    public static boolean xyzThere(String str) {

        //if the given string is shorter than 3, returns false.
        if (str.length()<3)
            return false;
        for(int i=str.length()-1; i>0; i--){
            if(i-2>=0){                         //
                System.out.println(str.substring(i-2, i+1));
                if(str.substring(i-2, i+1).equals("xyz")){
                    System.out.println("got one xyz!");
                    System.out.println(i);
                    //If there is more chars before "xyz"
                    if((i-3>=0) && !(str.charAt(i-3)=='.')){
                        System.out.println(str.charAt(i-3));
                        System.out.println("it is not a dot!");
                            return true;
                    } else if(i-3<=0){
                        return true;
                    }
                 }
            }
        }
        return false;

    }

    /*
    * Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
    * PASSED!
    **/
    public static boolean bobThere(String str) {
        if( str.length() < 3)
            return false;
        else{
            for(int i=0; i< str.length()-2; i++){
                if(str.charAt(i) == 'b'){
                    if(str.charAt(i+2) == 'b')
                        return true;
                }
            }
        }

        return false;
    }

    /*
    * We'll say that a String is xy-balanced if for all the 'x' chars in the string,there exists a 'y' char somewhere later in the string.
    * So "xxy" is balanced,but "xyx" is not.
      * One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.
      * PASSED!
    */
    public static boolean xyBalance(String str) {
        int indexOfFirstYFromEnd = -1;
        boolean foundY = false;
        boolean foundX = false;
        boolean foundXAfterY = false;

        for(int i=str.length()-1; i>0; i--){
            //Iterate from the end of the string, and try to find the fist 'y'
            if(str.charAt(i) == 'y'){
                foundY = true;
                //when find a char 'y', save the index number of it.
                indexOfFirstYFromEnd = i;
                //quit the loop since we don't need to find the second 'y' from the back.
                break;
            }
        }

        if(foundY){
            for(int j=indexOfFirstYFromEnd + 1; j<str.length(); j++){
                if(str.charAt(j) == 'x'){
                    return  false;
                }
            }
            return true;
        }else{
            for(int i= 0; i< str.length(); i++){
                //Iterate from the end of the string, and try to find 'x'
                if(str.charAt(i) == 'x'){
                    return false;
                }
            }
            return true;
        }
    }


    /*
    * Given two strings, a and b, create a bigger string made of the first char of a, the first char of b,
    * the second char of a, the second char of b, and so on.
    * Any leftover chars go at the end of the result.
    * PASSING!!
    */

    public static String mixString(String a, String b) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i< a.length(); i++){
            sb.append(a.charAt(i));
            if(i<b.length())
                sb.append(b.charAt(i));
        }

        if(a.length() >= b.length()){
            return sb.toString();
        }else{
            return sb.append(b.substring(a.length(), b.length())).toString();
        }
    }

    /*
    * Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
    * You may assume that n is between 0 and the length of the string, inclusive.
    *
    **/

    public static String repeatEnd(String str, int n) {
        StringBuilder sb = new StringBuilder();
        if(n==0) return "";
        String pattern = str.substring(str.length()-n, str.length());
        for(int i=0; i<n; i++){
            sb.append(pattern);
        }
        return sb.toString();
    }

    /*
    * Given a string and an int n, return a string made of the first n characters of the string,
    * followed by the first n-1 characters of the string, and so on.
    * You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).
    *
    */

    public static String repeatFront(String str, int n) {
        StringBuilder sb = new StringBuilder();

        if(n==0) return "";
        String pattern = str.substring(0, n);

        for(int i=pattern.length(); i>0; i--){
            sb.append(pattern.substring(0, i));
        }

        return sb.toString();

    }

    /*
    * Given two strings, word and a separator sep, return a big string made of count
    * occurrences of the word, separated by the separator string.
    * PASSED!
    */

    public static String repeatSeparator(String word, String sep, int count) {
        if(count == 0) return "";
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<count-1; i++){
            sb.append(word);
            sb.append(sep);
        }
        sb.append(word);
        return sb.toString();
    }
}

