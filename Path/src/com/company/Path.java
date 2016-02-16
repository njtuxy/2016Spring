package com.company;

import jdk.nashorn.internal.runtime.Debug;

import java.util.Arrays;
import java.util.Objects;
import java.util.Stack;

public class Path {

    private String path;
    private Stack<String> currentPathStack;
    private String[] cdPathArray;

    public Path(String path) {
        this.path = path;
        storeCurrentPathToStack(path);
    }

    public String getPath() {
        return path;
    }

//Store the current path in a stack, each stack node will store one layer.
    public void storeCurrentPathToStack(String path){
        //Prepare a stack:
        //Read value of this.path
        String[] s = path.split("/");
        currentPathStack = new Stack<String>();

        for(int i=1; i<s.length; i++){
            currentPathStack.push(s[i]);
        }

    }

    public Path cd(String newPath){
        cdPathArray = newPath.split("/");

        return generateNewPath(currentPathStack, cdPathArray);

    }

    private Path generateNewPath(Stack currentPathStack, String[] cdPathArray){

        for(int i=0; i< cdPathArray.length; i++){
            String temp = cdPathArray[i];
            if(temp.equals( "..")){
                currentPathStack.pop();
            }else{
                currentPathStack.push(temp);
            }
        }


        String output = "";
        for(Object e:currentPathStack){
            output+= "/" + e.toString();
        }

        return new Path(output);
    }

    public void debug(String input){
        System.out.println(input);
    }
}