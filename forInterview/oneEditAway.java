import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 
 * If you need more classes, simply define them inline.
 */

class Solution {
  public static void main(String[] args) {
    System.out.println(oneCharAway("abc", "ee"));

  }
  
  public static boolean oneCharAway(String a, String b){

    int al = a.length();
    int bl = b.length();
    
    
    if(a=="" || b=="")
      return false;

    if(Math.abs(al-bl)>1)
      return false;
    
    if(al == bl)
      return oneReplaceAway(a, b);
    if(al<bl)
      return oneInsertAway(a, b);
    else
      return oneInsertAway(b, a);
    
  }
  
  //
  public static boolean oneInsertAway(String shorter, String longer ){
    int index1 = 0;
    int index2 = 0;
    boolean foundDifference = false;
    while(index1<shorter.length() && index2 < longer.length()){
      if(shorter.charAt(index1) != longer.charAt(index2)){
        if(foundDifference){
          return false;
        }
        foundDifference = true;
        index2++;
      }else{
        index1++;
        index2++;
      }
    }

    return true;
  }
  
  
  public static boolean oneReplaceAway(String inputA, String inputB){
    
    boolean foundDifference = false;
    
    for(int i=0; i<inputA.length(); i++){
      if(inputA.charAt(i) != inputB.charAt(i)){
        if(foundDifference)
          return false;
      }else{
        foundDifference = true;
      }      
    }
    
    return true;
    
  }
  
}