package com.company;
import java.util.*;
/**
 * Created by yanxia on 2/12/16.
 */
public class BetterProgrammerTask {
    public static Set<Object> getIntersection(Set<Object> a, Set<Object> b) {
        /*
          Please implement this method to
          return a Set equal to the intersection of the parameter Sets
          The method should not change the content of the parameters.
         */
        Set<Object> intersection = new HashSet<Object>(a);
        intersection.retainAll(b);
        return intersection;
    }

}
