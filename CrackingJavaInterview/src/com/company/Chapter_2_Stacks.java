package com.company;

import java.util.ArrayList;

/**
 * Created by yanxia on 2/18/16.
 */
public class Chapter_2_Stacks {

}

/*A Stack has these functions:
*  Push()
 * Pop()
 * Size()
 */

class StackDemo<E>  {
    ArrayList<E> arrayList = new ArrayList<E>();

    void push(E e){
        arrayList.add(e);
    }

    E pop(){
        if (empty())
            return null;
        else{
            return arrayList.remove(arrayList.size()-1);
        }
    }

    boolean empty(){
        return arrayList.size() == 0;
    }

    int size(){
        return arrayList.size();
    }
}
