package com.company;

/**
 * Created by yanxia on 2/15/16.
 */
public class Medium_Level_String {

    /**
     * Return true if the string 'cat' and 'dog' appear the same number of times in the given string
     */
    
    public static boolean catDog(String str){
        int catCount = 0;
        int dogCount = 0;
        for(int i=0; i<str.length()-2; i+=3){                                   //iterate over the string, step 3 characters every time.
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
    **/
    public static boolean xyzThere(String str) {

        //if the given string is shorter than 3, returns false.
        if (str.length()<3)
            return false;


        for(int i=str.length()-1; i>0; i--){
            if(str.substring(i-2, i+1).equals("xyz")){
                if(i-3>=0)
                    if(!str.substring(i-3).equals('.'))
                        return true;
            }
        }
        return false;

    }


}
